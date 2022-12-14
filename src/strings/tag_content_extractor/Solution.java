package strings.tag_content_extractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern pattern = Pattern.compile("<(.+?)>(.+?)</(.+?)>");
        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);

            System.out.println(matcher.group());

            testCases--;
        }
    }

}
