public class Main {
    public static void main(String[] args) {

            // Sexto requerimiento: Crear objeto miCoche
        coche miCoche = new coche();
        miCoche.incrementoPuertas();
        miCoche.incrementoPuertas();

            // Septimo requerimiento: Mostrar numero de puertas del objeto miCoche
        System.out.println(miCoche.numeroPuertas);

            // Segundo requerimiento: LLamar a la función y darle valores
        int resultado;
        resultado = suma(10, 10, 10);

            //Resultado suma de tres parametros
        System.out.println(resultado);
    }

            // Primer requerimiento: Función con 3 parametros
    public static  int suma(int a, int b, int c){
        return a + b + c;
    }

            // Tercer requerimiento: Crear una clase coche
    static class coche{

            //Cuarto requerimiento: Variable numérica que almacene número de puertas
        public int numeroPuertas = 0;

            //Quinto requerimiento: Función que incrementa numero de puertas
        public  void incrementoPuertas() {
            this.numeroPuertas++;
        }

    }
}