class Driver{
	public static void main(String[] args){
		Humans person1 = new Humans("Nan", 18, (float)185.4, 'C');
		
		person1.height = (float)173.2;
		person1.age = 19;
		person1.name = "Han";
		person1.type = 'C';
		person1.cout();
		person1.cout2('A');
	}
}