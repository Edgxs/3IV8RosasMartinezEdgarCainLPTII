package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Sudadera extends Prenda {

    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal3 = new Calculos();
    double resultado3 = 0.0;
    ArrayList<Double> calculos3 = new ArrayList<Double>();

    public Sudadera() {
    }

    public Sudadera(int h, int t) {
        this.h = h;
        this.t = t;
    }

    public void DatosSudadera(int tela, int talla, int totalprenda) {
        h = tela;

        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 2:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 3:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 4:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 5:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                }
                break;
            case 2:
                t = talla;

                switch (t) {
                    case 1:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 2:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 3:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 4:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 5:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                }
                break;
            case 3:
                t = talla;

                switch (t) {
                    case 1:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 2:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 3:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 4:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                    case 5:
                        cal3.setKgTejido(125);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        break;
                }
                break;

        }
        Double resultadof = resultado3 * totalprenda;
        JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado3);
        JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
    }

    public static Double TotalSudadera(ArrayList<Double> calculos3) {
        double total3 = 0;
        Iterator it = calculos3.iterator();
        while (it.hasNext()) {
            total3 = total3 + (Integer) it.next();
        }
        return total3;
    }

    public double Total3() {
        Double regreso = TotalSudadera(calculos3);
        return regreso;
    }
}
