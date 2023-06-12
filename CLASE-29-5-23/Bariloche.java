public class Bariloche {
    public static void main (String[] args){
        int[] vectorTemp = new int[12];
        int[] vectorHum = new int[12];

        for(int i = 0; i < 12; i++){
            vectorTemp[i] = (int)(Math.random()*20) + 1;
            vectorHum[i] = (int)(Math.random()*101);
        }

        System.out.println(" ");
        
        for(int i = 0; i < 12; i++){
            System.out.println(" " + vectorTemp[i] + "°");
            System.out.println(" " + vectorHum[i] + "%");
        }
    }
}
