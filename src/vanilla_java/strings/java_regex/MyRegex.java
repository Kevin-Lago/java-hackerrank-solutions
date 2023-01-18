package vanilla_java.strings.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class MyRegex {

    public String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private static Pattern test = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", 2);

    public static void main(String[] args) {
        Matcher subnet = test.matcher("255.255.255.255");
        System.out.println("\"255.255.255.255\" is valid: " + subnet.find());
        System.out.println(subnet.group());

        Matcher publicIp = test.matcher("192.168.0.1");
        System.out.println("\"192.168.0.1\" is valid: " + publicIp.find());
        System.out.println(publicIp.group());

        Matcher homeIp = test.matcher("127.0.0.1");
        System.out.println("\"127.0.0.1\" is valid: " + homeIp.find());
        System.out.println(homeIp.group());

        Matcher randomIp = test.matcher("235.34.52.235");
        System.out.println("\"235.34.52.235\" is valid: " + randomIp.find());
        System.out.println(randomIp.group());

        Matcher invalidIp = test.matcher("256.256.256.256");
        System.out.println("\"256.256.256.256\" is valid: " + invalidIp.find());
        System.out.println(invalidIp.group());
    }

}
