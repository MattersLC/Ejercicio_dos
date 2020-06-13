package ejercicio.dos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pasajeros, tripulacion, num_ruedas, tipo;
        String matricula;
        
        for (int i=0; i<10; i++) {
            System.out.print("¿Cuantos pasajeros puede llevar tu vehículo: ");
        pasajeros = sc.nextInt();
        System.out.println();
        System.out.println("Tu vehículo necesita tripulacion: ");
        System.out.println("1._ Sí.\n2._ No.");
        System.out.print("Tu respuesta: ");
        tripulacion = sc.nextInt();
        System.out.println();
        System.out.print("Digita las ruedas que tiene el vehículo: ");
        num_ruedas = sc.nextInt();
        System.out.println();
        sc.nextLine();
        System.out.print("Digita la matricula del vehículo: ");
        matricula = sc.nextLine();
        System.out.println();
        System.out.println("Selecciona el tipo de vehículo dependiendo de su medio de desplazamiento: ");
        System.out.println("1._ Tierra.");
        System.out.println("2._ Agua.");
        System.out.println("3._ Aire.");
        System.out.println("4._ Pavimento.");
        System.out.println("5._ Sub-acuático.");
        System.out.println("6._ Espacial.");
        System.out.print("Tu respuesta: ");
        tipo = sc.nextInt();
        
        Vehiculo v1 = new Vehiculo (pasajeros, tripulacion, num_ruedas, matricula, tipo);
        v1.datos();
        }
        
    }
    
}
