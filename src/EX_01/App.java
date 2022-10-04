package EX_01;

// Lee una cadena de texto que contenga un nombre y los apellidos de alguien,
//devolviéndolos en formato “Apellidos, Iniciales”. Por ejemplo, si la entrada es
//“Francisco Mesas Cervilla”, la salida será: “Mesas Cervilla, F.”. Si la entrada es
//“Francisco José López Pérez”, la salida será: “López Pérez, F. J.”.

public class App {
    String nombre_completo = "Ramon Perez Martin";


    public static void main(String[] args){
        App app = new App();
        app.Apellidos();
    }

    public void Apellidos (){

        String[] apellidos = nombre_completo.split(" ");
        String apellido = apellidos[1];
        String apellido2 = apellidos[2];
        String nombre = apellidos[0];

        char inicial = nombre.charAt(0);

        System.out.println(apellido + " " + apellido2 + " " + inicial);

    }

}

