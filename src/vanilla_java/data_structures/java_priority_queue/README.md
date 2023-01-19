| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> |
|:---|:---:|---:|

# Java Priority Queue

> In computer science, a priority queue is an abstract data-type similar to a regular queue or stack data structure in which each element additionally has a priority associated with it. In a priority queue, an element with high priority is served before an element with low priority. - [(Wikipedia)](https://en.wikipedia.org/wiki/Priority_queue)

In this problem we will test your knowledge on [Java Priority Queue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html).

There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can tak place which are descibed below.

- ENTER: A student with some priority enters the queue to be served.

- SERVED: The student with the highest priority is served (remove) from the queue.

A unique id is assigned to each student entering the queue. The queue servers the students based on the following criteria (priority criteria):

1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.

2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.

3. Any students having the same CGPA and name will be served in ascending order of the id.

Create the following two classes:

- The Student class should implement:

    - The constructor ```Student(int id, String name, double gpa)```.
    
    - The method ```int getId()``` to return the id of the student.
    
    - the method ```String getName()``` to return the name of the student.
    
    - The method ```getCGPA``` to return the CGPA of the student.
    
- The priorities class should implement the method ```List<Student> getStudents(List<String> events)``` to process all the given events and return all the students yet to be served in the priority order.

__Input Format__

The first line contains an integer, ___n___, describing the total number of events. Each of the ___n___ subsequent lines will be of the following two forms:

- ```ENTER name CGPA id```: The student to be inserted into the priority queue.

- ```SERVED```: The highest priority student in the queue was served.

The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.

__Constraints__

- $2 \le n \le 1000$

- $0 \le CGPA \le 4.00$

- $1 \le id \le 10^5$

- $2 \le |name| \le 30$

__Output Format__

The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints ```EMPTY```.

__Sample Input__

```
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
```

__Sample Output__

```
Dan
Ashley
Shafaet
Maria
```

__Explanation__

In this case the number of events is 12. Let the name of the queue be ___q___.

- John is added to ___q___. So, it contains (John, 3.75, 50).

- Mark is added to ___q___. So, it contains (John, 3.75, 50) and (Mark, 3.8, 24).

- Shafaet is added to ___q___. So, it contains (John, 3.75, 50), (Mark, 3.8, 24), and (Shafaet, 3.7, 35).

- Mark is served as he has the highest CGPA. So, Q contains (John, 3.75, 50) and (Shafaet, 3.7, 35).

- John is served next as he has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).

- Samiha is added to ___q___. So, it contains (Shafaet, 3.7, 35) and (Samiha, 3.85, 36).

- Samiha is served as she has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).

- Now, four more students are added to ___q___. So, it contains (Shafaet, 3.7, 35), (Ashley, 3.9, 42), (Maria, 3.6, 46), (Anik, 3.95, 49), and (Dan, 3.95, 50).

- Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order. So, Q contains (Dan, 3.95, 50), (Ashley, 3.9, 42), (Shafaet, 3.7, 35), and (Maria, 3.6, 46).

As all events are completed, the name of each of the remaining students is printed on a new line.

---

<details><summary>Solution</summary>
    
Java Priority Queue does not return a sorted list. [source](https://stackoverflow.com/questions/5695017/priorityqueue-not-sorting-on-add)
Therefore, To get the correct answer we first need to sort a List of Students created from the remaining students in the queue.

Use the poll() method over remove() because poll() will return null if no such element exists where remove() will throw an error. [source](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html#poll())
    
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

class Priorities {
    
    PriorityQueue<Student> priorityQueue;

    public Priorities() {
        priorityQueue = new PriorityQueue<>();
    }
    
    public List<Student> getStudents(List<String> events) {
        for (int i = 0; i < events.size(); i++) {
            String[] strings = events.get(i).split(" ");

            if (strings[0].equals("SERVED")) {
                priorityQueue.poll();
            } else {
                Student student = new Student(Integer.parseInt(strings[3]), strings[1], Double.parseDouble(strings[2]));

                priorityQueue.add(student);
            }
        }

        List<Student> students = new ArrayList<>(priorityQueue);
        Collections.sort(students);
        return students;
    }

}

class Student implements Comparable<Student> {

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

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
```
</details>