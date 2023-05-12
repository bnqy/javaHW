class Driver{
	public static void main(String[] args){
		
		Humans human = new Humans("San", 25, (float)191.2, "Worker", false);
		human.cout();                                  
		human.cout(5);
		human.cout("Yan S");
		human.nameOfUniversity("Hannam");
		
		Student student1 = new Student();
		student1.height = (float)173.2;
		student1.age = 19;
		student1.name = "Han";
		student1.type = "Student";
		student1.study = true;
		student1.gpa = 3.04;
		student1.cout();
		student1.nameOfUniversity(student1.gpa );
		student1.nameOfUniversity("Harvard", student1.gpa );
		
		Student student2 = new Student("Yon", 18, (float)189.1,"Student", true, 3.72);
		student2.cout();
		student2.nameOfUniversity("Manas", student2.gpa );
		
		Student student3 = new Student("Kon", 19, (float)183.9,"Student", false, 3.42);
		student3.cout();
		student3.nameOfUniversity( student3.gpa );
		student3.nameOfUniversity("Oxford", student3.gpa );
		
	}
}