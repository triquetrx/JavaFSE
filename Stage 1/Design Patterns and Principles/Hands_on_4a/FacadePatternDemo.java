package Handson.Hands_on_4a;

public class FacadePatternDemo{
    public static void main(String[] args) throws InterruptedException {
        ShapeMaker shapeMaker = new ShapeMaker();
        Runnable r1 = ()-> {
            Thread.currentThread().setName("Lambda Expressions");
            System.out.println(Thread.currentThread().getName());
        };
        new Thread(r1).start();
        System.out.println(Thread.currentThread().getName());
        shapeMaker.drawCirce();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
