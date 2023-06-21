public class Casa {
    private double precio;
    private char calificacionEnergetica;
    private String referenciaCatastral;
    private static final int IVA = 21;
    private static final int IVA_REDUCIDO = 16;

    public Casa(double precio, char calificacionEnergetica, String referenciaCatastral) {
        this.precio = precio;
        this.calificacionEnergetica = calificacionEnergetica;
        this.referenciaCatastral = referenciaCatastral;
    }

    private double precioIva(int iva) {
        return precio * (1 + iva / 100.0);
    }

    public double precioIva() {
        return precioIva(IVA);
    }

    public double precioIvaReducido() {
        return precioIva(IVA_REDUCIDO);
    }

    void ResultadoEnConsola() {
        System.out.println("Referencia catastral: " + referenciaCatastral);
        System.out.println("Precio sin el IVA: " + precio);
        System.out.println("Precio con el IVA: " + precioIva());
        System.out.println("Precio IVA reducido: " + precioIvaReducido());
    }
}

