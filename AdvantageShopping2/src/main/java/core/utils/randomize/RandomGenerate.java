package core.utils.randomize;

import java.util.Random;


public class RandomGenerate {
	
	public int randomizer() {
		Random gerador = new Random();
		int randomNumber = gerador.nextInt(10000);
		 return randomNumber;
	}
	
}
