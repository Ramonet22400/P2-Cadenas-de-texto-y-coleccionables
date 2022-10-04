package EX_06;

//Transforma los caracteres del String “Cadenas de texto y coleccionables” en ASCII.
//Muéstralos de la siguiente manera:
//ASCII: 67 es equivalente a: C
//ASCII: …

import java.nio.charset.StandardCharsets;


public class App {


    public static void main(String[] args){
        EX_06.App app = new EX_06.App();
        app.transformar();
    }

    String cadena_texto = "Cadenas de texto y coleccionables";

    public void transformar(){

        String cadena_preparada= cadena_texto.trim().replaceAll(" ","").toLowerCase();

        char[] arr_frase = cadena_preparada.toCharArray();
        String[] frase_letra = cadena_preparada.split("");

        for (int i = 0; i < cadena_preparada.length(); i++) {

            byte[] bytes = cadena_preparada.getBytes(StandardCharsets.US_ASCII);

            System.out.println("El valor numerico ASCII de "+arr_frase[i]+" es: "+bytes[i]);

        }
    }
}
