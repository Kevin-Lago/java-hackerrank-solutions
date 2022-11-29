import java.util.Arrays;

public class GridChallenge {

    public static void main(String[] args) {

        String[] grid = {
            "abcde",
            "fghij",
            "klmno",
            "pqrst",
            "uvwxy"
        };

        gridChallenge(grid);

    }

    static String gridChallenge(String[] grid) {

        String answer = "YES";

        for (int i = 0; i < grid.length; i++) {
            char[] orderedString = grid[i].toCharArray();
            Arrays.sort(orderedString);
            grid[i] = String.valueOf(orderedString);
        }

        for (int i = 0; i < grid[0].length(); i++) {
            String columnString = "";
            for (int j = 0; j < grid.length; j++) {
                columnString += grid[j].charAt(i);
            }
            char[] orderedString = columnString.toCharArray();
            Arrays.sort(orderedString);
            if (!columnString.equals(String.valueOf(orderedString))) {
                answer = "NO";
            }
        }

        return answer;

    }

}
