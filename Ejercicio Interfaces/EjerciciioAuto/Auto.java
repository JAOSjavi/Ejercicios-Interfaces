public class Auto implements IVehiculo {
    private int gasolina;

    public Auto(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    @Override
    public void Conducir() {
        if (gasolina > 0) {
            System.out.println("El coche está conduciendo.");
            gasolina--; 
        } else {
            System.out.println("No hay suficiente gasolina para conducir.");
        }
    }

    @Override
    public boolean Retanquear(int cantidadGasolina) {
        if (cantidadGasolina > 0) {
            gasolina += cantidadGasolina;
            System.out.println("El coche ha sido retanqueado con " + cantidadGasolina + " unidades de gasolina.");
            return true;
        } else {
            System.out.println("La cantidad de gasolina a añadir debe ser mayor a 0.");
            return false;
        }
    }
}