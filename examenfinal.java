import java.util.Scanner;

public class examenfinal {

    public static void main(String[] args) {
        
        Scanner Entrada=new Scanner(System.in);
        int opcion;

        System.out.print("Número: ");
        int num1=Entrada.nextInt();

        int resultado=num1+num1*2;
        System.out.println("El resultado es " + resultado);

        System.out.println(" ");
        
        System.out.print("Numero: ");
        int num2=Entrada.nextInt();
        
        int resultado2=num2*num2-num2*3*3*3;
        System.out.println("El resultado es " + resultado2);

        System.out.println(" ");

        System.out.print("Numero 1: ");
        int num3=Entrada.nextInt();

        System.out.print("Numero 2: ");
        int num4=Entrada.nextInt();

        System.out.print("Numero 3: ");
        int num5=Entrada.nextInt();

        int resultado3=(num3+num4+num5) / 3;
        System.out.println("El resultado es " + resultado3);

        System.out.println(" ");

        System.out.print("Numero: ");
        int num6=Entrada.nextInt();

        int resultado4=num6*num6+(num6+1); 
        System.out.println("El resultado es " + resultado4);

        System.out.println(" ");

        do {
            System.out.println("[1] Caclular la moda");
            System.out.println("[2] La mitad es");
            System.out.println("[3] Di hola mundo");
            System.out.println("[4] Salir");
            System.out.print("[?]: ");
            opcion=Entrada.nextInt();

            switch (opcion) {
                case 1:
                int[] opciones = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9};

                int moda = 0, maximaFrecuencia = 0;
            
                for (int i = 0; i < opciones.length; i++) {
                    int frecuencia = 0;

                    for (int j = 0; j < opciones.length; j++) {
                        if (opciones[i] == opciones[j]) {frecuencia++;}
                    }
                    
                    if (frecuencia > maximaFrecuencia) {
                        maximaFrecuencia = frecuencia;
                        moda = opciones[i];
                    }
                }

                System.out.println("El numero repetido es: " + maximaFrecuencia);

              
                    break;

                case 2:

                  System.out.print("Numero: ");
                  int num7=Entrada.nextInt();
                  
                  int resultado5=(num7)/2;
                  System.out.println("Resultado: " + resultado5);
                    break;

                case 3:
                System.out.println("hola mundo");
                    break;

                case 4:
                System.out.println("Saliendo del programa. ¡Hasta Luego!");
                    break;
            
                default:
                System.out.println("Error de entrada[/]");
                    break;
            }
            
        } while (opcion !=4);



     
   }
}