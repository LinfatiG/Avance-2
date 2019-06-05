package datoss;

import Validaciones.Validador;
import java.util.ArrayList;

public class Pedido {

    ArrayList<Comestibles> comidas;
    ArrayList<Bebestibles> bebidas;

    Pedido() {
    }

    public void agregarComida() {
        Carta carta = new Carta();
        System.out.println("ingrese opcion a elegir para agregar al pedido");
        carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addComida(opcn);
    }

    public void addComida(int opcn) {
        switch (opcn) {
            case 1:
                Comestibles hamburguesas = Comestibles.HAMBURGUESAS;
                comidas.add(hamburguesas);
                break;
            case 2:
                Comestibles polloConPapas = Comestibles.POLLOCONPAPAS;
                comidas.add(polloConPapas);
                break;
            case 3:
                Comestibles carneALaOlla = Comestibles.CARNEALAOLLA;
                comidas.add(carneALaOlla);
                break;
            case 4:
                Comestibles pizzaNapolitana = Comestibles.PIZZANAPOLITANA;
                comidas.add(pizzaNapolitana);
                break;
            case 5:
                Comestibles pizzaVegetariana = Comestibles.PIZZAVEGETARIANA;
                comidas.add(pizzaVegetariana);
                break;
            default:
                Menu m = new Menu();
                m.menu();
                break;
        }
    }

    public void agregarBebida() {
        Carta carta = new Carta();
        System.out.println("ingrese opcion a elegir para agregar al pedido");
        carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addBebida(opcn);
    }

    public void addBebida(int opcn) {
        switch (opcn) {
            case 1:
                Bebestibles bebida = Bebestibles.BEBIDA;
                bebidas.add(bebida);
                break;
            case 2:
                Bebestibles nectar = Bebestibles.NECTAR;
                bebidas.add(nectar);
                break;
            case 3:
                Bebestibles jugoNatural = Bebestibles.JUGONATURAL;
                bebidas.add(jugoNatural);
                break;
            case 4:
                Bebestibles aguaMineral = Bebestibles.AGUAMINERAL;
                bebidas.add(aguaMineral);
                break;
            default:
                Menu m = new Menu();
                m.menu();
                break;
        }
    }
}
