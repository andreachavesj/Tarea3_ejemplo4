import java.util.Scanner;

public class Main {
    private static final Scanner leerNumeros = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca el numero de la opción que desea conocer el área");
        System.out.println("1.Circulo");
        System.out.println("2.Cuadrado");
        int opcion = leerNumeros.nextInt();
        if (opcion==1){
            System.out.println("Ingrese el radio del circulo: ");
            int radio= leerNumeros.nextInt();
            Circulo circulo= new Circulo(radio);
            System.out.println("El área es: "+circulo.area());
        }else if(opcion==2){
            System.out.println("Ingrese el tamaño del lado del cuadrado: ");
            int lado= leerNumeros.nextInt();
            Cuadrado cuadrado= new Cuadrado(lado);
            System.out.println("El área es: "+cuadrado.area());
        }
    }
}