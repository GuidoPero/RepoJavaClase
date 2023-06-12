public class Ejemplo2{
    public static void main(String[] args){
        String num1Char = "10";
        String num2Char = "20";
        int num1;
        int num2;
        int resultado;

        /*System.out.print(num1Char + num2Char);

        num1 = Integer.paseInt(num1Char);
        num2 = Integer.parseInt(num2Char);

        System.out.println(num1 + num2);
        */

        System.out.print("ingrese numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese otro numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        //resultado = num1 + num2;

        System.out.print(num1 + num2);
    }
}