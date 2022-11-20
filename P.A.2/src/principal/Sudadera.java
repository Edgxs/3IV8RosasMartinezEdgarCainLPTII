package principal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Sudadera extends Prenda {
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

    public void DatosSudadera() {
        System.out.println("Elije el tipo de tela del Sudadera" + "\n" + "1-Algodon" + "\n" + "2-Poliester");
        try {
            h = in.nextInt();

        } catch (Exception e) {
            System.out.println("Ingresa solo numeros");
            in.nextLine();
        }

        switch (h) {
            case 1:
                System.out.println("Elije la talla de Sudadera" + "\n" + "1-Extrachica" + "\n" + "2-Chica" + "\n"
                        + "3-Mediana" + "\n" + "4-Grande" + "\n" + "5-Extragrande");
                try {
                    t = in.nextInt();

                } catch (Exception e) {
                    System.out.println("Ingresa solo numeros");
                    in.nextLine();
                }
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
                System.out.println("Elije la talla de Sudadera" + "\n" + "1-Extrachica" + "\n" + "2-Chica" + "\n"
                        + "3-Mediana" + "\n" + "4-Grande" + "\n" + "5-Extragrande");
                try {
                    t = in.nextInt();

                } catch (Exception e) {
                    System.out.println("Ingresa solo numeros");
                    in.nextLine();
                }

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
                System.out.println("Elije la talla de Sudadera" + "\n" + "1-Extrachica" + "\n" + "2-Chica" + "\n"
                        + "3-Mediana" + "\n" + "4-Grande" + "\n" + "5-Extragrande");
                try {
                    t = in.nextInt();

                } catch (Exception e) {
                    System.out.println("Ingresa solo numeros");
                    in.nextLine();
                }

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