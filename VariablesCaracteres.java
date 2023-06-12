public class VariablesCaracteres {
    public static void main(String[] args){
        char letra1 = 'h';
        char letra2 = 'o';
        char letra3 = 'l';
        char letra4 = 'a';
        String palabra = "\ncerveza";
        String frase = "\033[35m no me gusta!";
        String parrafo = frase + " la " + palabra;
        //System.out.println(letra2);
        //System.out.println(letra4);
        //System.out.print(letra1 + "" + letra2 + "" + letra3 + "" + letra4);
        System.out.println(palabra);
        System.out.println("mi palabra: " + palabra + "\nmi frase: " + frase);
        System.out.println(parrafo);
    }
}

