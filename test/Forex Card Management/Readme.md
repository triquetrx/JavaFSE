I.	BUSINESS SCENARIO

A leading bank in the country wants to better their Forex card service for their customers to mobilize funds and to reduce the number of defaulters. They also plan to reward those customers who pay their monthly dues on time with discounts on their dues. The bank plans to add a module to their automated system for this purpose.

Details of the Forex card dues are stored in a .txt file (as a comma separated fields). This file contains the details/records of the Forex card dues of all categories. The discount is applicable for only those customers who pay their dues at least 5 days in advance with respect to their due date.

The proposed system is supposed to pick up the customer’s Forex card details, who pay their dues in advance and the revised payable amount is calculated based on the business policies defined in the specifications given below. After the discounted payable amount is calculated, the system needs to persist those records in the database.


II.	Functional Requirement Specification:
Req. #	Req. Name	Req. Description
1	Parse Input	The input file has to be parsed and Customer’s Forex card due Records need to be filtered based on the Date of Payment.
2	Update the payable amount and persist the data in the database	The Customer’s discounted payable amount has to be calculated and then the modified records need to be saved in the database.


III.	Technical Requirements
For both the functional requirements 1 and 2, component specification and method specification are given below. Please follow the same order to implement them using the code skeleton.

(1)	A. Component Specification:

