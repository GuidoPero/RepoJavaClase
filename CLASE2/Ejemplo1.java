public class Ejemplo1 {

    public static void main(String [] args ){
        String palabra1;
        String palabra2;
        System.out.print("Ingrese palabra1: ");
        palabra1 = System.console().readLine();
        System.out.print("`\nIngrese palabra2: ");
        palabra2 = System.console().readLine();

        System.out.print(palabra1 + " " + palabra2);
    }
}