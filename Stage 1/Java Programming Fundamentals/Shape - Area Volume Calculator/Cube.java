public class Cube extends Shape implements Spatial{
    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (2*length*width+2*width*height+2*length*height);
    }

    @Override
    public double volume() {
        return length*width*height;
    }
}
