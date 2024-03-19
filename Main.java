public class Main {
    public static void main(String[] args) {
        //POLIMORFISMO Y HERENCIA
        //Al momento de crear los objetos estos heredan los atributos y los metodos de la clase "Ave"

        //Objetos de la clase creados a partir del primer constructor
        Ave aveA_1 = new Ave("Buho Real", "Grande", 14, "Negro");
        Ave aveA_2 = new Ave("Colibri", "Pequeño", 2, "Azul");
        Ave aveA_3 = new Ave("Gallina", "Pequeño", 6, "Naranja");

        //Objetos de la clase creados a partir del segundo constructor
        Ave aveB_1 = new Ave("Aguila Calva", 26, true);
        Ave aveB_2 = new Ave("Pinguino Emperador", 10, false);
        Ave aveB_3 = new Ave("Avestruz", 30, false);

        //Al momento de crear los objetos estos heredan los atributos y los metodos de la clase "Ave"

        
        //Prueba para verificar si los metodos funcionan correctamente
        String ab = aveB_3.getNombre();
        System.out.println(ab);
        aveB_3.setNombre("Ave cuello largo");
        ab = aveB_3.getNombre();
        System.out.println(ab);

        aveB_2.volar();
        aveB_2.hacerSonido();

        
    }
}
