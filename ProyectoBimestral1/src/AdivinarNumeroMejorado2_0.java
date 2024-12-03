/***
 * Se le solicita desarrolar un demo tipo juego, que permita generar un número
 * aleatorio y le rete al ususario que lo adivine. Si no adivina el número,
 * el juego debe sugerirle lo intentenuevamente con pistas (es mayor, menor, 
 * es par, impar, es primo, pertenece a la serie de fibonacy, es multiplo de N, etc)
 * el ususario es quien deberá ir pidiendo repetitivamente que el sistema le muestre o no,
 * más pistas, solo que, si el usuario pide más pistas el sistema automáticamente
 * le resta un intento y le informa cuantos intentos le quedan. Al finalizar el juego, 
 * se debe felicitar al usuario si gana y como, o pedir que lo intente de nuevo.
 * @author Adrián Cuenca
 */
import java.util.Scanner;

public class AdivinarNumeroMejorado2_0 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 101), intentos = 6;
        int numero, multiplo, pista;

        System.out.println("ADIVINA EL NÚMERO, TIENES " + intentos + " INTENTOS PARA ADIVINAR EL NÚMERO (ENTRE 0 Y 100)");

        while (intentos > 0) {
            System.out.print("Dime un número: ");
            numero = tcl.nextInt();

            if (numero == aleatorio) {
                System.out.println("¡FELICIDADES! Has adivinado el número.");
                break;
            } else {
                System.out.println("¡Incorrecto! ¿Quieres una pista? (Sí/No): ");
                String respuesta = tcl.next().toLowerCase();

                if (respuesta.equals("si")) {
                    intentos--; // Restar intento por pedir pista
                    pista = (int) (Math.random() * 4);

                    switch (pista) {
                        case 0:
                            if (numero < aleatorio) {
                                System.out.println("Pista: EL NÚMERO ES MAYOR.");
                            } else {
                                System.out.println("Pista: EL NÚMERO ES MENOR.");
                            }
                            break;

                        case 1:
                            if (aleatorio % 2 == 0) {
                                System.out.println("Pista: EL NÚMERO ES PAR.");
                            } else {
                                System.out.println("Pista: EL NÚMERO ES IMPAR.");
                            }
                            break;

                        case 2:
                            boolean primo = true;
                            if (aleatorio <= 1) {
                                primo = false;
                            } else {
                                for (int i = 2; i <= Math.sqrt(aleatorio); i++) {
                                    if (aleatorio % i == 0) {
                                        primo = false;
                                        break;
                                    }
                                }
                            }
                            if (primo) {
                                System.out.println("Pista: EL NÚMERO ES PRIMO.");
                            } else {
                                System.out.println("Pista: EL NÚMERO NO ES PRIMO.");
                            }
                            break;

                        case 3:
                            multiplo = (int) (Math.random() * 10) + 1;
                            if (aleatorio % multiplo == 0) {
                                System.out.println("Pista: ES MÚLTIPLO DE " + multiplo);
                            } else {
                                System.out.println("Pista: NO ES MÚLTIPLO DE " + multiplo);
                            }
                            break;
                    }
                }                
            }

            if (intentos > 0) {
                System.out.println("Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("Ya no tienes intentos. El número era: " + aleatorio);
            }
        }
    }
}
/***
 * run:
 * ADIVINA EL NÚMERO, TIENES 6 INTENTOS PARA ADIVINAR EL NÚMERO (ENTRE 0 Y 100)
 * Dime un número: 50
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO ES PAR.
 * Te quedan 5 intentos.
 * Dime un número: 80
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO NO ES PRIMO.
 * Te quedan 4 intentos.
 * Dime un número: 92
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO ES MENOR.
 * Te quedan 3 intentos.
 * Dime un número: 75
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO ES MAYOR.
 * Te quedan 2 intentos.
 * Dime un número: 85
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO ES PAR.
 * Te quedan 1 intentos.
 * Dime un número: 87
 * ¡Incorrecto! ¿Quieres una pista? (Sí/No): 
 * Si
 * Pista: EL NÚMERO NO ES PRIMO.
 * Ya no tienes intentos. El número era: 78
 * BUILD SUCCESSFUL (total time: 1 minute 39 seconds)
 */