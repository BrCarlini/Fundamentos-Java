package estruturasDeDados;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    

    public static void main(String[] args) {
        // Lista

        List<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Antonio");
        nomes.add("Bia");

        // System.out.println(nomes.get(1));

        // for(String nome : nomes){
        //     System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome eh " + nome));
    }
}
