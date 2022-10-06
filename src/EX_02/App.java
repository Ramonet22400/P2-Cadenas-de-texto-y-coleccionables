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

        System.out.print(primera_letra1);
        System.out.print(primera_letra2);

        char[] arr_primera_palabra = primera_palabra.toCharArray();
        char[] arr_segunda_palabra = segunda_palabra.toCharArray();

        int num_pal1 = arr_primera_palabra.length;
        int num_pal2 = arr_segunda_palabra.length;

        boolean respuesta = num_pal1 < num_pal2;

        char[] palabra_corta;
        if (respuesta == true){
            palabra_corta = arr_primera_palabra ;
        }else{
            palabra_corta = arr_segunda_palabra;
        }

        for (int i = 1; i < palabra_corta.length; i++) {

            System.out.print(arr_primera_palabra[i]);
            System.out.print(arr_segunda_palabra[i]);
        }


        if(primera_palabra.length() < segunda_palabra.length()){

            System.out.println(segunda_palabra.substring(primera_palabra.length()));
        }else{
            System.out.println(primera_palabra.substring(segunda_palabra.length()));
        }

    }
}

