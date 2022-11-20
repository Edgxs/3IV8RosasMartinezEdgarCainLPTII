package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
    Scanner in = new Scanner(System.in);
    public int n, p, t, h;
    double totalfin = 0.00;
    CrudSedes crud1 = new CrudSedes();
    
    Consultante son = new Consultante();
    Pantalon pantalon = new Pantalon();
    Camisa camisa = new Camisa();
    Playera playera = new Playera();
    Sudadera sudadera = new Sudadera();
    Sueter sueter = new Sueter();

    public void Menu() {
        do {
            System.out.println("Bievenido a Nova" + "\n" + "Seleccione su tipo de usuario" + "\n" + "1.-Consultante"
                    + "\n" + "2.-Administrador");
            try {
                n = in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Por favor ingrese solamente 1 o 2 en este apartado");
            }
            switch (n) {
                case 1:

                    Consultante con = new Consultante();
                    con.Registro();
                    MenuPrendas();
                    n = 0;
                    break;
                case 2:
                    Administrador adm = new Administrador();
                    adm.Registroa();

                default:
                    System.out.println("No se puede, solo ingresa 1 o 2");
                    break;
            }
        } while (n != 0);
    }
    public void MenuPrendas() {
        do {
            System.out.println("Elije la prenda a ingresar" + "\n" + "1-Pantalon" + "\n" + "2-Playera" + "\n"
                    + "3-Camisa" + "\n" + "4-Sudaderas" + "\n" + "5-Sueteres" + "\n" + "6-Para salir");
            try {
                p = in.nextInt();
            } catch (InputMismatchException es) {
                System.out.println("Por favor ingrese solamente 1 a 5 en este apartado");
            }
            switch (p) {
                case 1:
                    pantalon.DatosPantalon();
                    break;
                case 2:
                    Playera j = new Playera();
                    j.DatosPlayera();
                    break;
                case 3:
                    Camisa k = new Camisa();
                    k.DatosCamisa();
                    break;
                case 4:
                    Sudadera q = new Sudadera();
                    q.DatosSudadera();
                    break;
                case 5:
                    Sueter l = new Sueter();
                    l.DatosSueter();
                    break;
            }
        } while (p < 5);
        if (p < 5 && p > 1) {
            crud1.mostrarSedes();
            TT();
            if (totalfin == 0.00) {
                System.out.println("Sin calculo realizado");
                System.exit(0);
            } else {
                son.SetID(ID(son));
                System.out.println("Tu ID es el siguiente: " + ID(son));
            }
            
        }
    }
    public Double TT() {
        totalfin = pantalon.Total1() + sueter.Total4() + camisa.Total2() + playera.Total0() + sudadera.Total3();
        // totalfin=total+total1+total2+total3+total4;
        return totalfin;
        
    }
    public String ID(Consultante son){
        String id = son.GetNombreu() + TT();
        return id;
    }
}
