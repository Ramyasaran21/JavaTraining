package codepractice;

/* Declare class level private variables result and memory -type int
 * create a method called display to print result and memory value (no input or return type)
 * create add method with two input parameters of type integer and return the addition of two numbers a
 * create add method with one input parameter of type integer and return addition of input number and 
  result variable.Also set the added  value to result variable.
  Create reset method set result and memory to zero 
  
 * In main method create object for calculator and add two numbers 100 and 50 then call display and reset
 * call all add method with one parameter for five times with inputs 10,15,8,9,7 and then call display method
 * 
 * 
 */

public class calculator1 {
	
	private int result;
	private int memory;
	
	public static void main(String args[] ){
	
		calculator1 obj = new calculator1();
		
		obj.add(100, 50);
		obj.display();
		obj.reset();
		obj.add(10);
		obj.add(15);
		obj.add(8);
		obj.add(9);
		obj.add(7);
		obj.display();
		
		
		
	}
	
	public void display() {
		System.out.println("Result :"+result);
		System.out.println("Memory :"+memory);
		}
	public int add(int a ,int b) {
		
		 result = a+b;
		
		return result;
	}
	
public int add(int a) {
		
	  result = a+result;
		return result;
		
	
	}

public void reset() {
	
	  result = 0;
	  memory= 0;
	
	}

}
