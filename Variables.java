public class Variables {
    public static void main(String[] args){
        int num; //declaracion
        int num2 = 20; //declaracion con inicializacion
        int resultado; 
        num = 10; //inicializacion
        resultado = num + num2;
        //System.out.println(num);
        //System.out.println(num2);
        //System.out.println(resultado);

        /*System.out.println("numero 1: " + num + 
                           "\nnumero 2: " + num2 + 
                           "\nresultado: " + resultado);*/
        System.out.printf("numero1: %d \nnumero2: %d \nresultado: %d", num,num2,(num + num2));                   
    }
}
