public class repaso1_5 {
    public static void main(String[] args){
        int op;

        System.out.println("Ingrese una opcion");
        System.out.println("Ingrese la opcion 1");
        System.out.println("Ingrese la opcion 2");
        System.out.println("Ingrese la opcion 3");
        System.out.println("Ingrese la opcion 4");
        
        op = Integer.parseInt(System.console().readLine());
        switch(op){
            case 1: 
            System.out.println("El usuario ingreso la opcion 1");
            break;

            case 2: 
            System.out.println("El usuario ingreso la opcion 2");
            break;

            case 3: 
            System.out.println("El usuario ingreso la opcion 3");
            break;

            case 4: 
            System.out.println("El usuario ingreso la opcion 4");

            default:
            System.out.println("Numero equivocado");
        }
    }
}