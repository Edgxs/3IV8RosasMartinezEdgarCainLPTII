package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Sueter extends Prenda {

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

    public void DatosSueter(int tela, int talla, int totalprenda) {
        double resultado4 = 0.0;
            h = tela;
        switch (h) {
            case 1:
                    t = talla;

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
                    t = talla;
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
Double resultadof = resultado4 * totalprenda;
        JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado4);
        JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
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
