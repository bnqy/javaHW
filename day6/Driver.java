class Driver{
	public static void main(String[] args){
	
	Encap encap = new Encap("Choe", 17, 7312.38);
	
	//encap.balance; error
	
	System.out.println("Name:\t\t"+encap.getName()+"\nAge:\t\t"+encap.getAge()+"\nBalance:\t"+encap.getBalance());
	
	System.out.println("\nAfter set methods: ");
	
	encap.setName("Shin");
	encap.setAge(19);
	encap.setBalance(3722.99);
	
	
	System.out.println("Name:\t\t"+encap.getName()+"\nAge:\t\t"+encap.getAge()+"\nBalance:\t"+encap.getBalance());
	
	System.out.println("Average Salary:\n"+
	+encap.calculate((double)encap.getAge(), encap.getBalance()));
	
	}
	
}