package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Playera extends Prenda {

    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal = new Calculos();

    ArrayList<Double> calculos = new ArrayList<Double>();

    public Playera() {
    }

    public Playera(int h, int t) {
        this.h = h;
        this.t = t;

    }

    public void DatosPlayera(int tela, int talla, int totalprenda) {
        double resultado = 0.0;
        h = tela;
        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 2:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 3:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 4:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 5:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                }
                break;
            case 2:
                t = talla;
                switch (t) {
                    case 1:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 2:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 3:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 4:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                    case 5:
                        cal.setKgTejido(125);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        break;
                }
                break;
        }
        Double resultadof = resultado * totalprenda;
        JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado);
        JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
    }

    public static Double TotalPlayera(ArrayList<Double> calculos) {
        double total = 0;
        Iterator it = calculos.iterator();
        while (it.hasNext()) {
            total = total + (Integer) it.next();
        }
        return total;
    }

    public double Total0() {
        Double regreso = TotalPlayera(calculos);
        return regreso;
    }
}
