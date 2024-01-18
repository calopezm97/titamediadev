import java.util.*;
import java.util.stream.Stream;

public class Functions {

    public static void pointFive() {

        String a = "5";
        String b = "10";
        System.out.println(a + Integer.parseInt(b));
    }

    public static void pointSix(ArrayList<String> letters) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < letters.size(); i++) {
            map.put(letters.get(i), sumAsciiValues(letters.get(i)));
        }
        Stream<Map.Entry<String, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        sorted.forEach(System.out::println);
    }

    static int sumAsciiValues(String palabra) {
        int suma = 0;
        for (char letra : palabra.toCharArray()) {
            suma += letra;
        }
        return suma;
    }

    public static void pointSeven(int[] vector, int subvector) {

        if (vector.length%subvector==0){
            List<int[]> subvectores = dividirVector(vector, subvector);

            for (int i = 0; i < subvectores.size(); i++) {
                System.out.println("Subvector " + (i + 1) + ": " + Arrays.toString(subvectores.get(i)));
            }
        }
        else {
            System.out.println("El vector no es divisible por este numero");
        }
    }

    private static List<int[]> dividirVector(int[] vector, int numeroDeSubvectores) {
        List<int[]> subvectores = new ArrayList<>();
        int tamanoSubvector = (int) Math.ceil((double) vector.length / numeroDeSubvectores);

        for (int i = 0; i < vector.length; i += tamanoSubvector) {
            int fin = Math.min(i + tamanoSubvector, vector.length);
            int[] subvector = Arrays.copyOfRange(vector, i, fin);
            subvectores.add(subvector);
        }

        return subvectores;
    }

    public static void pointEighth(int number) {
        int fn = 0;
        for (int i = 1; i <= number; i++) {
            fn += (int) (Math.pow(-1, i) * i);
        }
        System.out.println(fn);
    }
}
