package codepractice;

/*
Calling a function within a class to do a job without returning any values -OK
Calling a function within a class to get some Values without passing input parameters - WIP
Calling a function within a class to get some Values passing input parameters
Calling a function of an object to do a job without returning any values - Done
Calling a function of an object to get some Values without passing input parameters - done
Calling a function of an object to get some Values passing input parameters
Calling chain of functions


 */

public class calculator3 {
	
	private int result;
	private int memory;
	
	public calculator3() {
		
		memory = -1;// intializing the variables
		//create constructor with parameter with memory value.
		
	}
public calculator3(int memory) {
		
		this.memory = memory;//this represent current object and this.memory represent class level variable
		
	}
	public static void main(String args[] ){
		calculator3 obj = new calculator3();
		calculator3 obj1 = new calculator3(2);
		obj.showmemory();
		obj1.showmemory();
		int value = obj.add(100, 50);
		obj.setMemory(value);
		
		obj.showmemory();
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
		//System.out.println("Memory :"+memory);
		}
	public int add(int a ,int b) {
		
		 result = a+b;
		display();
		return result;
	}
	
public int add(int a) {
		
	  result = a+result;
		return result;
		
	
	}
public void showmemory() {
	

	System.out.println("Memory Valu:"+getMemory());
	
}

public int getMemory() {
	
	return memory;
	
	
}

public void reset() {
	
	  result = 0;
	  memory= 0;
	
	}

public void setMemory(int value) {
	
	memory = value;
}



}
