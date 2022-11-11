package OBSesion2;

public class EjercicioSesion3 {

    public static void main(String[] args) {

        String cadena = new String("juan carlos lopez arboleda");
        int nombres = 0;

        int num = 1;
        while (num <= nombres) {
            cadena += "";
            for (int i = 1; i <= num; i++ )
                cadena += i;
            num ++;

        }
        System.out.println(cadena);
    }

}
