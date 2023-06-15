package task4;

import task4.domain.FixedSalWorker;
import task4.domain.HourlyWorker;
import task4.domain.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static task4.domain.WorkersUtils.printLast;
import static task4.domain.WorkersUtils.printList;

public class Program {
    public static void main(String[] args) {

        List<Worker> workerList = new ArrayList<>();
        workerList.add(new FixedSalWorker(1,"Аркаша", 2500));
        workerList.add(new FixedSalWorker(2,"АНиколай", 2500));
        workerList.add(new HourlyWorker(3,"Коля", 15));
        workerList.add(new HourlyWorker(4,"Женя", 15));
        workerList.add(new HourlyWorker(5, "Никита", 12.50));

        Collections.sort(workerList);
        System.out.println();
        printList(workerList, 5);
        System.out.println();
        printLast(workerList, 3);
    }
}
