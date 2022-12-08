# Java 1D Array

An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored squentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're going to have. For example, you might use an array to store a list of student ID numbers, or the names of state capitals. To create an array of integers named ___myArray___ that can hold four integers values, you would write the following code:

```
int[] myArray = new int[4];
```

This sets aside a block of memory that's capable of storing __4__ integers. Each integer storage cell is assigned a unique index ranging from __0__ to one less than the size of the array, and each cell initially contains at __0__. In the case of ___myArray___, we can store integers at indices __0, 1, 2,__ and __3__. Let's say we wanted the last cell to store the number __12__; to do this, we write:

```
myArray[3] = 12;
```

Similarly, we can print the contents of the last cell with the following code:

```
System.out.println(myArray[3]);
```

The code above prints the value stored at index __3__ of ___myArray___, which is __12__ (the value we previously stored there). It's important to note that while Java initializes each cell of an array of integers with a __0__, not all languages do this.

__Task__

The code in your editor does the following:

1. Reads an integer from stdin and save it to a variable, ___n___, denoting some number of integers.

2. Reads ___n___ integers corresponding to ___a_<sub>0</sub>__, ___a_<sub>1</sub>__, ... , ___a_<sub>n-1</sub>__ from stdin and save each integer ___a<sub>i</sub>___ to a variable, val.

3. Attempts to print each element of an array of integers named ___a___.

Write the following code in the unlocked portion of your editor:

1. Create an array, ___a___, capable of holding ___n___ integers.

2. Modify the code in the loop so that is saves each sequential value to its corresponding location in the array. For example, the first value must be stored in ___a_<sub>0</sub>__, the second value must be stored in ___a_<sub>1</sub>__, and so on.

Good luck!

__Input Format__

The first line contains a single integer, ___n___, denoting the size of the array.

Each line ___i___ of the ___n___ subsequent lines contains a single integer denoting the value of element ___a<sub>i</sub>___.

__Output Format__

You are not responsible for printing any output to stdout. Locked code in the editor loops through array ___a___ and prints each sequential element on a new line.

__Sample Input__

```
5
10
20
30
40
50
```

__Sample Output__

```
10
20
30
40
50
```

__Explanation__

When we save each integer to its corresponding index in ___a___, we get ___a_ = [10,20,30,40,50]__. The locked code prints each array element on a new line from left to right.

__Solution__

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = scan.nextInt();
    }
    scan.close();

    // Prints each sequential element in array a
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
}
```
