package EX_05;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Dada una cadena de texto con una contraseña, indicar si la contraseña es fuerte o
//débil. Consideramos una contraseña fuerte si contiene 8 o más caracteres, y entre
//ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito

public class App {

    String contra = "RAmon123:";
    Integer fuerza = 0;

    public static void main(String[] args){
        EX_05.App app = new EX_05.App();
        app.contraseña();
    }
    public void contraseña(){

        //char[] contra_arr = contra.toCharArray();
        String contra1 = contra;
        int frase_lenght = contra1.length();

        if(frase_lenght >= 8){

            System.out.println("La contraseña cumple con la longitud minima.");

            fuerza = fuerza + 1;

        }else{

            System.out.println("La ocntraseña no cuenta con la longitud mínima.");
        }

        if (contra1!=contra1.toLowerCase()){

            System.out.println("La contraseña cuenta con mayúsculas y minuscúlas.");
            fuerza = fuerza + 1;

        }else{

            System.out.println("La contraseña no contiene minsuculas y mayusculas.");
        }

        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\W)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("RAmon123:");
        boolean contiene_digitos_simbolos = matcher.find();

        if(contiene_digitos_simbolos) {
            System.out.println("La contraseña contiene tanto digítos como símbolos.");
            fuerza = fuerza + 1;
        } else {
            System.out.println("La contaraseña no cumple con los parametros de seguridad");

        }

        System.out.println();

        if(fuerza == 3){

            System.out.println("La contraseña que as introducido es fuerte.");
        }else{

            System.out.println("La contraseña no es lo suficientemente fuerte.");
        }

    }
}

//Hay una forma mucho más sencilla de ejecutar este código, pero ya que el de arriba lo e pensado y creado yo desde 0 es el que eh puesto.
//Las dos formas son correctas y funcionan igual de bien.


//    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$", Pattern.CASE_INSENSITIVE);
//    Matcher matcher = pattern.matcher("RAmon123:");
//    boolean cumple_parametros = matcher.find();
//    if(cumple_parametros) {
//      System.out.println("La contraseña es segura :) ");
//    } else {
//      System.out.println("La contraseña no es segura :( ");
//    }
//  }

