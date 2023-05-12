class Student extends Humans{

	Student (){
        super();
	}
    
	boolean study;

	void nameOfUniversity(String nameUni){
		if(study){
			System.out.println(this.name+" studies at "+nameUni+" University");
		}
		else
			System.out.println(this.name+" does not study at University");
	}
}