import java.util.Scanner;

public class ClaseScanner{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String palabra;
        String nombre;
        int num; 
        int edad;

        //Imprime palabra escrita//
        System.out.print("Ingrese una palabra: ");
        palabra = s.nextLine();
        System.out.println("Su palabra es: " + palabra);

        //Imprime el doble del numero ingresado
        System.out.print("\nIngrese un numero: ");
        num = s.nextInt();
        System.out.println("El doble de su numero es: " + (num * 2));

        //Imprime el nombre y edad ingresados
        System.out.print("Ingrese su nombre y su edad, separados por un espacio: ");
        nombre = s.next();
        edad = s.nextInt();
        System.out.printf("Su nombre es %s y su edad %d", nombre, edad);

    }
}
