class Rectangle extends Shape implements Printable{
	private double a;
	private double b;
	
	public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
		this.b = b;
    }
	
	public double getArea() {
        return a*b;
    }
	
	public void print() {
        System.out.println("A " + getColor() + " rectangle");
    }
}