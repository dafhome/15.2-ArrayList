import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class RecepcionInternacional {
    public static void main(String[] args) throws Exception {
        // 3- CRUD: recepción internacional... y universal!
        // Te han encargado organizar la recepción oficial para el primer contacto
        // extraterrestre, en la montaña de Montserrat.
        // Solo unos pocos en el mundo pueden asistir. ¿A quién enviarías? De momento la
        // lista sólo puede ser de cinco elegid@s.
        // Pero dos de ellos, en los puestos 2 y 3, se asustan y se dan de baja, y entra
        // entonces el personaje X (darle nombre) en el puesto 2.
        // La persona que está en el último puesto, se pone enferma y te recomienda que
        // pongas en su lugar al personaje Y (darle nombre). Ojo con saber qué índice es
        // el último
        // En el último momento, se añade el personaje Z (darle nombre) al puesto
        // vacante (puesto 3).
        // Ves mostrando a cada paso cómo va quedando la lista actualizada: los medios
        // están muy interesados en seguir la noticia al minuto!
        //

        Scanner scan = new Scanner(System.in);

        ArrayList<String> elegidos = new ArrayList<>();
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println(
                "Bienvenid@s al primer contacto extraterrestre en el mundo. Este tendrá lugar en la famosa montaña de Montserrat.");
        System.out.println("Están aquí reunidos para mostrar la lista definitiva con los cinco elegid@s.");
        System.out.println();
        System.out.println("Jurado! Indicadme los cinco elegid@s en orden.");
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                System.out.println("Indicame al siguiente elegid@:");
            }
            elegidos.add(scan.nextLine().toUpperCase());
            System.out.println();
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("La primera lista de elegid@s es:");
        for (String persona : elegidos) {
            System.out.print(persona + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println(
                "Lamentablemente la segunda y tercera persona no podrán presentarse, estos puestos se han quedado libres");
        System.out.println();
        System.out.println("---------------------ULTIMA HORA--------------------");
        System.out.println(elegidos.get(1) + " tiene a alguien para que esté en su lugar.");
        System.out.println(elegidos.get(1) + " indicanos quien es tan afortunad@:");
        elegidos.set(1, scan.nextLine().toUpperCase());
        elegidos.set(2, "LIBRE");

        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("La lista de elegid@s actualizada es:");
        for (int i = 0; i < elegidos.size(); i++) {
            System.out.print(elegidos.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------------ULTIMA HORA--------------------");
        System.out.println(elegidos.get(4) + " no se encuentra bien pero también tiene a alguien para recomendar.");
        System.out.println(elegidos.get(4)+" indicanos quien es tan afortunad@:");
        elegidos.set(4, scan.nextLine().toUpperCase());
        System.out.println();

        System.out.print("Lista actualizada: ");
        for (String persona : elegidos) {
            System.out.print(persona+" ");
        }

        System.out.println();
        System.out.println("---------------------ULTIMA HORA--------------------");
        System.out.println("Cuando pensabamos que ya teniamos la lista cerrada con una vacante ha aparecido:");
        elegidos.set(2, scan.nextLine().toUpperCase());



        System.out.println();
        System.out.println("---------------------ULTIMA HORA--------------------");
        System.out.println("La lista de elegid@s actualizada es:");
        System.out.println();
        for (String persona : elegidos) {
            System.out.println(persona);
        }
        
        
        scan.close();

    }
}
