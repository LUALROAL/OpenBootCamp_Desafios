public class Main {
    public static void main(String[] args) {

            //variable ejercicio if
            int numeroIf = -1;

                //Ejercicio numero 1 usando if

            if (numeroIf > 0){
                System.out.println("Resultado Ejercicio numero 1 usando if");
                System.out.println("El numero " + numeroIf + " es positivo");
            }
                else if ( numeroIf < 0){
                System.out.println("Resultado ejercicio numero 1 usando if");
                System.out.println("El numero " + numeroIf + " es negativo");
        }
                else {
                System.out.println("Resultado Ejercicio numero 1 usando if");
                System.out.println("El valor de la variable es: 0");
            }


                //Ejercicio numero 2 usando While

                System.out.println("Resultado ejercicio numero 2 usando While");

            //variable ejercicio While y Do While
            int numeroWhile = 0;

            while (numeroWhile < 3){
                System.out.println("El valor es de: " + numeroWhile);
                numeroWhile = numeroWhile + 1;
            }


                //Ejercicio numero 3 usando Do While

            do {
                System.out.println("Resultado ejercicio numero 3 usando Do While");
                System.out.println("El valor es de: " + numeroWhile);
                numeroWhile = numeroWhile + 1;
            } while (numeroWhile < 3);

               //Ejercicio numero 4 usando For

                System.out.println("Resultado ejercicio numero 4 usando For");
            for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){

                System.out.println("El valor es de: " + numeroFor);
            }


                //ejercicio numero 5 usando Switch y Case

                System.out.println("Resultado ejercicio numero 5 usando Switch y Case");

            //variable ejercicio Switch
            var estacion = "Otoño";

            switch (estacion){
                case "Verano":
                    System.out.println("Es Verano");
                    break;

                case "Invierno":
                    System.out.println("Es Invierno");
                    break;

                case "Otoño":
                    System.out.println("Es Otoño");
                    break;

                case "Primevera":
                    System.out.println("Es Primevera");
                    break;

                default:
                    System.out.println(estacion + " No es una estación");
            }

    }
}