# Java Int to String

You are given an integer ___n___, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts ___n___ into a string ___s___ the code will print "Good job". Otherwise it will print "Wrong answer".

___n___ can range between __-100__ to __100__ inclusive.

__Sample Input 0__

```
100
```

__Sample Output 0__

```
Good job
```

__Solution__

```java
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.close();

    String s = String.valueOf(n);

    if (n == Integer.parseInt(s)) {
        System.out.println("Good job");
    } else {
        System.out.println("Wrong answer.");
    }
}
```
