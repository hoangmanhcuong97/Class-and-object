//Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
public class Rectangle {
    private double width;
    private double height;

    private Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Định nghĩa các phương thức getArea(), getPerimeter(), display()
        public double getArea(){
            return this.width * this.height;
        }
        public double getPerimeter(){
            return (this.height + this.width)*2;
        }
        public String display(){
            return "Rectangle{" + "width = " + width + ", height = " + height + "}";
        }
}
