package studio2;

public class Ruin {
	
	public static void main(String args[]) {
		int ruinCount = 0;
		double totalSimulations = 500;
		for(int i = 1; i < totalSimulations+1; i++) {
			int startAmount = 10;
			double winChance = 0.5;
			int winLimit = 20;
			int count = 0;
			while(startAmount > 0 && startAmount <= winLimit) {
				if(Math.random()*1 <= winChance) {
					startAmount++;
				}else{
					startAmount--;

				}
				count++;
			}
			if (startAmount ==0) {
				ruinCount++;
			}
			
			System.out.println("Simulation "+ i + ": " + count + (startAmount == 0 ? " Lose" : " Win"));
			
			
		}
			System.out.println("Ruin rate from simulation: " + (double)(ruinCount/totalSimulations));
	}

}