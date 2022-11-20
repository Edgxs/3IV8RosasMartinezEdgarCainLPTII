package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Camisa extends Prenda {

    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal2 = new Calculos();
    double resultado2 = 0.0;
    ArrayList<Double> calculos2 = new ArrayList<Double>();

    public Camisa() {
    }

    public Camisa(int h, int t) {
        this.h = h;
        this.t = t;
    }

    /*
     * public Camisa(String ttalla, String ttela, int h, int t){
     * super(ttalla, ttela);
     * this.h=h;
     * this.t=t;
     * }
     */
    public void DatosCamisa(int tela, int talla, int totalprenda) {
        h = tela;

        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 2:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 3:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 4:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 5:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                }
                break;
            case 2:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 2:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 3:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 4:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 5:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                }
                break;
            case 3:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 2:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 3:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 4:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 5:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                }
                break;
            case 4:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 2:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 3:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 4:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                    case 5:
                        cal2.setKgTejido(125);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        break;
                }
                break;
        }
        Double resultadof = resultado2 * totalprenda;
        JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado2);
        JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
    }

    public static Double totalCamisa(ArrayList<Double> calculos2) {
        double total2 = 0;
        Iterator it = calculos2.iterator();
        while (it.hasNext()) {
            total2 = total2 + (Integer) it.next();
        }
        return total2;
    }

    public double Total2() {
        Double regreso = totalCamisa(calculos2);
        return regreso;
    }
}
