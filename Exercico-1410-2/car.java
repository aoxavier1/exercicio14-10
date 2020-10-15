public class Car implements CarbonFootprint {

	private double milhasAno; 
	private double mediaMPG;
	private final int kgCO2PorMilha = 9; 

	public Car( double milhas, double MPG ) {
		milhasAno = milhas;
		mediaMPG = MPG;
	}
	
	public void setMilhasAno( double milhas ) {
		milhasAno = milhas;
	}
	
	public void setMediaMPG( double MPG ) {
		mediaMPG = MPG;
	}
	
	public double getMilhasAno() {
		return milhasAnuais;
	}

		public double getMediaMPG() {
		return mediaMPG;
	}

	public String toString() {
		return String.format( "%s: %.2f \n%s: %.2f ",
				"Media anual de milhas ", getMilhasAno(),
				"Media MPG é ", getMediaMPG() );
	}

	public double getCarbonFootprint() {
		return (( getMilhasAno() * getMediaMPG() ) * kgCO2PorMilha );
	}
}
