import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Functions.pointFive();

        ArrayList<String> letters = new ArrayList<>(Arrays.asList("abc", "ujk", "zzy", "ahj", "aaz", "oip"));
        Functions.pointSix(letters);

        int[] vector = {1, 4, 6, 7, 8, 8, 127, 89};
        int subvector = 2;
        Functions.pointSeven(vector, subvector);

        int number = 4;
        Functions.pointEighth(number);

    }
}