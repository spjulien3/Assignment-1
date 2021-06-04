
public class Triangle extends SimpleGeometricObject {
    private double side1,side2,side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1 + side2 +side3;
    }
    public double getArea(){
        double s = (side1+side2+side3)/2;

        return Math.sqrt((s-side1)*(s-side2)*(s-side3));
    }
    public String toString(){
        return "The area is: "+getArea()+"\nThe perimeter is: "+getPerimeter()+"\nThe color is: "+getColor()+"\nTriangle is filled: "+isFilled()+"\ncreated on: "+super.getDateCreated();
    }
}
