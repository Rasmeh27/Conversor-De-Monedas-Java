import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Mensaje de bienvenida...
        System.out.println("------Bienvenido al Conversor de Monedas!------\n");
        //Llamar menu de opciones
        Menu menu = new Menu();
        System.out.println(menu);
    }
}
