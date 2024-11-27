/***
 * 
 */

import java.util.Scanner;
public class MejorEgresadoUTPL {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de estudiantes: ");
        int numEstudiantes = 0;
        tcl.nextLine();
        
        String mejorEgresado1 = "";
        String mejorEgresado2 = "";
        int mayorpromedio = 0;
        boolean empate = false;
        
        int cont = 1;
        while (cont <= numEstudiantes) {
            System.out.println("Ingrese los datos del estudiante " + cont + ":");
            System.out.print("Nombre: ");
            String nombre = tcl.nextLine();
            System.out.print("Promedio Final: ");
            int promedio = tcl.nextInt();
        }
    }
}
