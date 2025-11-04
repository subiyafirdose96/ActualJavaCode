package Package1.NumbersPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=24;
        for(int i=2; i<number; i++){
//            if(number%i==0) {
//                System.out.println(" not Prime Number");
//                break;
//            }else {
//                System.out.println(" Prime");
//
//            }
            System.out.println(number%i==0 ? "even" : "odd");
            break;
            }

    }
}
