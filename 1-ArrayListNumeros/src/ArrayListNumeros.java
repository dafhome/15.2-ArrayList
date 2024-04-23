import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumeros {
    public static void main(String[] args) throws Exception {
        // 1- Rellenar ArrayList y mostrar resultado:
        // Crear un arraylist mediante un bucle con los números del 20 al 50. 
        // Mostrar después todo el contenido del arraylist final.
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        boolean validarNumero = true;

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Vamos a crear un Array entre dos números y al final lo imprimiremos.");
        System.out.println("Indica el número menor:");
        int numeroMenor = 0;
        int numeroMayor = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Indica un valor numerico:");
            scan.nextLine();
        }
        // int numeroMenor = scan.nextInt();
        numeroMenor = scan.nextInt();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Ahora indicame un número mayor que "+numeroMenor);
        while (!scan.hasNextInt()&&scan.nextInt()>numeroMenor) {
            System.out.println("Indica un valor numerico y mayor que "+numeroMenor+":");
            scan.nextLine();
        }
        // int numeroMenor = scan.nextInt();
        numeroMayor = scan.nextInt();

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("El array de números entre "+numeroMenor+" y "+numeroMayor+" es:");
        for (int i = numeroMenor; i<=numeroMayor; i++ ){
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            System.out.print(numero+" ");    
        }
        System.out.println(" ");
        scan.close();

    }
}
