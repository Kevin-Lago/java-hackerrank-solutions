package vanilla_java.data_structures.java_sort;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(Comparator.comparing(Student::getFname));
        studentList.sort((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
