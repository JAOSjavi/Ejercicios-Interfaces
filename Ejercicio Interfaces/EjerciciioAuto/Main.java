import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto(0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de gasolina para tanquear: ");
        int cantidadGasolina = scanner.nextInt();

        if (miAuto.Retanquear(cantidadGasolina)) {
            miAuto.Conducir();
        }

        scanner.close();
    }
}