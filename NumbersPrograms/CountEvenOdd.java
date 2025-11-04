package Package1.NumbersPrograms;

public class CountEvenOdd {
    public static void main(String[] args) {
        int num=1234554433;
        int odd=0;
        int even=0;
        while(num>0){
            int last=num%10;
            if (last%2 == 0) {
                even++;
            }
            else{
                odd++;
            }
            num=num/10;

        }
        System.out.println("even numbers are "+ even);

        System.out.println("odd numbers are "+ odd);

    }
}
