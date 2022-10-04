package EX_08;

// Escribe un programa que atraviese (itere) un ArrayList usando Lambdas.

import java.util.*;

public class App {

    public static void main(String[] args){
        EX_08.App app = new EX_08.App();
        app.function_lambda();
    }

    public void function_lambda(){


                ArrayList<Professor> Profes = new ArrayList<Professor>();
                Profes.add(new Professor("Francisco", 27));
                Profes.add(new Professor("Maria Jose", 32));
                Profes.add(new Professor("Aleix", 29));
                Profes.add(new Professor("Juan",25));
                Profes.add(new Professor("Xavier",43));
                Profes.removeIf(Profesor -> (Profesor.edad <= 28)); // Expresion Lambda
                System.out.println("La lista de profes es: ");


                for(Professor Professor : Profes) {
                    System.out.println(Professor.nombre);
                }
            }
            private static class Professor {
                private String nombre;
                private int edad;
                public Professor(String nombre, int edad) {
                    this.nombre = nombre;
                    this.edad = edad;
                }
            }
        }