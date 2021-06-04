
import java.util.Scanner;
public class TestTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Triangle tri = new Triangle();
        tri.setSide1(input.nextDouble());
        tri.setSide2(input.nextDouble());
        tri.setSide3(input.nextDouble());
        tri.setColor(input.nextLine());
        tri.setFilled(input.nextBoolean());
        System.out.print(tri.toString());
    }
}
