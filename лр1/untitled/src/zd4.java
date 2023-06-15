import java.util.Scanner;

public class zd4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System. in);
        //пункт 1
        System.out.println("задание1:");
        System.out.println("Введите число: ");
        double num = in.nextDouble();
        System.out.println("Введите делитель n: ");
        double n = in.nextDouble();
        for(double i=2; i<=n; i+=0.5)
        {
            if(num%i==0)
            {
                System.out.println("число "+num+" делится " + i);
            }
            else
            {
                System.out.println("число "+num+"  не делится " + i);
            }
        }

        //пункт2
        //System.out.println("задание2:");
        System.out.println("введите цифру от 1 до 9");
        int number = in.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четыре");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 9:
                System.out.println("девять");
                break;
            default:
                System.out.println("я умею считать до 9");
        }

        //пункт3
        System.out.println("задание3:");
        System.out.println("введите цифру от 1 до 12");
        int m = in.nextInt();
        switch(m)
        {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("мырт");
                break;
            case 4:
                System.out.println("аперль");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("в году только 12 месяцев");
        }

        //пункт4
        System.out.println("задание4:");
        System.out.println("1-Тувалу 2-Кирибати 3-Монтсеррат 4-Коморы 5-Джибути 6-Восточный Тимор");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Столица Тувалу: Фунафу́ти");
                break;
            case 2:
                System.out.println("Столица Кирибати: Тарава");
                break;
            case 3:
                System.out.println("Столица Монтсеррат: Монтсерра́т");
                break;
            case 4:
                System.out.println("Столица Коморы: Морони");
                break;
            case 5:
                System.out.println("Столица Джибути: Джибути");
                break;
            case 6:
                System.out.println("Столица Восточный Тимор: Дили");
                break;
            default:
                System.out.println("а чего ты ожидал?!?!???!? ");
        }

        //пункт5
        System.out.println("задание5:");
        System.out.println("введите число n:");
        int nn = in.nextInt();
        int i=1, S=0;
        while(i<nn)
        {
            S+=i;
            i+=2;
        }
        System.out.println("Сумма: "+S);

        //пункт6
        System.out.println("задание6:");
        System.out.println("введите число n:");
        int nnn = in.nextInt();
        int P=1;
        for(int ii = 2; ii<nnn; ii+=2)
        {
            if(ii%2==0)
            {
               P*=ii;
            }
        }
        System.out.println("Произведение "+P);

        //пункт7
        System.out.println("задание7:");
        System.out.println("введите рост:");
        double rost = in.nextDouble();
        System.out.println("введите вес:");
        double ves = in.nextDouble();
        double normVes1, normVes2;
        normVes1=(rost-100)-10/100;
        normVes2=(rost-100)+10/100;
        if(ves<normVes1)
        {
            System.out.println("надо кушоц <3");
        }
        if(ves>normVes2)
        {
            System.out.println("надо большн спорта <3");
        }
        else if(ves>normVes1 && ves<normVes2)
        {
            System.out.println("все хорошо <3");
        }
    }
}
