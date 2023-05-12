class Humans{
	String name;
	int age;
	float height;
	String type; 
	boolean st;
	Humans(){
		super();
	}
	
	Humans(String name, int age, float height, String type, boolean st )
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.type = type;
		this.st = st;
	}
	
	void cout()
    {
		System.out.println("\nname: "+name+"\nage: "+age+"\nheight: "+height+"\ntype: "+type);
	}
	
	void cout(String name)
    {
		System.out.println("\nname: "+name);
	}
	
	void cout(int age)
    {
		System.out.println("\nage: "+age);
	}
	
	
	void nameOfUniversity(String nameUni){
		if(st){
			System.out.println(this.name + " studies at "+nameUni+" University");
		}
		else
			System.out.println(this.name+ " does not study at University");
	}
	
	
		
}