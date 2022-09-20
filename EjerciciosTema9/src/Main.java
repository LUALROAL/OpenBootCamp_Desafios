public class Main {

    public static void main(String[] args) {

        //Objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Alejandro");
        cliente.setEdad(33);
        cliente.setTelefono("3126527315");
        cliente.setCredito(5000);

        System.out.println("Datos del Cliente:  " + "     Nombre: " + cliente.getNombre() + "  Edad: " + cliente.getEdad() + "  Telefono: " + cliente.getTelefono() + "  Credito: " + cliente.getCredito());

        //Objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Andrea");
        trabajador.setEdad(25);
        trabajador.setTelefono("313284509");
        trabajador.setSalario(1000);

        System.out.println("Datos del Trabajador:  " + "  Nombre: " + trabajador.getNombre() + "     Edad: " + trabajador.getEdad() + "  Telefono: " + trabajador.getTelefono() + "   Salario: " + trabajador.getSalario());


    }

}

   class Persona{
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        private int edad;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        private String telefono;

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
    class Cliente extends Persona{
        private int credito;

        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }

    }

    class Trabajador extends Persona{

        private int salario;

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

    }
