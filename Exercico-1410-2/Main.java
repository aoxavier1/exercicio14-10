import java.util.ArrayList;


public class Principal {

	public static void main( String[] args ) {

		//Cria um array 
		ArrayList< CarbonFootprint > categories = new ArrayList< CarbonFootprint >();
		categories.add( new Bike( 100.00 ));
		categories.add( new Building( 2500.00 ));
		categories.add( new Car( 8436.00, 12.0 ));
		System.out.println("Dados do objeto: ");

		for( CarbonFootprint currentObject : categories ) {
			System.out.printf("\n%s: %s \n%s %s: %.2f\n",
					"Detalhes sobre ", currentObject.getClass().getName(),
					currentObject.toString(),
					"Tota de emisão de gases e  é ", currentObject.getCarbonFootprint());
		}
	}
}