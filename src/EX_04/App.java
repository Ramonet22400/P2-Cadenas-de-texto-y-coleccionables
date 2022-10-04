package EX_04;
import java.util.Scanner;
//Realice el ejercicio 3 usando indexOf.

public class App {

    Scanner v1 = new Scanner(System.in);
    Scanner v2 = new Scanner(System.in);
    public static void main(String[] args){
        EX_04.App app = new EX_04.App();
        app.Contador_index();
    }

    public void Contador_index(){

        System.out.println("Escribe la palabra: ");
        String palabra = v1.nextLine();
        System.out.println("Introduzca el caracter: ");
        String caracter = v2.nextLine();

        String juntos = palabra + caracter;
        String buscador ="/";

        int indice = juntos.indexOf(buscador);

        indice  = juntos.indexOf(buscador);

        System.out.println("La poición del caracter es: " + indice);






    }

}
