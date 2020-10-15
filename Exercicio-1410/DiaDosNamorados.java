public class DiaDosNamorados extends CartaoWeb {
  
	public DiaDosNamorados(String destinatario, String remetente){
	}
	
	protected String retornarMensagem(String remetente){
	String mensagem = String.format ( + destinatario + ", meu amor, Eu te amo muito"
			+ "Do seu amor: " + remetente + ".");
  
  JOptionPane.showMessageDialog(null, mensagem);
	}
}