class Student extends Humans{

	Student (){
        super();
	}
	
	
	double gpa;
	boolean study;
	
	Student(String name, int age, float height, String type, boolean study, double gpa )
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.type = type;
		this.study = study;
		this.gpa = gpa;
	}
	void cout(){
		if(true)
		System.out.println("\nname: "+name+"\nage: "+age+"\nheight: "+height+"\ntype: "+type);
	}
	void nameOfUniversity(String uniName, double gpa){
		if(this.study){
			if(gpa > 3.5){
			System.out.println(this.name+" studies" + uniName+" at University");
				System.out.println(" and this student is found in Dean's List!");
			}
			else{
				System.out.println(this.name+" studies " + uniName+" at University");
				System.out.println(" but this student is NOT found in Dean's List!");
			}
		}
		else
			System.out.println(this.name+" does not study at University");
	}
	
	void nameOfUniversity(String nameUni){
		if(this.study){

				System.out. println(this.name+" studies at " + nameUni+" University");
				System.out.println(" and this student is found in Dean's List!");
		}
		else
			System.out.println(this.name+" does not study at University");
	}
	
	void nameOfUniversity(double y){
		if(this.study){

				System.out.println(this.name+" students GPA is "+y);
		}
		else
			System.out.println(this.name+" it's GPA not found");
	}
	
		
}