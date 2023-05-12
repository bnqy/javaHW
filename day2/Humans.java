class Humans{
	String name;
	int age;
	float height;
	char type;
	
	Humans(){
		super();
	}
	
	Humans(String name, int age, float height, char type )
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.type = type;
	}
	
	void cout()
    {
		System.out.println("name: "+name+"\nage: "+age+"\nheight: "+height+"\ntype: "+type);

	}
	
	void cout2(char s)
	{
		System.out.println("\nHuman with lisence type: " + type);
		System.out.println("After earning new lisence: " + s);
	}
	
	
		
}