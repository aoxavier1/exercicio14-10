public class Aniversario extends CartaoWeb {
	public Aniversario(String destinatario){
		setDestinatario(destinatario);
	}
	
	protected String retornarMensagem(String remetente){
		return "Feliz aniversário " + getDestinatario() 
			+ "! Que sua vida seja repleta de felicidade e que seus " 
			+ " sonhos se tornem realidade. Conte sempre comigo. " 
			+ " De:" +  remetente + ".";
	}
}