public class Maquina extends Participante{
    public static void main(String[] args) {
        Maquina par = new Maquina();
        par.Aleatorio();
    }

    public int Aleatorio() {
        int A = (int)(Math.random()*1);
        System.out.println(A);
        return A;
    }
}

