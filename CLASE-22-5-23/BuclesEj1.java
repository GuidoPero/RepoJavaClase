import java.util.Scanner;
public class BuclesEj1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Linea1");
            System.out.println("Linea2");
            System.out.println("Linea3");
            System.out.println("Desa salir? 1. Si 2.No");
            switch(s.nextInt()){
                case 1:
                System.out.println("Flag cambia a false");
                flag = false;
                break;

                case 2:
                System.out.println("Flag sin cambios");
                break;

                default:
                System.out.println("Opcion incorrecta, vuelva a reintentar");
                break;

            }
        }
    } 
}