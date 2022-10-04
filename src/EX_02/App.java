package EX_02;
import java.util.Scanner;

// Dadas dos cadenas introducidas por el usuario, hay que juntarlas carácter a carácter.
//En caso de un espacio, ignorar ese carácter. Por ejemplo, si la entrada es “Fran” y
//“Manu”, la salida será: “FMraanu”

public class App {

    Scanner palabra1 = new Scanner(System.in);
    Scanner palabra2 = new Scanner(System.in);



    public static void main(String[] args){
    EX_02.App app = new EX_02.App();
    app.Juntar();
    }

    public void Juntar(){

        System.out.println("Ingresa la primera palabra:");
        String primera_palabra = palabra1.nextLine();
        System.out.println("Ingresa la segunda palabra: ");
        String segunda_palabra = palabra2.nextLine();

        char primera_letra1 = primera_palabra.charAt(0);
        char primera_letra2 = segunda_palabra.charAt(0);

        String palabra1_simple = primera_palabra.substring(1);
        String palabra2_simple = segunda_palabra.substring(1);

        System.out.println("El resultado de las dos palabras es el siguiente:"+primera_letra1+""+primera_letra2+""+palabra1_simple+""+palabra2_simple);
    }
}

