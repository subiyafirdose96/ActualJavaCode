package Package1.NumbersPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num= 12321;
        int actual_num=num;
        int rev=0;

        // don't hard code the valve in for look, example "5"
        //for(int i=0; i<5;i++){

        while(num!=0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        if(rev==actual_num){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");

        }

    }
}
