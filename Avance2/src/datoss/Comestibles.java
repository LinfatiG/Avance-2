package datoss;

public enum Comestibles {

    HAMBURGUESAS(1500),
    POLLOCONPAPAS(2000),
    CARNEALAOLLA(3000),
    PIZZANAPOLITANA(3000),
    PIZZAVEGETARIANA(2700);
    private int precio;

    Comestibles(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}
