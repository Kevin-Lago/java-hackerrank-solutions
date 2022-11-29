import java.util.Arrays;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        String smallest = "";
        String largest = "";

        String[] subStrings = new String[s.length() - k + 1];

        for (int i = 0; i < s.length() - k; i++) {
//            if (smallest.compareTo(s.substring(i, i + k))) {
//                smallest = s.substring(i, i + k);
//            }
        }

        Object[] yes = Arrays.stream(subStrings).sorted().toArray();
//        subStrings.sort();
//        smallest = subStrings[.get(]0);
//        largest = subStrings.get(subStrings.size() - 1);
        return;
//        subStrings.sort((a, b) -> a > b);

    }

}
