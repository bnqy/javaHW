class ClassOne{
	public static int retirementAge = 60;
    int age;
    ClassOne(){
        System.out.println("Retirement start age: "+retirementAge);
    }
    public ClassOne(int age){
        this.age = age;
    }
    public void Display(){
        if (age >= retirementAge) 
			System.out.println("You are in retirement");
        else {
			int s = retirementAge - age;
			System.out.println("Before the retirement " + s +" years");
		}	
    }
	
	public static void ChangeRetirementAge(int years){
        retirementAge += years;
        retirementAge += years;
        retirementAge += years;
    }
	
	public final void Printing(){
		System.out.println("Retire age is "+retirementAge);
	}
	
	static class Message{
		public void Message(){
			System.out.println("After retirement take care of yourself!)");
		}
		
		public final void Host(){
			System.out.println(5);
		
		}
	}
}