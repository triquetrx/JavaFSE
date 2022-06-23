set serveroutput on
DECLARE

BEGIN
    dbms_output.put_line('Department Names are :');
    for rec_dep in (select * from department order by department_name)
    LOOP
        dbms_output.put_line(rec_dep.department_name);
    END LOOP;
END;
/