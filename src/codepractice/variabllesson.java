package codepractice;

public class variabllesson {
	
	private int counter;
	public  int age;
	
	public static void main (String []args ) {
		int age =0;
		variabllesson obj = new variabllesson();
		obj.counter =100;
		obj.display();
		
		variabllesson obj2 = new variabllesson();
		obj2.counter =500;
		obj.display();
		

		
	}
 public void  display() {
	 int counter =10;
	 System.out.println("Counter :"+this.counter);
	 
	 
 }
}
