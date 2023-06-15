package task4.domain;

import java.util.List;

public class WorkersUtils {
    public static void printList(List<Worker> list) {

        System.out.println("Список работников:");
        for (Worker el: list) {
            System.out.println("Имя: " + el.getName() + " Зарплата: " + el.getSalary());
        }
    }

    public static void printList(List<Worker> list, int countToPrint) {

        System.out.println("Список работников:");
        for (int i = 0; i < countToPrint && i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " Имя: " + list.get(i).getName() + " Зарплата: " + list.get(i).getSalary());
        }
    }

    public static void printLast(List<Worker> list, int countToPrint) {

        System.out.println("Последние работники по списку:");
        for (int i = list.size() - countToPrint; i < list.size() && countToPrint > 0; i++, countToPrint--) {
            System.out.println(list.get(i).getId() + " Имя: " + list.get(i).getName() + " Зарплата: " + list.get(i).getSalary());
        }
    }
}
