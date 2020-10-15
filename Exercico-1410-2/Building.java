public class Building implements CarbonFootprint {
	
    private double mediaMensal; 
    
    //Energia por hora
    private final int meses = 12;
    
    
    public Building( double consumoMensal ) {
        mediaMensal = consumoMensal;
    }

    // GETS E SETS     
    public void setMediaMensal( double consumoMensal ) {
        mediaMensal = consumoMensal;
    }
       
    public double getMediaMensal() {
        return mediaMensal;
    }
          
    @Override 
    public String toString() {
        return String.format("%s: %.2f", " Energia mensal é ", getMediaMensal() );
    }
        
    @Override
    public double getCarbonFootprint() {
        return getMediaMensal() * meses;
    }
}
