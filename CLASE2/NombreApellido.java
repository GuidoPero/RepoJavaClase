public class NombreApellido{
    public static void main(String[] args ){
        String nombre;
        String apellido;

        System.out.print("Ingrese su nombre: ");
        nombre = System.console().readLine();
        System.out.print("\nIngrese su apellido: ");
        apellido = System.console().readLine();

        System.out.print("Mi nombre es: " + nombre + " " + apellido); 

    }
}
