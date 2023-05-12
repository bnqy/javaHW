class Driver{
	public static void main(String[] args){
		Humans person1 = new Humans();
		
		person1.height = (float)173.2;
		person1.age = 19;
		person1.name = "Han";
		person1.type = "Worker";
		person1.cout();
		
		Student student = new Student();
		student.name = "San";
		student.age = 18;
		student.height = (float)181.1;
		student.type = "Student";
		student.cout();
		student.study = true;
		student.nameOfUniversity("Harvard");
	}
}