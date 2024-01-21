package Assignment1;

public class House {

	public static void main(String[] args) {
		
		House ramya = new House();
		House Saran = new House();
		
		ramya.usewater();
		ramya.usewater();
		Saran.usewater();
		Saran.usewater();
	}
	
	
	static int water = 1000;
	
	
public int usewater() {
		water  = water-1;
		System.out.println("Current water level = "+water);
		
		return water;
	}
	
}
