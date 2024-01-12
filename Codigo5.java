/*Se le solicita al usuario que introduzca un numero
 * al introducir un numero lo dividira entre 10, un arreglo lo convertira a entero 
 * si tiene punto decimal hasta que quede un solo numero, si el numero es 3, 7 , 8 o 9
 * se mostrara que el numero es afortunado pero si no se le mostrara un mensjae que dira
 * que su numero no es afortunado y ahi acaba el programa.
*/

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Codigo5 {

    public static void main(String[] args) {
    	System.out.print("Este es el juego de la suerte,¿sera tu numero el afortunado?");//Agrega una linea para mas detalle
        Scanner s = new Scanner(System.in); // Corrige el uso de Scanner
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Corrige la conversión de String a int

        int afo = 0;
        int noAfo = 0;

        while (c > 0) { // Corrige el bucle y usa 'c' en lugar de 'ni'
            int digito = c % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10; // Corrige la división y usa 'c' en lugar de 'ni'
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado."); // Usa 'c' en lugar de 'ni'
        } else {
            System.out.println("El " + c + " no es un número afortunado."); // Usa 'c' en lugar de 'ni'
        }
    }
}
