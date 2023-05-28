package Tarea81;

public class Ordenadores {
    private static int contador = 10;

    private int id;
    private String ip;
    private String numeroSerie;
    private long memoria;
    private long discoDuro;
    private String cpu;
    private String fechaCompra;

    public Ordenadores(String ip, String numeroSerie, long memoria, long discoDuro, String cpu, String fechaCompra) {
        this.id = contador;
        contador += 10;
        this.ip = ip;
        this.numeroSerie = numeroSerie;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.cpu = cpu;
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public long getMemoria() {
        return memoria;
    }

    public long getDiscoDuro() {
        return discoDuro;
    }

    public String getCpu() {
        return cpu;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }
}
