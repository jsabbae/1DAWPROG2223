package UTD5.Tarea51;

public class Comparable {
    import java.util.TreeSet;

    public class EjemploComparable {
        public static void main(String[] args) {
            conjunto fran = new conjunto("Fran",1);
            conjunto ana = new conjunto("Ana",2);
            System.out.println(fran.compareTo(ana));

            TreeSet<conjunto> treeSet = new TreeSet<>();
            treeSet.add(fran);
            treeSet.add(ana);
            System.out.println(treeSet);

            TreeSet<conjunto> treeSet2 = new TreeSet<>(new ComparadorPorEdad());
            treeSet2.add(fran);
            treeSet2.add(ana);
            System.out.println(treeSet2);


        }
    }
}
