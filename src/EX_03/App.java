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
        String caracter = v2.nextLine();

        int Posicion = palabra.length();

        System.out.println("La posición del caracter es:"+Posicion);


    }
}
