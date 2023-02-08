public class Usuario extends Participante{
    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.CruzCara("Cruz");
        user.Resumen();

    }

    public int CruzCara(String A) {
        int b=0;
        if(A=="Cara"){
            b=1;
        }
        if(A=="Cruz"){
            b=0;
        }
        return b;
    }
}
