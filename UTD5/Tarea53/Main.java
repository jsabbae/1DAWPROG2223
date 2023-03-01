package UTD5.Tarea53;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Count Map es para contar números

        Map<Integer, Integer> countMap = new TreeMap<>();

        // El TreeMap se utilizará para que se ordene en ascendente

        for (int numeros) {
            if (countMap.containsKey(numeros)) {
                countMap.put(numeros, countMap.get(numeros) + 1);
            } else {
                // CountMap.put ----> Su uso es agregar o actulizar una entrada en el objeto. Contiene su clave y valor
                countMap.put(numeros, 1);
            }
        }
        // entry.getKey() ---> Su uso es obtener el uso de la entrada
        // entry.getValue() ---> Su uso es obtener el valor de la entrada
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " se mostratrá " + entry.getValue());
        }
    }
}
