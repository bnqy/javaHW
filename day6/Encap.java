class Encap{
	private String name;
    private int age;
	protected double balance;
	
	public Encap(String name, int age, double balance){
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
	

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
		else this.balance = 0;
    }
	
	private static double averageSalary(double x, double y) {
        return y/x;
    }

    public static double calculate(double x, double y) {
         return averageSalary(x, y);
    }
	

}