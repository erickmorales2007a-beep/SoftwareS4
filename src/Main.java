public class Main {
    public static void main(String[] args) {
        System.out.println("Total antes de crear objetos: " + Dispositivo.getTotalCreados());

        Dispositivo dispositivo1 = new Dispositivo("Mouse Logitech", "Periférico");
        System.out.println("Después de crear uno - Total: " + Dispositivo.getTotalCreados());

        Dispositivo dispositivo2 = new Dispositivo("Teclado Mecánico", "Periférico");
        Dispositivo dispositivo3 = new Dispositivo("Monitor Dell", "Pantalla");

        System.out.println("Total después de crear tres: " + Dispositivo.getTotalCreados());

        System.out.println("\n--- Detalle de Objetos ---");
        System.out.println("Objeto 1 → ID " + dispositivo1.getId() + " | Nombre: " + dispositivo1.getNombre());
        System.out.println("Objeto 2 → ID " + dispositivo2.getId() + " | Nombre: " + dispositivo2.getNombre());
        System.out.println("Objeto 3 → ID " + dispositivo3.getId() + " | Nombre: " + dispositivo3.getNombre());
    }
}