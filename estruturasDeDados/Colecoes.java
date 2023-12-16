package estruturasDeDados;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Bruno", 7);
        notas.put("Julio", 8);
        notas.put("Antonio", 9);

        // var nota = notas.get("Julio");
        // System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
