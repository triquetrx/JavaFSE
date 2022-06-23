public class Student{
    protected int studentId,departmentId;
    protected String name,gender,phone;
    
    public int getStudentId(){
        return studentId;
    }
    
    public int getDepartmentId(){
        return departmentId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
}