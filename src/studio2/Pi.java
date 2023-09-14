package studio2;

public class Pi {
	
	public static void main(String args[]) {
		int count = 0;
		for(int i = 0; i <= 10000000; i++) {
			double a = Math.random() * 1;
			double b = Math.random() * 1;
			if(Math.pow((a - 0.5), 2) + Math.pow((b - 0.5), 2) <= Math.pow(0.5, 2)) {
				count++;
			}
		}
		double probability = count / 10000001.0;
		
		System.out.print((1/(0.5*0.5)) * probability);
		
		
		
	}

}
