package EX_08;

// Escribe un programa que atraviese (itere) un ArrayList usando Lambdas.

import java.util.*;

public class App {

    public static void main(String[] args){
        EX_08.App app = new EX_08.App();
        app.function_lambda();
    }

    public void function_lambda(){


                ArrayList<Student> Profes = new ArrayList<Student>();
                Profes.add(new Student("Francisco", 27));
                Profes.add(new Student("Maria Jose", 32));
                Profes.add(new Student("Xavier", 29));
                Profes.removeIf(student -> (student.age <= 28)); // Expresion Lambda
                System.out.println("La lista de profes es: ");
                for(Student student : Profes) {
                    System.out.println(student.name);
                }
            }
            private static class Student {
                private String nombre;
                private int edad;
                public Student(String nombre, int edad) {
                    this.nombre = nombre;
                    this.edad = edad;
                }
            }
        }