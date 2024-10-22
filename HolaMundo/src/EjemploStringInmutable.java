public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Emmanuel Rangel";
        
        String redsultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("redsultado = " + redsultado);
        System.out.println(curso == redsultado);

        String resultado2 = curso.transform(c ->{
            return  c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = redsultado.replace("a","A");
        System.out.println("redsultado = " + redsultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
