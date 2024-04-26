package Functional_Inte_21_03;

public class concrete_class implements Functional_interface{
//its concrete class where all methods implement
	
	public static void main(String[] args) {
		
		int a=15;
		//concrete_class obj = new concrete_class();
		Functional_interface obj = new concrete_class();
		//obj.add();
		obj.hello();
		obj.hi();
		//obj.a=12;
		System.out.println(a);// here variable right side and method left side 
		//Functional_interface obj1;
		Functional_interface.hhh();
	}
	 
	/*
	 * @Override public void add() { // TODO Auto-generated method stub
	 * System.out.println("addition"); }
	 */
	
	
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("its abstract method ");
	}

}
