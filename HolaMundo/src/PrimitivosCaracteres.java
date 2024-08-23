public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);

        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = carcetr :" + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = carcetr :" + (simbolo == caracter));

        char espacio = '\u0020';
        char retoceso = '\b';
        char tabulador = '\t';
        char saltoLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte"+ espacio + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("character.MIN_Value = " + Character.MIN_VALUE);
        System.out.println("character.MaxValue = " + Character.MAX_VALUE);





    }
}
