package problem_solving.algorithms.implementation.designer_pdf_viewer;

import java.util.List;

public class Result {

    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";

        if (designerPdfViewer(h, word) == 28) {
            System.out.println("Test case 0 passed");
        } else {
            System.out.println("Test case 0 failed");
        }
    }

    static int designerPdfViewer(List<Integer> h, String word) {
        int height = 0;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j] && h[j] > height) {
                    height = h[j];
                }
            }
        }

        return height * word.length();
    }

}
