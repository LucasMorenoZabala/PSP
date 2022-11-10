import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        String nombreMayor = "";
        String nombreMenor = "";
        int edadMayor = 0;
        int edadMenor = 100;
        String nombre = "";
        int edad = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            System.out.println("Introduce tu nombre o * para finalizar:  ");
            nombre = sc.nextLine();
            if (!nombre.equals("*")) {
                contador++;
                try {
                    System.out.println("Introduce tu edad: ");
                    edad = sc2.nextInt();
                    do {

                        if (edad > edadMayor) {
                            edadMayor = edad;
                            nombreMayor = nombre;
                        }

                        if (edad < edadMenor) {
                            edadMenor = edad;
                            nombreMenor = nombre;
                        }

                    } while (edad < 0 || edad > 100);
                } catch (Exception e) {
                    System.out.println("No se pueden escribir letras.");

                }

            }

        } while (!nombre.equals("*"));

        System.out.println("El número total del alumnado es: " + contador);
        System.out.println("El nombre del mayor es " + nombreMayor + " y su edad es " + edadMayor);
        System.out.println("El nombre del menor es " + nombreMenor + " y su edad es " + edadMenor);

    }
}
