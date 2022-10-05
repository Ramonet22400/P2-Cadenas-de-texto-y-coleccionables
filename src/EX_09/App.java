package EX_09;

//Escribe un programa que añada elementos a un hashSet y muestra el contenido.

import java.util.HashSet;

public class App {

    public static void main(String[] args){
        EX_09.App app = new EX_09.App();
        app.hash_set();
    }


    public void hash_set(){

        HashSet<Integer> haaaash = new HashSet<>();

        haaaash.add(5);
        haaaash.add(10);
        haaaash.add(15);
        haaaash.add(6);
        haaaash.add(8);


        System.out.println(haaaash);

    }
}
