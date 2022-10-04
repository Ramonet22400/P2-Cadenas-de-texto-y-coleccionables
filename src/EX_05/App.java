package EX_05;

//Dada una cadena de texto con una contraseña, indicar si la contraseña es fuerte o
//débil. Consideramos una contraseña fuerte si contiene 8 o más caracteres, y entre
//ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito

public class App {

    String contra = "RAmon123:";

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
        }else{

            System.out.println("La ocntraseña no cuenta con la longitud mínima.");
        }

        if (contra1!=contra1.toLowerCase()){

            System.out.println("La contraseña cuenta con mayúsculas y minuscúlas.");

        }else{

            System.out.println("La contraseña no contiene minsuculas y mayusculas.");
        }


        if(contra1)
    }
}
