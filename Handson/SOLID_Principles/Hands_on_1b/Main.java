package Handson.SOLID_Principles.Hands_on_1b;

public class Main {
    public static void main(String[] args) {
        SamsungNote samsungNote = new SamsungNote();
        System.out.println("Samsung Phone: "+samsungNote.getPhonePart1()+" "+samsungNote.getPart1Cost());
        Redmi7 redmi7 = new Redmi7();
        System.out.println("Redmi Phone: "+redmi7.getPhonePart1()+" "+redmi7.getPart1Cost());
    }
}
