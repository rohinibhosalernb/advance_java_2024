package Functional_Inte_21_03;

@FunctionalInterface //becoz of (sam) these we write only one abstract 
				//method with static & default
public interface Functional_interface {
	
	//void add();//abstract method we can write like that also
	
	public abstract void hello();
	
	int a=10;
	
	
	default void hi() {
		System.out.println("hi its default");
		
	}
	 static void hhh()
	 {
		 System.out.println("its static ");
	 }

}
