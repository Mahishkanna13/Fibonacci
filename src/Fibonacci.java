import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int Number)
    {
        if(Number==0)
        {
            return 0;
        }
        if(Number==1)
        {
            return 1;
        }
        return fibonacci(Number-1)+fibonacci(Number-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number= scanner.nextInt();
        System.out.println(fibonacci(Number));
    }
}
