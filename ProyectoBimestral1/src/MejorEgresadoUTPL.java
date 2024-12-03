
import java.util.Scanner;

public class MejorEgresadoUTPL {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese cuantos estudiantes son: ");
        int numEstudiantes = tcl.nextInt();
        tcl.nextLine();

        String mejorEgresado = "";
        double mejorPromedio = -1;
        String segundoMejorEgresado = "";
        double segundoMejorPromedio = -1;

        int cont = 0; 
        do {
            System.out.println("Estudiante #" + (cont + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = tcl.nextLine();

            System.out.print("Promedio final del estudiante: ");
            double promedio = tcl.nextDouble();
            tcl.nextLine(); 

            if (promedio > mejorPromedio) { 
                segundoMejorPromedio = mejorPromedio;
                segundoMejorEgresado = mejorEgresado;
                mejorPromedio = promedio;
                mejorEgresado = nombre;
                
            } else if (promedio > segundoMejorPromedio && promedio < mejorPromedio) {
                segundoMejorPromedio = promedio;
                segundoMejorEgresado = nombre;
            }
            cont++;
        } while (cont < numEstudiantes);

        System.out.println("Resultados:");
        
        if (segundoMejorPromedio == mejorPromedio) {
            System.out.println("Existen dos mejores egresados (Es un empate):");
            System.out.println("1. " + mejorEgresado + " con promedio " + mejorPromedio);
            System.out.println("2. " + segundoMejorEgresado + " con promedio " + segundoMejorPromedio);
            
        } else {
            System.out.println("El mejor estudiante egresado es:");
            System.out.println("1. " + mejorEgresado + " con promedio " + mejorPromedio);
        }
    }
}
/***
 * run:
 * Ingrese cuantos estudiantes son: 4
 * Estudiante #1:
 * Nombre: Juan Jose
 * Promedio final del estudiante: 9,07
 * Estudiante #2:
 * Nombre: Francisco
 * Promedio final del estudiante: 9,05
 * Estudiante #3:
 * Nombre: Ramon Jr
 * Promedio final del estudiante: 9,02
 * Estudiante #4:
 * Nombre: Daniela
 * Promedio final del estudiante: 9,06
 * Resultados:
 * El mejor estudiante egresado es:
 * 1. Juan Jose con promedio 9.07
 * BUILD SUCCESSFUL (total time: 1 minute 1 second)
 */

