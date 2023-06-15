import java.util.Random;

public class zd3 {
    public static void main (String[] args){
        double [][] mas = new double[3][3];
        Random random = new Random();
        for(int i=0; i<mas.length; i++)
        {
            for(int j=0; j<mas.length; j++)
            {
                mas[i][j]=random.nextInt(10);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<mas.length; i++)
        {
            mas[i][i] = Math.pow(mas[i][i], 2);
            for(int j=0; j<mas.length; j++)
            {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
