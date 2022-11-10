import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String cadena = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        cadena = sc.nextLine();

        if (cadena.isBlank()) {
            System.out.println("La cadena esta vacía.");
        }

        if (cadena.replace(" ", "") && cadena.replace("´", "") && cadena.equalsIgnoreCase(cadena)) {

        }
    }

}
