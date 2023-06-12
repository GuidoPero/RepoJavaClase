public class Calculadora1{
    public static void main(String[] args){
        int num1;
        int num2;

        System.out.print("ingrese numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese otro numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);
        //Usar ".println"//
    } 
}