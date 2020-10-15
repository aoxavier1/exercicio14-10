import javax.swing.JOptionPane;


public class Natal extends CartaoWeb {
    
    public void Natal (String destinario,String remetente){       
    }
    public void retornarMensagem(String remetente, String destinatario) {
        String mensagem = String.format("Feliz natal!"+ destinario +" Atenciosamente", remetente);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}