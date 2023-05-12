class Main{
	public static void main(String[] args){
	    ClassOne retire;
        retire = new ClassOne(27);
		
		ClassOne.Message test = new ClassOne.Message();
		
        ClassOne.retirementAge = 61;
        retire.Display();
		ClassOne.ChangeRetirementAge(5);
		retire.Display();
		retire.Printing();
		
		test.Message();
		test.Host();
		
	}
}
