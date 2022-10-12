
package suportetecnico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Respostas {
    
    private final HashMap respostasComuns;
    private final ArrayList respostasGenericas;
    private final Random numeroAleatorio;
    
    public Respostas(){
        respostasComuns = new HashMap();
        respostasGenericas = new ArrayList();
        respostasCompletas();
        respostasPadrao();
        numeroAleatorio = new Random();
    }
    
    public void respostasCompletas(){
        respostasComuns.put("poo","melhor disciplina");
        respostasComuns.put("Bem ele nunca falha","pode me dar mais informacoes?");
        respostasComuns.put("lento","provavelmente pode ser um problema no seu computador");
        respostasComuns.put("erro","sugiro que voce reinicie essa maquina");
        respostasComuns.put("problemas","para corrigir problemas do Windows voce pode usar o proprio Solucionar Problemas");     
    }
    
    public void respostasPadrao(){
        respostasGenericas.add("Consegue me detalhar mais?");
        respostasGenericas.add("Sua maquina tem algum software para suporte remoto?");
        respostasGenericas.add("Com que frequencia o problema ocorre");
        respostasGenericas.add("Pode me contar mais sobre o assunto, estou adorando o conteudo.");
        respostasGenericas.add("Será que trouxemos essa copa pro Brasil?");     
    }
    
    public String respostaPadrao(){
        int index = numeroAleatorio.nextInt(respostasGenericas.size());
        return (String)respostasGenericas.get(index);
    }
    
    public String respostaComum(HashSet words){
        Iterator it = words.iterator();
        while(it.hasNext()){
            String word = (String) it.next();
            String response = (String)respostasComuns.get(word);
            if(response != null){
                return response;
            }
        }
        return respostaPadrao();
    }
}

