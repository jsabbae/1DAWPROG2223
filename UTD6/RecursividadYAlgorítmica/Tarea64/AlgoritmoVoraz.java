package UTD6.RecursividadYAlgorítmica.Tarea64;



public class AlgoritmoVoraz {
    public static void main(String[] args) {
        int m = 100;
        int n = 5;
        int[] w = {10, 20, 30, 40, 50};
        int[] v = {20, 30, 66, 40, 60};
        double[] x = mochila_voraz(m, n, w, v);
        System.out.println(Arrays.toString(x));
    }

    public static double[] mochila_voraz(int m, int n, int[] w, int[] v) {
        double[][] vp = new double[n][3];
        for (int i = 0; i < n; i++) {
            vp[i][0] = (double) v[i] / w[i];
            vp[i][1] = (double) w[i];
            vp[i][2] = (double) v[i];
        }



        public Objeto(int peso, int valor) {
            this.peso = peso;
            this.valor = valor;
            this.valorPorPeso = (double) valor / peso;
        }
    }
}
