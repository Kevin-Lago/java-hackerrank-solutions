package vanilla_java.data_structures.java_priority_queue;

public class Student implements Comparable<Student> {

    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s) {
        if (cgpa > s.getCGPA()) {
            return -1;
        } else if (cgpa < s.getCGPA()) {
            return 1;
        }

        if (name.compareTo(s.getName()) != 0) {
            return name.compareTo(s.getName());
        }

        return Integer.compare(id, s.getID());
    }

}
