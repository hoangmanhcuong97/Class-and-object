import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width:");
        double width = sc.nextDouble();

        System.out.print("Enter the height:");
        double height = sc.nextDouble();

        Rectangle hcn = new Rectangle(width,height);
        System.out.println("Hinh chu nhat cua ban: \n" + hcn.display());
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());
    }
}
