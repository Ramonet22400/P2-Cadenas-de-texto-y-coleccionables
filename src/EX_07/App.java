package EX_07;

//Escribe un programa que atraviese (itere) un ArrayList usando Iterator.

import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        EX_07.App app = new EX_07.App();
        app.itere();
    }

    public void itere(){

        System.out.println();
        ArrayList<String> escuderias_F1 = new ArrayList<String>();
        escuderias_F1.add("Ferrari");
        escuderias_F1.add("Red Bull Racing");
        escuderias_F1.add("Mercedes AMG");
        escuderias_F1.add("Mclaren");
        escuderias_F1.add("Alpine F1 Team");
        System.out.println(escuderias_F1);




    }
}
