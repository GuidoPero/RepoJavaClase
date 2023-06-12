import java.util.Scanner;
public class EjemplosSwichtCase {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numeroMes;
        
        System.out.println("Ingrese número del mes");
        numeroMes = s.nextInt();

        switch(numeroMes){
            case 1:
                System.out.println("el mes es enero");
                break;
            case 2:
                System.out.println("el mes es febrero");
                break;    
            case 3:
                System.out.println("el mes es marzo");
                break;
            case 4:
                System.out.println("el mes es abril");
                break;
            case 5:
                System.out.println("el mes es mayo");
                break;
            case 6:
                System.out.println("el mes es junio");
                break;
            case 7:
                System.out.println("el mes es julio");
                break;
            case 8:
                System.out.println("el mes es agosto");
                break;
            case 9:
                System.out.println("el mes es septiembre");
                break;
            case 10:
                System.out.println("el mes es octubre");
                break;
            case 11:
                System.out.println("el mes es noviembre");
                break;
            case 12:
                System.out.println("el mes es diciembre");
                break;
            default:
            System.out.println("El numero es incorrecto");
        }
    }
}
