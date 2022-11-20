package principal;
public class Calculos {
    private double kgTejido;
    final double kgContaminante = 56.8;
    private double calculoHidrico;
    private double calculoHuellaCarbono;

    public void setKgTejido(double kgTejido) {
        this.kgTejido = kgTejido;
    }

    public double getKgTejido() {
        return kgTejido;
    }

    public double calcularHuellaCarbono() {
        calculoHuellaCarbono = kgContaminante / kgTejido;
        return calculoHuellaCarbono;
    }

    public double calcularHuellaHidrica() {
        /* Aqui va el calculo hidrico */
        return calculoHidrico;
    }
}
