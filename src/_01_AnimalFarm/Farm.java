package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	
	static Goat mikey = new Goat();
	static Alpaca ray = new Alpaca();
	static Llama gerard = new Llama();
	static Unicorn frank = new Unicorn();
	static Goat goatyMcGoat = new Goat();
	static Alpaca chocolateSwirl = new Alpaca();
	
	public static void main(String[] args) {
		ArrayList<Animal> tahiti = new ArrayList<Animal>();
		tahiti.add(mikey);
		tahiti.add(ray);
		tahiti.add(gerard);
		tahiti.add(frank);
		tahiti.add(goatyMcGoat);
		tahiti.add(chocolateSwirl);
		
		for(int i = 0; i < tahiti.size(); i++	) {
			tahiti.get(i).makeNoise();
			tahiti.get(i).mudRoll();
		}
	}
}
