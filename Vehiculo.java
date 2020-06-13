package ejercicio.dos;

public class Vehiculo {
    int pasajeros, tripulacion, num_ruedas, tipo;
    String matricula;
    //boolean tripulacion;
    
    public int getPasajeros() {
        return pasajeros;
    }
    
    public int getTripulacion() {
        return tripulacion;
    }
    
    public int getNumruedas() {
        return num_ruedas;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public Vehiculo (int pasajeros, int tripulacion, int num_ruedas, String matricula, int tipo) {
        this.pasajeros = pasajeros;
        this.tripulacion = tripulacion;
        this.num_ruedas = num_ruedas;
        this.matricula = matricula;
        this.tipo = tipo;
    }
    
    public void datos() {
        //System.out.println();
        //System.out.println("Tu vehiculo puede llevar "+pasajeros+" pasajeros, necesita de "+" persona(s) que lo conduzcan");
        switch (tripulacion) {
            case 1:
                switch (tipo){
                    case 1:
                        System.out.println("Tu vehículo es un auto tipo terraceria");
                        break;
                    case 2:
                        System.out.println("Tu vehículo es una lancha o barco.");
                        break;
                    case 3:
                        System.out.println("Tu vehículo es un avión.");
                        break;
                    case 4:
                        System.out.println("Tu vehículo es un auto.");
                        break;
                    case 5:
                        System.out.println("Tu vehículo es un submarino.");
                        break;
                    case 6:
                        System.out.println("Tu vehículo es un transbordador espacial, o una nave alienígena.");
                        break;
                    default:
                        System.out.println("Tu vehículo no pertenece a ningún tipo de los aquí listados.");
                }
                break;

            case 2:
                System.out.println("Tu vehículo es un Tesla conducido por IA.");
                break;
                
            default:
                System.out.println("No digitaste un tipo de opción válida en la tripulación.");
        }
    }
}
