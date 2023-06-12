import java.util.Scanner;

public class DolarPeso {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int dolar;

        System.out.print("Ingrese la cantidad de dolares que desea cambiar a pesos: ");
        dolar = s.nextInt();
        System.out.println("El cambio de dolar oficial a peso es: " + (dolar * 229.43));

    }
}
