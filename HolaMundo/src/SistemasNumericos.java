import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr =  JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error no se ingreso un valor correcto");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numeroBinario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);


        System.out.println("numeroOctal de  = " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal));
        
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numeroHexadecimal de  = " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "numeroBinario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\n numeroOctal de  = " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal);
        mensaje += " \n numeroHexadecimal de  = " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
