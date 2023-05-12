public class Main {
    public static void main(String[] args) {
        Printable circle = new Circle("green", 7.7);
		Printable rectangle = new Rectangle("red", 5.2, 10.8);
        circle.print(); 
        System.out.println("Area = " + circle.getArea()); 
        circle.printInfo(); 
		rectangle.print(); 
        System.out.println("Area = " + rectangle.getArea()); 
        rectangle.printInfo(); 
        Printable.printVersion();
    }
}