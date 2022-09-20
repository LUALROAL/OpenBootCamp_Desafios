import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setTipo("Persona");
        persona.setNombre("Alejandro");
        persona.setEdad(33);
        persona.setTelefono("3126512370");

        System.out.println(persona.getTipo() +  " 1 " +" *Nombre: "+ persona.getNombre()  +" *Edad: "+ persona.getEdad()  +" *Telefono: "+ persona.getTelefono());

    }
}

    class Persona{
        private String tipo;

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return this.tipo;
        }

        private String nombre;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        private int  edad;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        private  String telefono;

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return this.telefono;
        }
    }
