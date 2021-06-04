
import java.text.DecimalFormat;

public class Rectangle {
    private double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static double getArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public static double getPerimeter(double width, double height) {
        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }

    public String toString() {
        DecimalFormat f =new DecimalFormat("###.000");
    return"The area is: "+ f.format(getArea( width, height))+" The Perimeter is: " +f.format(getPerimeter( width, height));
}
}
