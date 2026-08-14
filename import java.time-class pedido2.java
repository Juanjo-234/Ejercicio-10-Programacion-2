import java.time.LocalDate;

 class Pedido {
    // Atributos básicos
    private String idPedido;
    private LocalDate fecha;
    private double montoTotal;
    private String estado;

    private Cliente cliente;

    public Pedido(String idPedido, LocalDate fecha, double montoTotal, String estado, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.estado = estado;
        this.cliente = cliente;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void mostrarInformacion() {
        System.out.println("==========================================");
        System.out.println("          INFORMACIÓN DEL PEDIDO          ");
        System.out.println("==========================================");
        System.out.println("ID Pedido   : " + idPedido);
        System.out.println("Fecha       : " + fecha);
        System.out.println("Monto Total : $" + montoTotal);
        System.out.println("Estado      : " + estado);
        System.out.println("------------------------------------------");
        System.out.println("DATOS DEL CLIENTE ASOCIADO:");
        if (cliente != null) {
            System.out.println(" - Nombre   : " + cliente.getNombre());
            System.out.println(" - ID       : " + cliente.getIdCliente());
            System.out.println(" - Email    : " + cliente.getEmail());
            System.out.println(" - Teléfono : " + cliente.getTelefono());
        } else {
            System.out.println(" - Sin cliente asignado.");
        }
        System.out.println("==========================================\n");
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

