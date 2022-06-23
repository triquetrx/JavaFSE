public class Sphere extends Shape implements Spatial{

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double volume() {
        return (4*Math.PI*radius*radius*radius)/3;
    }
}