Requirement Name	1.	Parse Input
Component Definition	Reads the input text file, and convert the data into objects
Files Included
(refer Skeleton)	ForexCardPaymentService.java, ApplicationUtil.java, ForexCardDetails.java, Inputfeed.txt,
ForexCardPaymentException.java
Responsibilities	Reads the input file, does validation to check if the record is with the dateOfPayment lesser than the 
dueDate, builds the ForexCardDetails value object and returns it
Design Constraints	a.	Input file format is .txt and is comma separated (Sample rows are added. You can add any number of 
rows to test your service class, from main method.
b.	Do not hard code the input file path inside any method – has to be used from the input argument 
only as per code skeleton.
c.	File Structure is like mentioned below:
<forexCardNo>,<forexCardId>,<customerId>,<customerName>,<forexCardType>,<payableAmount>,<dueDate>,<actualPaymentDate>,<forexCardLimit>
d.	In the input feed, filter ForexCardDetails records which have the actualPaymentDate lesser than dueDate 
by 5 days and more. You can identify the records by comparing the dates.
e.	Assume that currencies are in INR
f.	Assume that the Date fields in the file will be in the format yyyy-MM-dd.
g.	Do not change the data types of the value object given in POJO.
h.	Always convert the date field’s value to java.util.date with format, yyyy-MM-dd before 
setting in ForexCardDetails value object.
i.	Use ApplicationUtil.java for reading file, performing date operations, etc.
Resources	inputfeed.txt is the input file that must be parsed. The file, along with file location will be sent as 
an argument to the ForexCardPaymentService.addForexCardPytDetails() method. File location/path 
must not be hardcoded
Process Flow	a.	The app will be invoked by calling the ForexCardPaymentService.addForexCardPytDetails () with the 
inputFeed (.txt file).
b.	Read the file using File I/O or Java Streams in ApplicationUtil
c.	readFile returns List <String> of records, that were read from the file; It should filter  only records 
where the payment date is less than due date and returns these records.(with each records’ s fields 
separated by comma)
d.	Code the method ForexCardPaymentService.buildForexCardPaymentList () pass the output of the
 readFile method to this method as arg.
e.	In the method ForexCardPaymentService.buildForexCardPaymentList () read the list returned by readFile method, split the records based on comma separator and return the ArrayList of records of ForexCardDetails.
f.	Use the ApplicationUtil. convertStringToDate method to convert the date from String Format to 
java.util.Date format (yyyy-MM-dd).
g.	Build the ForexCardDetails value Object from the values obtained in every line (Check the Input file format 
in Design Constraints row)

Exceptional Conditions	While doing File I/O in the ApplicationUtil.readFile method, catch all exceptions and throw application specific 
exception, ForexCardPaymentException.

(1)	B. Method Specification:
ClassName	Method Name	Input Parameters	Output Parameters
ForexCardPaymentService	addForexCardPytDetails()
	String inputFeed	boolean
ApplicationUtil	readFile()	String inputfeed	static List<String>
ForexCardPaymentService	buildForexCardPaymenttList()	List <String>forexCardPytRecords	ArrayList<ForexCardDetails>
ApplicationUtil	stringToDateConverter	String stringDate	java.util.Date


(2)	A. Component Specification:


Requirement Name	2.	Persist Data into Database
Component Definition	Helps to calculate the discounted installment and add the changes made to the database.
Files Included
(refer Skeleton)	ForexCardPaymentService.java, ApplicationUtil.java, ForexCardDetails.java,ForexCardPaymentException.java,DBConnectionManager.java, 
Responsibilities	Updates ForexCardDetails record’s revisedpayableAmount, based on Forex Card Type and Forex Card Limit. Persists all payment details to the database.
Design Constraints	a.	The database.properties has connection details required to connect to the backend
b.	Do not change the keys of the property files, you can update the values based on the local database settings. For example, do not change the key, db.username. Rather you can have any value as user name based on local settings.
c.	Use only JDBC to establish Database connection
d.	Assume the location of the property file will be always as given in the skeleton.
e.	Don’t Hardcode the connection string to establish database connection. Read it from the property files.
f.	Use Prepared Statement to insert records
g.	Close all the resources after use
h.	Catch all database related exception and throw Application specific exception only from DAO or from DBConnectionManager class. There has to be a private constructor in the DBConnectionManager class, to load the database property file and to establish a database connection using JDBC
i.	Rollback the Insert if any SQL exception has occurred. Throw application specific exception, ForexCardPaymentException.
j.	Revise the payable amount based on the constraints in the table given below
k.	Formula to calculate the amount = payableAmount – (percentage/100)*payableAmount

Forex Card Type	Forex Card Limit	Discount
Multicurrency ForexPlus Card	100000 - 250000	10%
Multicurrency ForexPlus Card	250001 - 500000	15%
Multicurrency ForexPlus Card	>500000	20%
ISIC Student ForexPlusCard	50000 - 100000	15%
ISIC Student ForexPlusCard	100001 - 500000	20%
ISIC Student ForexPlusCard	500001 - 1000000	25%
Hajj Umrah Card	10000 - 50000	20%
Hajj Umrah Card	50001 - 100000	25%
Hajj Umrah Card	>100000	30%

Resources	database.properties – has connection details, used to establish database connection.
Process Flow	a.	Modify the ForexCardPaymentService.buildForexCardPaymentList() method (refer the above section) then set revisedpayableAmount to ForexCardDetails objects.
b.	Use ForexCardPaymentService.calculateDiscountedPayableAmt() method to calculate revisedpayableAmount to the currentpayableAmount passed as parameter, based on ForexCardType and ForexCardLimit.
d.	The method ForexCardPaymentService.buildForexCardPaymentList()   must return the list of ForexCardDetails objects with revisedpayableAmount calculated
e.	After reading the file, building records as List<ForexCardDetails>, call the ForexCardDAO. insertForexCardPyt method to insert values to the database. You may have to convert the java.util.date to java.sql.date before storing to the database.

e.	If Insert has happened successfully, return true; otherwise false..
Exceptional Conditions	While working with DAO methods, catch all exceptions and throw application specific exception, ForexCardPaymentException.


2	B. Method Specification:
ClassName	Method Name	Input Parameters	Output Parameters
ForexCardPaymentService	calculateDiscountedPayableAmt()	String forexCardType,double forexCardLimit,double payableAmt	double
ForexCardPaymentService	buildForexCardPaymentList	List <String>forexCardPytRecords	ArrayList<ForexCardDetails>
DBConnectionManager	DBConnectionManager()	NA	NA
DBConnectionManager	get Instance()	NA	DBConnectionManager 
ForexCardDAO	insertForexCardPyt	ArrayList<ForexCardDetails>forexCardPyts	boolean
Note:You are allowed to modify input file text to incorporate more test data for various test scenarios / boundary conditions. Test your application by invoking the service methods from the main class, main () method. Follow Java Naming Conventions, test the code quality by running PMD rules in Eclipse or any other IDE that you use.




Sample Output Data:

CC01,CY001,F4756890742790005,Jobish,Multicurrency ForexPlus Card,20300,2020-01-23,2020-01-10,,75000
CC02,CY261,F4276890742790009,Praseetha,ISIC Student ForexPlusCard,22000,2020-01-20,2020-01-15,,75000
CC03,CY349,F6439790770790005,Aaradhana,Hajj Umrah Card,672000,2020-01-19,2020-01-12,,1750000
CC04,CY153,F5056890742790005,Sree,Hajj Umrah Card,79000,2020-01-09,2020-01-02,,250000
CC05,CY795,F4756890742790005,Varun,Multicurrency ForexPlus Card,86000,2020-01-23,2020-01-16,,125000
CC06,CY650,F4276689074279005,Dhawan,ISIC Student ForexPlusCard,17300,2020-01-15,2020-01-09,,40000
CC07,CY371,F6439890742790005,Charvik,Hajj Umrah Card,230000,2020-01-12,2020-01-05,,400000
CC08,CY994,F5056890742790005,Dhanveer,ISIC Student ForexPlusCard,225000,2020-01-20,2020-01-11,,750000
CC09,CY795,F4756890742790005,Jack,Multicurrency ForexPlus Card,86000,2020-01-23,2020-01-16,,195000
