import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the width:");
//        double width = sc.nextDouble();
//
//        System.out.print("Enter the height:");
//        double height = sc.nextDouble();
//
//        Rectangle hcn = new Rectangle(width,height);
//        System.out.println("Hinh chu nhat cua ban: \n" + hcn.display());
//        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ hcn.getArea());

        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");

        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c );
        if (a != 0){
            if(pt.getDiscriminant() >= 0){
                System.out.println("Phuong trinh co 2 nghiem la: x1 = "+pt.getRoot1()+"\t"+"x2 = "+pt.getRoot2());
            }else {
                System.out.println("The equation has no roots");
            }
        }else {
            System.out.println("Khong phai phuong trinh bac 2");
        }
    }
}
