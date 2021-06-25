import java.util.Scanner;
public class BesKati {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t= input.nextInt();
        System.out.println("4 ün kuvveti olan sayılar:");
        for(int i=4; i<=t; i*=4)
        {
            System.out.println(""+i);
        }

        System.out.println("5 in kuvveti olan sayılar:");
        for(int i=5; i<=t; i*=5)
        {
            System.out.println(""+i);
        }
    }
}
