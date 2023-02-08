import java.util.Scanner;

public class Partida extends Participante{
    int A2;
    int maquina;
    int usuario;
    int b;
    String nombre;


    public static void main(String[] args) {
        int i;
        Partida par = new Partida();
        par.Inicio();
        for(i = 1; i <=10; i++) {
            par.CruzCara();
            par.setNombre(par.nombre);
            par.maquina = par.Aleatorio2();
            par.usuario = par.Aleatorio2();
            if (par.usuario == par.b) {
                par.setVitorias(par.vitorias = par.vitorias + 1);
            } else {
                par.setDerrotas(par.derrotas = par.derrotas + 1);
            }
            par.setPartidas(par.partidas = par.partidas + 1);
            par.Resumen();
        }

    }

    public int Aleatorio2() {
        A2 = (int)(Math.random()*1);
        return A2;
    }
    public int CruzCara() {
        int Numero = (int)(Math.random()*2);
        String A;
        if(Numero==1){
            A="Cara";
            b=1;
        }
        if(Numero==0){
            A="Cruz";
            b=0;
        }
        return b;
    }
    public void Inicio(){
        Partida par = new Partida();
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = escaner.nextLine();
        par.setNombre(nombre);
        System.out.println("Introduce el nombre de tu rival:");
        String rival = escaner.nextLine();
        par.setNombre(rival);
    }
}
