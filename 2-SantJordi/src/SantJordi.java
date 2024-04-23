import java.util.ArrayList;
import java.util.Scanner;

public class SantJordi {
    public static void main(String[] args) throws Exception {
        // 2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.
        // Para acabar, escribir 'salir'. Al final, mostrar todos los elementos
        // introducidos por el usuario.
        Scanner scan = new Scanner(System.in);
        ArrayList<String> santJordi = new ArrayList<>();
        System.out.println();
        boolean validar = false;
        boolean validar2 = false;
        boolean elemento = false;
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("Indicame todos los elementos típicos de Sant Jordi que conozcas");
        // System.out.println("Indica S o SALIR para finalizar");

        while (!validar) {
            if (elemento) {
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                System.out.println("Introduce otro elemento típico de Sant Jordi");
            }
            santJordi.add(scan.nextLine().toUpperCase());
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");

            System.out.println("¿Quieres introducir otro elemento? Responde S/N:");
            validar2 = false;
            String respuesta = scan.nextLine();
            while (!validar2) {
                if (respuesta.equalsIgnoreCase("n") | respuesta.equalsIgnoreCase("no")) {
                    validar = true;
                    validar2 = true;
                } else if (respuesta.equalsIgnoreCase("s") | respuesta.equalsIgnoreCase("si")) {
                    elemento = true;
                    validar2 = true;
                } else {
                    System.out.println("Por favor, responde S/N");
                    respuesta = scan.nextLine();
                }
            }

        }
        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("Muchas gracias! Los elementos que consideras tipicos de Sant Jordi son:");
        for (String tipico : santJordi) {
            System.out.print(tipico + " ");
        }
        System.out.println(" ");
        scan.close();
    }
}
