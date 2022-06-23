DECLARE
    department_id Department.department_id%type;
    department_name varchar2(25) := 'TESTING';
    location_id varchar2(15) := 'CHN-102';
    
BEGIN
    -- the below line is used to do department_id := max(department_id)+10;
    select max(department_id) + 10 into department_id from Department;
    insert into Department (department_id,department_name,location_id)
    values (department_id,department_name,location_id);
END;
/