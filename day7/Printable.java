public interface Printable {
    public void print();
    
    default void printInfo() {
        System.out.println("This is Printable");
    }
    
    static void printVersion() {
        System.out.println("h-h-h-h-h-h-h");
    }
}