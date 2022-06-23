class Employee 
{
//fill code here
    constructor(name,designation,year_of_experience){
        this.name=name;
        this.designation=designation;
        this.year_of_experience=year_of_experience;
    }
}

function displayEmployee(name,designation,year_of_experience){
    emp=createEmployee(name,designation,year_of_experience);
    return validateObject(emp);
}

function createEmployee(name, designation, year_of_experience)
{
//fill code here
    employee= new Employee(name,designation,year_of_experience);
    return employee;
}

function validateObject(employee)
{
//fill code here
    str="";
    if(employee instanceof Object){
        var date=new Date();
        var year=2022-(employee.year_of_experience);
        str=employee.name+" is serving the position of "+employee.designation+" since "+year;
        return str;
    }
}
