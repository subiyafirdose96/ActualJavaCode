package Package1.NumbersPrograms;

public class countSumAllDigits {
    public static void main(String[] args) {
        int num=12345;
        int add=0;
        int digit=0;// to take last digit
        while(num>0){
            digit=num%10;
            add=add+digit;
            num=num/10;

        }
        System.out.println(add);
    }
}
