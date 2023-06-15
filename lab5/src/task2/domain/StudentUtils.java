package task2.domain;

import java.util.Iterator;
import java.util.List;

public class StudentUtils {
    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            double average = getAverageGrade(student);
            if (average < 3) {
                iter.remove();
            }
            else{
                student.addCourse();
            }
        }
    }

    private static double getAverageGrade(Student student) {
        List<Integer> grades = student.getGrades();
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
