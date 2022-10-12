
package suportetecnico;

import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuporteTecnico {
    private Perguntas leitorPerguntas;
    private Respostas geradorRespostas;
    
    public SuporteTecnico(){
        leitorPerguntas = new Perguntas();
        geradorRespostas = new Respostas();
    }
    
    public String suporte(String pergunta){
        HashSet frase = leitorPerguntas.perguntaDigitada(pergunta);
        String resposta = geradorRespostas.respostaComum(frase);
        return resposta;       
    }
    
    public void Inicio(){
        String mensagem = "Bem vindo ao atendimento de suporte tecnico, em que posso lhe ajudar?\n";
        
        JFrame frame = new JFrame("JOptionPane showMessageDialog");
        JOptionPane.showMessageDialog(frame, mensagem,"Suporte Tecnico", JOptionPane.INFORMATION_MESSAGE);
    }   
}
