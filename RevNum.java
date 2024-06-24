import java.util.Scanner;
public class RevNum {

    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(reverse(number));
        sc.close();
    }
}
