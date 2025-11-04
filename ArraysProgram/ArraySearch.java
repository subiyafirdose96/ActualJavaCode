package Package1.ArraysProgram;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 30, 30, 35};
        int search = 30;
        //Flag is required to print("Element NOT found") case, ONLY when required
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println("Element found");
                flag=true;
                break;
            }
        }
        if(flag==false) {
            System.out.println("Element NOT found");
        }
    }
}
