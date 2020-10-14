public class DiaDosNamorados extends CartaoWeb {
	public DiaDosNamorados(String destinatario){
		setDestinatario(destinatario);
	}
	
	protected String retornarMensagem(String remetente){
		return + getDestinatario() + ", meu amor, " 
			+ "juntos estamos escrevendo a história de amor mais linda de todas." 
			+ "Te amo muito! Feliz Dia dos Namorados!!!" 
			+ "Assinado: " + remetente + ".";
	}
}