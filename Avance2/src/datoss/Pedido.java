package datoss;

import Validaciones.Validador;
import java.util.ArrayList;

public class Pedido {

    ArrayList<Comestible> comidas;
    ArrayList<Bebestible> bebidas;

    Pedido() {
    }

    public void agregarComida() {
        Carta carta = new Carta();
        System.out.println("ingrese opcion a elegir para agregar al pedido");
     //   carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addComida(opcn);
    }

    public void addComida(int opcn) {
        switch (opcn) {
            case 1:
                Comestible hamburguesas = Comestible.HAMBURGUESAS;
                comidas.add(hamburguesas);
                break;
            case 2:
                Comestible polloConPapas = Comestible.POLLOCONPAPAS;
                comidas.add(polloConPapas);
                break;
            case 3:
                Comestible carneALaOlla = Comestible.CARNEALAOLLA;
                comidas.add(carneALaOlla);
                break;
            case 4:
                Comestible pizzaNapolitana = Comestible.PIZZANAPOLITANA;
                comidas.add(pizzaNapolitana);
                break;
            case 5:
                Comestible pizzaVegetariana = Comestible.PIZZAVEGETARIANA;
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
     //   carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addBebida(opcn);
    }

    public void addBebida(int opcn) {
        switch (opcn) {
            case 1:
                Bebestible bebida = Bebestible.BEBIDA;
                bebidas.add(bebida);
                break;
            case 2:
                Bebestible nectar = Bebestible.NECTAR;
                bebidas.add(nectar);
                break;
            case 3:
                Bebestible jugoNatural = Bebestible.JUGONATURAL;
                bebidas.add(jugoNatural);
                break;
            case 4:
                Bebestible aguaMineral = Bebestible.AGUAMINERAL;
                bebidas.add(aguaMineral);
                break;
            default:
                Menu m = new Menu();
                m.menu();
                break;
        }
    }
}
