class Humans{
	String name;
	int age;
	float height;
	String type;
	
	Humans(){
		super();
	}
	
	Humans(String name, int age, float height, String type )
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
	
	void cout2(String s)
	{
		System.out.println("\nHuman with occupation: " + type);
	}
	
	
		
}