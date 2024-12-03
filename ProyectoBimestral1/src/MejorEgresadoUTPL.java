/***
 * La UTPL, cada fin de periodo realiza las ceremonias de incorporación de sus
 * nuevos profesionales de todas las carreras. En dicha ceremonia de entre todos
 * los puntos desarrollados en la agenda, uno de los más relevantes es el
 * discurso del mejor egresado de la promoción. Para elegirlo, las autoridades de
 * entre algunos aspectos, considera su rendimiento académico durante toda la
 * carrera, es aquí en donde la UTPL le contrata con el objetivo de colaborar en la
 * automatización de este proceso de cálculo y generación de resultados
 * académicos dados los siguientes lineamientos:
 - Autogenere los estudiantes con los datos/atributos necesarios (lo básico es
  su nombre y promedio final) con el fin de realizar la comparativa de su
  rendimiento académico entre todos los estudiantes a graduarse y así poder
  elegir al mejor egresado con el mayor promedio.
 - Realizar los cálculos y/o comparativas para filtrar al estudiante con el mayor
  promedio de egreso.
 - Al finalizar dicho proceso, como resultado Ud. debe mostrar los datos
  completos del mejor egresado, y el por qué fue elegido de entre todo el
  grupo.
 - Considerar la excepción/probabilidad de que puedan existir máximo 2
  mejores egresados, dado el caso, usted deberá mostrar los dos mejores
  egresados.
  * @author Juan Jose Calva
 */
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

