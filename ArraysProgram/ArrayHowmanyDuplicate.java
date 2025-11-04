package Package1.ArraysProgram;

public class ArrayHowmanyDuplicate {
    public static void main(String[] args) {
        //Search how many times 12 repeated
        int [] arr={12, 45, 34, 12, 12,67};
        int search=12;
        int count=0;
        for(int num: arr){
            if (num == search) {

                count++;
            }}
                System.out.println("Number is repeated "+ count + " times");

    }
}
