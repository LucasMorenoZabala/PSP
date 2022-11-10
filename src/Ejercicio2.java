import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {

        String cadena = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");

        cadena = sc.nextLine();

        if (cadena.isBlank() || cadena.length() < 1) {

            System.out.println("La cadena es incorrecta.");

        }
        cadena = cadena.replace(" ", ""), cadena.replace("á", "a"), cadena.replace("é", "e"), cadena.replace("ó", "o"), cadena.replace("í", "i"), cadena.replace("ú", "u"), cadena.replace("ñ", "n"), cadena.equalsIgnoreCase(cadena);

        String palabraRevertida = new StringBuilder(cadena).reverse().toString();

if (cadena.equalsIgnoreCase(palabraRevertida)) {

    System.out.println("Su cadena es un palíndromo");



} else {

    System.out.println("Su cadena no es un palíndromo");



}



public enum Charsets {

    UTF8("UTF-8");
 
  
 
   private final String charset;
 
  
 
   private Charsets(final String charset) {
 
     this.charset = charset;
 
   }
 
  
 
   public String getCharset() {
 
     return this.charset;
 
   }
 
  }

}

}
