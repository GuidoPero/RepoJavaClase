public class vectores {
    public static void main(String[] args){
        int[] vector = new int[5];

        for(int i = 0; i < 5; i++){
            vector[i] = (int)(Math.random() * 10);
        }
        for(int i = 0; i <5; i++){
            System.out.println(vector[i]);
        }
    }
}