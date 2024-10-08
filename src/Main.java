
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Sujeto sujeto = new Sujeto();

        new PantallaTablet(sujeto);
        new PantallaCelular(sujeto);
        new PantallaTv(sujeto);

        System.out.println("Ingrese el mensaje que quiere notificar a las pantallas");
        String mensaje = scanner.nextLine();

        System.out.println("********************************"); 
        System.out.println("Enviando mensaje a los 3 dispositivos... ");
        sujeto.setNotificacion(mensaje);
        System.out.println("********************************"); 
    }
}
