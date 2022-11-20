package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Sueter extends Prenda {

    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal4 = new Calculos();

    ArrayList<Double> calculos4 = new ArrayList<Double>();

    public Sueter() {
    }

    public Sueter(int h, int t) {

        this.h = h;
        this.t = t;
    }

    public void DatosSueter() {
        double resultado4 = 0.0;
        System.out.println("Elije el tipo de tela del Sueter" + "\n" + "1-Algodon" + "\n" + "2-Lana");
        try {
            h = in.nextInt();

        } catch (Exception e) {
            System.out.println("Ingresa solo numeros");
            in.nextLine();
        }
        switch (h) {
            case 1:
                System.out.println("Elije la talla de Sueter" + "\n" + "1-Extrachica" + "\n" + "2-Chica" + "\n"
                        + "3-Mediana" + "\n" + "4-Grande" + "\n" + "5-Extragrande");
                try {
                    t = in.nextInt();

                } catch (Exception e) {
                    System.out.println("Ingresa solo numeros");
                    in.nextLine();
                }

                switch (t) {
                    case 1:
                        cal4.setKgTejido(126);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 2:
                        cal4.setKgTejido(127);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 3:
                        cal4.setKgTejido(128);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 4:
                        cal4.setKgTejido(129);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 5:
                        cal4.setKgTejido(130);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                }
                break;
            case 2:
                System.out.println("Elije la talla de Sueter" + "\n" + "1-Extrachica" + "\n" + "2-Chica" + "\n"
                        + "3-Mediana" + "\n" + "4-Grande" + "\n" + "5-Extragrande");
                try {
                    t = in.nextInt();

                } catch (Exception e) {
                    System.out.println("Ingresa solo numeros");
                    in.nextLine();
                }
                switch (t) {
                    case 1:
                        cal4.setKgTejido(124);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 2:
                        cal4.setKgTejido(128);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 3:
                        cal4.setKgTejido(129);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 4:
                        cal4.setKgTejido(130);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                    case 5:
                        cal4.setKgTejido(131);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        break;
                }
                break;

        }
    }

    public static Double TotalSueter(ArrayList<Double> calculos4) {
        double total4 = 0;
        Iterator it = calculos4.iterator();
        while (it.hasNext()) {
            total4 = total4 + (Integer) it.next();
        }
        return total4;
    }

    public double Total4() {
        Double regreso = TotalSueter(calculos4);
        return regreso;
    }
}
