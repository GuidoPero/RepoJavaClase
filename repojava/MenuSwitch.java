public class MenuSwitch {
    public static void main(String[] args){
        int seleccion;
        int num1;
        int num2;

        System.out.print("ingrese numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese otro numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        

        System.out.println("***Menu de opciones***");
        System.out.println("1: suma");
        System.out.println("2: resta");
        System.out.println("3: multiplicacion");
        System.out.println("4: division");
        seleccion = Integer.parseInt(System.console().readLine());
        
        switch(seleccion){
            case 1:
            System.out.println("la suma de los numeros es: " + (num1 + num2));
                break;
            case 2:
            System.out.println("La resta de los numeros es: " + (num1 - num2));
                break;    
            case 3:
            System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                break;
            case 4:
            System.out.printf("La division de los numeros es:  %.4f", ((double)num1 / (double)num2));
                break;    
            default:
                System.out.println("Opcion incorrecta");    
        }


    }
    
}
