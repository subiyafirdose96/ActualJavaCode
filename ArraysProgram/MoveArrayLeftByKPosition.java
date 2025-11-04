package Package1.ArraysProgram;

public class MoveArrayLeftByKPosition {
    public static void main(String[] args) {


    int[] arr={1, 2, 3, 4, 5};
    int k=3;
    int n=arr.length-1;
    for(int i=0;i<k; i++) {
int first=arr[0];
int j;
for( j=0; j<n; j++){
    arr[j]=arr[j+1];

    }
arr[n]=first;
}
    for(int num:arr){
        System.out.println(num);
    }

    }
    }

