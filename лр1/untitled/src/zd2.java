import java.util.Random;
import java.util.Scanner;

public class zd2 {
    public static void main (String[] args) {
        int a, b, mas[];
        int n = 10;
        mas=new int[n];
        Random random = new Random();
        for(int i=0; i<mas.length; i++)
        {
            mas[i]=random.nextInt(10);
            System.out.print(mas[i]+" ");
        }
        Scanner in = new Scanner(System. in);
        System.out.println("Введите значение а: ");
        a = in.nextInt();
        System.out.println("Введите значение b: ");
        b = in.nextInt();
        for(int i = 0; i< mas.length; i++)
        {
            if(mas[i]%2==0 && a<i && i<b)
            {
                mas[i]=mas[i-1]+mas[i+1];
            }
            System.out.print(mas[i]+" ");

        }
    }
}
