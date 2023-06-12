import java.util.Scanner;
public class ArraysEj1vectores2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int vector[] = new int[10];
        int[] vector2 = {2, 5, 6, 9, 7, 10, 21, 35, 20, 14, 97, 100, 47, 35, 14, 99};
        int numeroIngresado;
        /*
        for(int i = 0; i < 10 ; i ++){
            System.out.print("ingrese un numero entre 20 y 50 " + i + ": ");
            numeroIngresado = s.nextInt();
            while(numeroIngresado < 20 || numeroIngresado > 50){
                System.out.println("Numero fuera del rango, ingrese nuevamente");
                numeroIngresado = s.nextInt();
            }
            vector[i] = numeroIngresado;      
        }

             

        System.out.println("Valores del vector: ");
        for(int i = 0; i < 10 ; i ++){
            System.out.println("indice " + 1 + ": " + vector[i]);
        } */

        System.out.println("longitud del vector: " + vector2.length);

        System.out.println("Valores del vector 2: ");
        for (int i = 0; i < vector2.length; i ++){
            System.out.println("indice " + i + ": " + vector2[i]);
        }
    }
}