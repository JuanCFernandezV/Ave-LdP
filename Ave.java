//Por medio de abstraccion se logra tener la capacidad de crear una clase como lo es "Ave": con sus atributos, contructores y metodos 

public class Ave {
    //ATRIBUTOS
    //En la primera parte, se encapsulan los atributos de la clase "Ave" a traves del modificador "private"
    private String nombre;
    private String tamano;
    private String color;
    private int edad;
    private boolean capacidadVolar;

    //CONSTRUCTORES

    //Gracias al polimorfismo se pueden crear 2 constructores, los cuales van a determinar con que atributos especificos de la clase "Ave" se van a crear los objetos
    //Constructor 1:
    public Ave(String nombre, String tamano, int edad, String color){
        this.nombre = nombre;
        this.tamano = tamano;
        this.edad = edad;
        this.color = color;
    }

    //Constructor 2:
    public Ave(String nombre, int edad, boolean capacidadVolar){
        this.nombre = nombre;
        this.edad = edad;
        this.capacidadVolar = capacidadVolar;
    }

    //Setters y getters

    //Nombre:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //Tamano:
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    //Edad:
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    //Color:
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //CapacidadVolar:
    public void setCapacidadVolar(boolean capacidadVolar) {
        this.capacidadVolar = capacidadVolar;
    }

    public boolean getCapacidadVolar(){
        return capacidadVolar;
    }

    //Metodos adicionales

    //Hacer que el ave vuele
    public void volar(){
        if (this.capacidadVolar == true) {
            System.out.println(this.nombre + "esta volando");
        } else if (this.capacidadVolar == false){
            System.out.println(this.nombre + " no puede volar");
        }
    }

    //Hacer que el ave haga un sonido
    public void hacerSonido(){
        System.out.println(this.nombre + " esta haciendo un sonido caracteristico");
    }

}
