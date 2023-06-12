public class EjemploSwitchCase2 {
    public static void main(String[] args){
        String nombre;
        String seleccion;

        System.out.println("Ingrese un nombre");
        
        System.out.println("***Menu de opciones***");
        System.out.println("Ricardo");
        System.out.println("Justin");
        System.out.println("messi");
        System.out.println("sanlore");
        seleccion = (System.console().readLine());

   

        switch(seleccion){
            case "ricardo":
                System.out.println("MAIAMEEEEE");
                break;
            case "justin":
                System.out.println("te amo yastiiiin");
                break;
            case "messi":    
                System.out.print("muchaaaaaaaaachos");
                break;
            case "sanlore":    
            System.out.print("dale sanloree queremos la cooopa");
                break;
        }

    }
}
