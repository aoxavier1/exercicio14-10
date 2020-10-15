public class Aniversario extends CartaoWeb {
	public Aniversario(String destinatario,String remetente){
	}
	
public void retornarMensagem(String remetente, String destinatario) {
    String mensagem = String.format
    // retorna a mensagem a seguir
		("Feliz aniversário! " + destinatario 
			+ "Que sua vida seja repleta de felicidades que que Deus possa te abencoar grandemente"
			+ " De:" +  remetente);

      JOptionPane.showMessageDialog(null, mensagem);
	}
}