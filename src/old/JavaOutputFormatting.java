import java.util.Scanner;

public class JavaOutputFormatting {

    // TODO : still unfinished

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 = sc.next();
            int x=sc.nextInt();
            System.out.printf("%s" + (15 - s1.length()) + " %" + (15 - s1.length()) + "d\n", x, s1);
            //Complete this line
        }
        System.out.println("================================");

    }

}
