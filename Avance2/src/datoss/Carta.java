package datoss;

public class Carta {

    private int contador = 1;

    public void mostrarComestible() {
        // int contador = 1;
        for (Comestible com : Comestible.values()) {
            System.out.println(contador + ".-" + com.toString() + "-");
            contador++;
        }

    }

    public void mostrarBebestibles() {
        // int contador = 1;
        for (Bebestible bes : Bebestible.values()) {
            System.out.println(contador + ".-" + bes.toString() + "-");
            contador++;
        }

    }
}
