package OBSesion2;
//Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido, IVA = 15%
import java.util.Scanner;

public class EjercicioSession2 {

    public static double calcularIVA(double precio) {
        double IVA;
        IVA = precio * 0.15;
        return IVA;
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double precioDeLaCompra, IVA;

        System.out.println("Ingrese el precio del producto: ");
        precioDeLaCompra = lector.nextDouble();

        IVA = calcularIVA(precioDeLaCompra);

        System.out.println("El precio total sin iva es de : "+ precioDeLaCompra);
        System.out.println("El precio a pagar con IVA incluido es de: "+(precioDeLaCompra+IVA));

    }
}
