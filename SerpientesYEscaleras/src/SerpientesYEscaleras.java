

import java.util.Random;
import java.util.Scanner;


public class SerpientesYEscaleras {
 private static final int TAMANO_TABLERO = 64;
      private static final Random random = new Random();
      private static final Scanner scanner = new Scanner(System.in);
  
      public static void main(String[] args) {
          Tablero tablero = new Tablero(TAMANO_TABLERO);
          Jugador jugador1 = new Jugador("Jugador 1");
          
          System.out.println("¡Bienvenido a Serpientes y Escaleras!");
          while (!jugador1.haGanado(TAMANO_TABLERO)) {
              System.out.println(jugador1.getNombre() + " está en la posición " + jugador1.getPosicion());
              System.out.println("Presiona ENTER para lanzar el dado...");
              scanner.nextLine();
              int valorDado = lanzarDado();
              System.out.println("Sacaste un " + valorDado);
              
              jugador1.mover(valorDado, tablero);
              if (jugador1.haGanado(TAMANO_TABLERO)) {
                  System.out.println("¡Felicidades " + jugador1.getNombre() + "! Ganaste el juego.");
                  break;
              }
          }
      }

    private static int lanzarDado() {
        return random.nextInt(6) + 1;
    }
}
