package AlgPresaDepredador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgPresaDepredador {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Scanner ln = new Scanner(System.in);
        System.out.println("a1");
        double a1 = ln.nextDouble();
        System.out.println("r1");
        double r1 = ln.nextDouble();
        System.out.println("a2");
        double a2 = ln.nextDouble();
        System.out.println("r2");
        double r2 = ln.nextDouble();

        System.out.println("Ingrese numero de presas");
        double presas = ln.nextDouble();
        System.out.println("Ingrese numero de depredador");
        double depredador = ln.nextDouble();

        System.out.println("tn");
        double tn = ln.nextDouble();

        double t0 = 0.0;
        int n = 1000;

        double h = (tn - t0) / n;

        double f0, f1;

        List<Double> presasList = new ArrayList<>();
        List<Double> depredadorList = new ArrayList<>();
        /**
         * Numero de iteraciones
         */
        for (int i = 1; i < tn; i++) {
            f0 = presas + (h * (r1 * presas - (a1 * presas * depredador)));
            f1 = depredador + (h * (a2 * presas * (depredador - r2 * depredador)));

            double presasPonderado = f0 *1000;
            double depredadorPonderado = f1 *1000;
            presasList.add(presasPonderado);
            depredadorList.add(depredadorPonderado);

            presas = f0;
            depredador = f1;
        }

        for (int i = 0; i <presasList.size() ; i++) {
            int contador  = i + 1;
            System.out.println("Numero de pressas en el anio  " + contador + " ==> " + presasList.get(i));
            System.out.println("Numero de depredadores en el anio " + contador+ " ==> " +depredadorList.get(i));
        }
    }

}
