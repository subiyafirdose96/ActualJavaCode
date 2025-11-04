package Package1.ArraysProgram;

public class MissingNumberFinding {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 5};
        int n=arr.length;
        for(int i=1; i<=n; i++) //note: <=
            {
            boolean flag=false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i);
            }
        }
    }
}
