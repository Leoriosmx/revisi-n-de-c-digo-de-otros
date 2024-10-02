
import java.util.Scanner;

public class Codigo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        String niString = s.nextLine();
        int ni = Integer.parseInt(niString);  
        int c = ni;

        int afo = 0;
        int noAfo = 0;

        // Se utiliza una variable temporal para procesar el número
        int tempNi = ni; 

        while (tempNi > 0) {
            int digito = tempNi % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }//else
            tempNi /= 10;  // Mover la división aquí
        }//while

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }//else

        s.close();  // Cerrar el escáner
    }//main
}//class Codigo5
