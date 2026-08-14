import java.time.LocalDate;

 class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("CLI-001", "Carlos Mendoza", "carlos.mendoza@email.com", "+54 9 261 4567890");

        Pedido pedido1 = new Pedido("PED-101", LocalDate.now(), 25000.00, "Pendiente", cliente1);
        Pedido pedido2 = new Pedido("PED-102", LocalDate.now(), 18400.50, "En Proceso", cliente1);

        pedido1.cambiarEstado("Enviado");

        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();
    }
}