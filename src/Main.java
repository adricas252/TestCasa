public class Main {
    public static void main(String[] args) {
        // Crear una casa
        Casa casa = new Casa("Avenida de la Fraternitat");
        // Crear una habitación utilizando la casa
        Casa.Habitacion habitacion =
                casa.new Habitacion("Salón");

        // Mostrar información de la habitación
        habitacion.imprimir();
        System.out.println();
        // Crear una constructora SIN crear una casa
        Casa.Constructora constructora =
                new Casa.Constructora("Obras Sur");
        // Mostrar información de la constructora
        constructora.imprimir();
    }
}


