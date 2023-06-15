package task2;
import task2.domain.Student;
import task2.domain.StudentUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Яша", "Т-023", 1, Arrays.asList(3, 4, 5)));
        students.add(new Student("Оля", "Т-091", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Толя", "Т-091", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Уля", "Т-095", 1, Arrays.asList(4, 5, 5)));
        students.add(new Student("Вова", "Л-096", 1, Arrays.asList(3, 3, 3)));
        students.add(new Student("Яна", "Т-072", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Даник", "П-095", 1, Arrays.asList(4, 4, 4)));
        StudentUtils.removeLowPerformingStudents(students);
        StudentUtils.printStudents(students, 2);
        StudentUtils.printStudents(students, 1);
    }
}
