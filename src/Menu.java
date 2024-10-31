import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public Menu() throws IOException, InterruptedException {

        //Menu de opciones
        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcion;
        System.out.println("Menú de opciones: ");

        while (true) {
            System.out.println("----------------------------------------\n");
            System.out.println("1. Dólar estadounidense => Peso argentino");
            System.out.println("2. Dólar estadounidense => Boliviano boliviano");
            System.out.println("3. Real brasileño => Dólar estadounidense");
            System.out.println("4. Dólar estadounidense => Peso colombiano");
            System.out.println("5. Peso chileno => Dólar estadounidense");
            System.out.println("6. Salir\n");

            try {
                System.out.println("----------------------------------------\n");
                System.out.println("Escoja una opción: ");
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        conversor.setMoneda("USD");
                        conversor.setSegundaMoneda("ARS");
                        System.out.println("\nConvertir de Dólar estadounidense a Peso Argentino");
                        ejecutar_Request(conversor);
                        break;
                    case 2:
                       conversor.setMoneda("USD");
                        conversor.setSegundaMoneda("BOB");
                        System.out.println("\nConvertir de Dólar estadounidense a Boliviano boliviano");
                        ejecutar_Request(conversor);
                        break;
                    case 3:
                        conversor.setMoneda("USD");
                        conversor.setSegundaMoneda("BRL");
                        System.out.println("\nConvertir de Real Brasileño a Dólar estadounidense");
                        ejecutar_Request(conversor);
                        break;
                    case 4:
                        conversor.setMoneda("USD");
                        conversor.setSegundaMoneda("COP");
                        System.out.println("\nConvertir de Dólar estadounidense a Peso Colombiano");
                        ejecutar_Request(conversor);
                        break;
                    case 5:
                        conversor.setMoneda("CLP");
                        conversor.setSegundaMoneda("USD");
                        System.out.println("\nConvertir Peso Chileno a Dólar estadounidense");
                        ejecutar_Request(conversor);
                        break;
                    case 6:
                        System.out.println("\nSaliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Solo numeros de 1 al 6");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                lectura.next();
            }
        }
    }

    //Llamar el API_REQUEST
    private static void ejecutar_Request(Conversor conversor) throws IOException, InterruptedException {
        try {
            new API_Request(conversor);
        }catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la solicitud" + e.getMessage());
        }
    }
}

