public class FuncionMathRandom {
    public static void main (String[] args){
         //System.out.println(Math.random());    //Imprime numeros entre 0 a 1
       int[] vectorRandom = new int[50];
        for(int i = 0; i < 50; i++){
            vectorRandom[i] = (int)(Math.random()*10) + 1;    //Convierte en enteros los numeros
        }
        for(int i = 0; i <vectorRandom.length; i++)
            System.out.print(" " + vectorRandom[i]);
    }
}