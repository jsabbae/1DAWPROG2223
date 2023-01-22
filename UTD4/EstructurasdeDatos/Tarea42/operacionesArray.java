public class operacionesArray
{
    public static void main(String[] args) {
        int[] a = new int[10];
        int[][] b = new int [3][];
int[] c = {1,1,1};
        System.out.println(operacionesArray.multiplicarArray(c));

    }
    private static int multiplicarArray (int[] c) {
        int x = 2;
        for (int i = 0; i < c.length; i++) {
            x = x * c[i];
        }
        return x;
    }

}
