public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Adrian Velez");
        cliente.setNumTelefono(1234567890);
        cliente.setCredito(true);

        System.out.println("cliente = " + cliente);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Juan Diaz");
        trabajador.setNumTelefono(1234567810);
        trabajador.setSalario(20000);


        System.out.println("trabajador = " + trabajador);





    }
}