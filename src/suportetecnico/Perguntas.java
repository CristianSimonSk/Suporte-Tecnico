
package suportetecnico;

import java.text.Normalizer;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Perguntas {
    HashSet words;
    
    public HashSet perguntaDigitada(String frase){
        
        frase = frase.replace("?","");
        
        frase = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
        StringTokenizer tokenizer = new StringTokenizer(frase);
        words = new HashSet();
        
        while(tokenizer.hasMoreTokens()){
            words.add(tokenizer.nextToken());
        }
        return words;           
    }
}
