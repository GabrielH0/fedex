import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //A
        Random gerador = new Random();
        ArrayList<Integer> numerosRandomicosList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            numerosRandomicosList.add(gerador.nextInt(50));
        }

        //B
        TreeSet<Integer> numeroRandimicosSet = new TreeSet<>(numerosRandomicosList);
        System.out.println("B: " + numeroRandimicosSet + "\n");

        //C
        HashMap<Integer, Integer> numerosRandomicosMap = new HashMap<>();
        numerosRandomicosList.forEach(n -> {
            if (numerosRandomicosMap.containsKey(n)) {
                Integer repeticoes = numerosRandomicosMap.get(n);
                numerosRandomicosMap.put(n, repeticoes + 1);
            } else {
                numerosRandomicosMap.put(n, 1);
            }
        });
        System.out.println("C: " + numerosRandomicosMap + "\n");

        //D
        System.out.println("D: " +numerosRandomicosMap.keySet().stream().findFirst().get() + "\n");

    }
}
