
public class Tablero {
  private final int[] casillas;
    private final int[] origenCasillasEspeciales = {7, 11, 31, 30, 40, 43, 50, 59};
    private final int[] destinoCasillasEspeciales = {38, 37, 46, 2, 21, 60, 5, 42};

    public Tablero(int tamaño) {
        casillas = new int[tamaño];
        inicializarCasillasEspeciales();
    }

    private void inicializarCasillasEspeciales() {
        for (int i = 0; i < origenCasillasEspeciales.length; i++) {
            casillas[origenCasillasEspeciales[i]] = destinoCasillasEspeciales[i];
        }
    }

    public int obtenerDestino(int posicion) {
        return casillas[posicion] != 0 ? casillas[posicion] : posicion;
    }

    public int getTamaño() {
        return casillas.length;
    }
}
