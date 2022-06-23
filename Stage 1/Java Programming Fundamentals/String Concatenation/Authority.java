import java.util.*;

public class Authority{
    public static boolean isAlpha(String s){
        for (char c : s.toCharArray()) {
            if (!Character.isSpaceChar(c) && !Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.print("Inmate's name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine()+" ";
        System.out.print("\nInmate's father's name:");
        String fatherName = sc.nextLine();
        if(isAlpha(name) && isAlpha(fatherName)){
            System.out.println("\n"+name.concat(fatherName));
        }
        else{
            System.out.println("Invalid name");
        }
    }
}