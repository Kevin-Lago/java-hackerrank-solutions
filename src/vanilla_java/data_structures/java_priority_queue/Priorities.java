package vanilla_java.data_structures.java_priority_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

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
