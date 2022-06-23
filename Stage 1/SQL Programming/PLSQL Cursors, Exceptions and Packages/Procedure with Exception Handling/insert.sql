create or replace procedure CHECK_AGE_ELIGIBILITY
(
    v_id in employee.empid%type,
    v_name IN EMPLOYEE.EMPNAME%TYPE,
    v_age IN EMPLOYEE.AGE%TYPE
)
as
age_invalid exception;
BEGIN
    if (v_age<18) then 
        raise age_invalid;
    else
        insert into employee(empid,empname,age) 
        values (v_id,v_name,v_age);
        dbms_output.put_line('Age valid - Record inserted');
    end if;
        
    
    
    exception
        when age_invalid then 
            dbms_output.put_line('Age invalid - Record not inserted');
        when others then 
            dbms_output.put_line('Oops something wrong I can feel it');
    
END;
/