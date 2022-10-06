package EX_03;
import java.util.Scanner;

//Dada una frase y un carácter introducido por el usuario, indica en qué posiciones se
//encuentra ese carácter sin utilizar indexOf.

public class App {

    Scanner v1 = new Scanner(System.in);
    Scanner v2 = new Scanner(System.in);

    public static void main(String[] args){
        EX_03.App app = new EX_03.App();
        app.Contador();
    }

    public void Contador(){

        System.out.println("Escriba la palabra: ");
        String palabra = v1.nextLine();
        System.out.println("Introduzca el caracter: ");
        char caracter = v2.nextLine().charAt(0);
        String posiciones = "";
        for (int i = 0; i < palabra.length(); i++) {

            if(palabra.charAt(i) == caracter){

                posiciones+=i + ", ";
            }

        }

        System.out.println("La posición del caracter es:" + posiciones);

    }
}
