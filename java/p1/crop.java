package p1;

public class crop {
	public crop(String a) {
		name = a;
		categorize();
	}
	
	public crop(String a, double c, double d, double f) {
		name = a;
		yield = c;
		nutrientDrain = d;
		timeToMaturity = f;
	}
	
	public String name;
	
	public String[] defaultCrops = {"beans", "corn", "melon", "potato", "rice"}
	public double[][] defaultStats = {{3.3, -2.2, 120}, {7.1, 1.3, 150}, {2.3, 4, 200}, {8.6, 3, 100}, {9.2, 2.1, 160}}; 
	
	private double yield;
	
	private double nutrientDrain;
	
	private double time = 0;
	
	private double timeToMaturity;
	
	public void printInfo() {
		System.out.println("We call this crop: " + name + " it )
	}
	
	public void categorize() {
		
	}
	
	public double progress() {
		time += 
	}
}