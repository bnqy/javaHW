public class Circle extends Shape implements Printable {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
 
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    

    public void print() {
        System.out.println("A " + getColor() + " circle with radius " + radius);
    }
}