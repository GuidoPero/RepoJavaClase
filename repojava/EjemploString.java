public class EjemploString {
    public static void main(String[] args){
        //String palabra1 = "hola";
        //String palabra2 = "hola";
        //String palabra3 = new String("hola");


        String clave = "clave";
        String claveIngresada;
        //System.out.println(palabra1 == palabra2); //para comparar se usan ==
        //System.out.println(palabra1 != palabra2); //negacion !=
        //System.out.println(palabra2 == palabra3);
        //System.out.println(palabra2 != palabra3);

        System.out.println("ingrese clave");
        claveIngresada = System.console().readLine();

        if (clave.equals(claveIngresada)){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Clave Incorrecta");
            System.out.println("ingresaste " + claveIngresada);

            }
        }
    }

        /*if (claveIngresada == clave){
            System.out.println("Bienvenido");

        }else{
            System.out.println("Clave Incorrecta");
            System.out.println("ingresaste " + claveIngresada);
        }

        System.out.println(System.identityHashCode(palabra1));
        System.out.println(System.identityHashCode(palabra2));
        System.out.println(System.identityHashCode(palabra3));
    }
}
*/