import java.util.Scanner;
public class Promedios {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int num1;   
        int num2;
        int num3;

        System.out.print("Ingrese 3 numeros dejando espacios entre si: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        System.out.printf("Sus numeros son: %d, %d y %d ", num1, num2, num3);
        System.out.printf("\nEl promedio de sus 3 numeros es: " + (num1 * num2 * num3 /3));
    }
}
