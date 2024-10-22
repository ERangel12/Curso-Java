import java.util.Scanner;

public class TareaFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double productPrice1 = 0;
        double productPrice2 = 0;

        System.out.println("Ingrese el nombre de la factura");
        String nameFact = scanner.nextLine();

        try{
            System.out.println("Imgrese el primer valor del producto");
            productPrice1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo valor del producto");
            productPrice2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ingrese ambos precios correctamente");
            return;
        }

        double totalBruto = productPrice1+productPrice2;
        double impuesto = (totalBruto) * 0.19;
        double total = totalBruto + impuesto;

        System.out.println("La factura " + nameFact + " tiene un total bruto de " +  totalBruto +", con un impuesto de " +impuesto+ " y el monto después de impuesto es de " + total);

    }
}
