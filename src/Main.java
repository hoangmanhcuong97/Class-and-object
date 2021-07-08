import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//bai 1: bai thuc hanh hcn
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

//bai2: Tinh phuong trinh bac 2
//        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");
//
//        System.out.println("Enter a");
//        double a = sc.nextDouble();
//        System.out.println("Enter b");
//        double b = sc.nextDouble();
//        System.out.println("Enter c");
//        double c = sc.nextDouble();
//        QuadraticEquation pt = new QuadraticEquation(a, b, c );
//        if (a != 0){
//            if(pt.getDiscriminant() >= 0){
//                System.out.println("Phuong trinh co 2 nghiem la: x1 = "+pt.getRoot1()+"\t"+"x2 = "+pt.getRoot2());
//            }else {
//                System.out.println("The equation has no roots");
//            }
//        }else {
//            System.out.println("Khong phai phuong trinh bac 2");
//        }

// bai 3: dong ho dem giay
        StopWatch st = new StopWatch();
        System.out.println("ban co muon reset lai thoi gian:\n"+ "Neu co an 1");
        int a = sc.nextInt();
        System.out.println("thoi gian hien tai la: "+ st.start());
        System.out.println("ban co muon stop lai thoi gian:\n"+ "Neu co an 0");
        int b = sc.nextInt();
        System.out.println("thoi gian muon dung lai: "+ st.stop());
        System.out.println("chenh lech thoi gian la: "+ st.getElapsedTime());
    }

}
