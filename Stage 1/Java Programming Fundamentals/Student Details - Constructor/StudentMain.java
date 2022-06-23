import java.util.*;

public class StudentMain{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        String isNit;
        System.out.println("Whether the student is from NIT(Yes/No):");
        isNit = sc.nextLine();
        while(isNit.toLowerCase() != "yes" || isNit.toLowerCase() != "no"){
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            isNit = sc.nextLine();
        }
        if(isNit.toLowerCase()=="no"){
            System.out.println("College Name:");
            String collegeName = sc.nextLine();
            Student st = new Student(studentId,name,address,collegeName);
            System.out.println("Student id:"+st.getStudentId()+"\nStudent name:"+st.getStudentName()+"\nAddress:"+st.getStudentAddress()+"College name"+st.getCollegeName());
        }
        else{
            Student st = new Student(studentId,name,address);
            System.out.println("Student id:"+st.getStudentId()+"\nStudent name:"+st.getStudentName()+"\nAddress:"+st.getStudentAddress()+"College name"+st.getCollegeName());
        }
    }
}