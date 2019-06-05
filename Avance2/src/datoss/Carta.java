package datoss;

import Validaciones.Validador;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Carta {

    public void mostrarCarta() {
        System.out.println("Menu de comestibles");
        mostrarComestibles();
        System.out.println("Menu de bebestibles");
        mostrarBebestibles();
    }

    public void mostrarComestibles() {
        System.out.println("1.- Hamburguesas");
        System.out.println("2.- Pollo con papas");
        System.out.println("3.- Carne a la olla");
        System.out.println("4.- Pizza Napolitana");
        System.out.println("5.- Pizza vegetariana");
    }

    public void mostrarBebestibles() {
        System.out.println("1.- Bebida");
        System.out.println("2.- Nectar");
        System.out.println("3.- Jugo natural");
        System.out.println("4.- Agua mineral");
    }

}
