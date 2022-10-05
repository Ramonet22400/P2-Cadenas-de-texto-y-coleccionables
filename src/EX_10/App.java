package EX_10;

//Escribe un programa para ordenar un HashMap por su valor (Investigar sobre
//TreeMap, ArrayList, Collections.sort()… Existen varias soluciones posibles).

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class App {

    public static void main(String[] args){
        EX_10.App app = new EX_10.App();
        app.ordenar();
    }

    public void ordenar(){

        final Map<String, Integer> ordenar = new HashMap<>();
        ordenar.put("r", 2);
        ordenar.put("C", 8);
        ordenar.put("a", 3);
        ordenar.put("c", 5);
        ordenar.put("o", 9);
        ordenar.put("s", 7);
        ordenar.put("n", 4);
        ordenar.put("i", 6);
        ordenar.put("f", 1);

        final Map<String, Integer> sortedByCount = ordenar.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount);
    }
}
