import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3];
        String[] nombresFormat = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del numero " + (i+1) + " de la familia");
            nombres[i] = scanner.nextLine();
        }

        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("nombres = " + nombres[i]);
            nombresFormat[i] = String.valueOf(nombres[i].charAt(1));
            nombresFormat[i] = nombresFormat[i].toUpperCase().concat(".").concat(nombres[i].substring(nombres[i].length()-2));
            System.out.println("nombresFinal = " + nombresFormat[i]);
        }
    }
}
