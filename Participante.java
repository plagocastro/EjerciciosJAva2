public class Participante {

    public int vitorias;
    public int derrotas;
    public int partidas;
    private String nombre;
    public String cadena;

    public int getDerrotas() {
        return derrotas;
    }

    public int getPartidas() {
        return partidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String Resumen() {
        cadena = "\n"+"Jugador: "+nombre+" ganaste: "+vitorias+", perdiste: "+derrotas+", intentos: "+partidas+"\n";
        System.out.printf(cadena);
        return cadena;
    }
}