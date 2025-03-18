
public class Jugador {
private String nombre;
    private int posicion;
    private int contadorSeis;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.posicion = 1;
        this.contadorSeis = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

  public void mover(int valorDado, Tablero tablero) {
    int nuevaPosicion = posicion + valorDado;
    
    if (nuevaPosicion == 64) {
        posicion = 64;
        System.out.println(nombre + " ha llegado a la meta y ganó el juego");
        return;
    }

    // Si el jugador se pasa de la última casilla, retrocede las posiciones excedentes
    if (nuevaPosicion > 64) {
        nuevaPosicion = 64 - (nuevaPosicion - 64); // Rebote como en un juego de mesa
    }

    // Verificar si la nueva posición es una casilla especial y moverse automáticamente
    nuevaPosicion = tablero.obtenerDestino(nuevaPosicion);
    
    // Actualizar la posición del jugador
    posicion = nuevaPosicion;
}

    public boolean haGanado(int meta) {
        return posicion == meta;
    }
}