package Package1.NumbersPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //qube of each num should add and get the same number as input153
        int num=153;
        int sum=0;
        while(num!=0){
            int last=num%10;
            sum=sum+(last*last*last);
            num=num/10;

        }
        System.out.println(sum);
    }}
