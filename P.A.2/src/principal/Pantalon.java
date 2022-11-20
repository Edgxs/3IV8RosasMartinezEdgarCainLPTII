package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Pantalon extends Prenda {

    // super(ttalla, ttela);
    int h, t;
    Calculos cal1 = new Calculos();
    Scanner in = new Scanner(System.in);
    ArrayList<Double> calculos1 = new ArrayList<Double>();

    /*
prenda = tipo de prenda que se utiliza
tela = tela que se utiliza
talla = talla de la prenda
totalprenda = cuantos hay 
     */
    public Pantalon() {
    }

    public Pantalon(int h, int t) {
        this.h = h;
        this.t = t;
    }

    public void DatosPantalon(int tela, int talla, int totalprenda) {
        double resultado1 = 0.00;
        h = tela;
        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();

                        calculos1.add(resultado1);
                        break;
                    case 2:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 3:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 4:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 5:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                }
                break;
            case 2:
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 2:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 3:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 4:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 5:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                }
                break;
            case 3:
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 2:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 3:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 4:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;
                    case 5:
                        cal1.setKgTejido(125);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        break;

                }
                break;
        }
        Double resultadof = resultado1 * totalprenda;
        JOptionPane.showMessageDialog(null, "El resultado del calculo es: "+ resultado1);
        JOptionPane.showMessageDialog(null, "El resultado de todo es: "+ resultadof);

    }

    public static Double TotalPantalon(ArrayList<Double> calculos1) {
        double total1 = 0;
        Iterator it = calculos1.iterator();
        while (it.hasNext()) {
            total1 = total1 + (Integer) it.next();
        }
        return total1;
    }

    public String Total1() {
        Double regreso = TotalPantalon(calculos1);
        String cadena = String.valueOf(regreso);
        return cadena;
    }

}
