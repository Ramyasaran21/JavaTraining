package codepractice;


/*
 * Create two class variable name and age
 * create getter setter value to it 
 * In the main method create object to the class and set name and age value using getter setter method.
 * in the set age method if the input age is less than zero set the value as zero ()
 */
public class getsetmethod {
	
	public static void main (String args[]) {
	
		getsetmethod obj = new getsetmethod();
		
		obj.setName("Ramya");
		obj.setAge(-35);
		
		System.out.println( "Name =" +obj.getName());
		System.out.println( "Age =" +obj.getAge());
		
	}
	
	private String name ;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		
	this.name = name;	
	}
	
	public void setAge(int age) {
		
		
		
		
		if(age<0) {
			
			 this.age = 0; 
		}
		
		else {
			this.age = age;	
		} 
			
			
		
	}
	
	
	
	
	
	

}
