package datoss;

public enum Bebestibles {
    BEBIDA(1000),
    NECTAR(1000),
    JUGONATURAL(1500),
    AGUAMINERAL(1000);

    private int precio;

    Bebestibles(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
