package EX_07;

//Escribe un programa que atraviese (itere) un ArrayList usando Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static void main(String[] args){
        App app = new App();
        app.iteracion();
    }

    public void iteracion(){

        ArrayList<String> escuderias_F1 = new ArrayList<String>();
        escuderias_F1.add("Ferrari");
        escuderias_F1.add("Red Bull Racing");
        escuderias_F1.add("Mercedes AMG");
        escuderias_F1.add("Mclaren");
        escuderias_F1.add("Alpine F1 Team");

        Iterator<String> it = escuderias_F1.iterator();

        for (int i = 0; i < escuderias_F1.size(); i++) {

            System.out.println(it.next());
        }
    }
}
