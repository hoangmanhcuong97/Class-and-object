public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;
    private boolean ON;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Fan() {
    }

    public String toString() {
        if (ON) {
            return "Fan is on: "+"speed: " + speed +", color: "+ color + ", radius: "+ radius ;
        }else
            return "Fan is off: " + "color: "+ color + ", radius: "+ radius ;
    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(FAST);
        Fan1.setColor("yellow");
        Fan1.setRadius(10);
        Fan1.setON(true);

        Fan Fan2 = new Fan();
        Fan2.setColor("blue");
        Fan2.setRadius(5);

        System.out.println("quat 1: " + Fan1.toString());
        System.out.println("quat 2: " + Fan2.toString());
    }


}
