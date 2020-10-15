import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
      // Array
        CartaoWeb [] cartoes = new CartaoWeb[3];
        cartoes[0] = new DiaDosNamorados();
        cartoes[1] = new Natal();
        cartoes[2] = new Aniversario();
        CartaoWeb cartaoescolhido;
       
        for(int i = 0; i<3; i++){
            
            cartaoescolhido = cartoes[i];
            // Digite o Remetente
            cartaoescolhido.retornarMensagem(JOptionPane.showInputDialog("Remetente: "),
             // Digite o Destinatario
             JOptionPane.showInputDialog("Destinatario: "));
        }
    }
    
}