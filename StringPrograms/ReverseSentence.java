package Package1.StringPrograms;

public class ReverseSentence {
    public static void main(String[] args) {
        String s="i am an automation tester";

        String[] arr=s.split(" ");
        //System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }}
}
