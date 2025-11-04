package Package1.StringPrograms;

public class RemoveAllDuplicateChar {
    public static void main(String[] args) {
        String name = "java";
        //output: jv
        for(int i=0; i<name.length(); i++){
            int count=0;
            char ch=name.charAt(i);
            for(int j=0; j<name.length();j++){
                if(ch==name.charAt(j)){
                    count++;
                }}

            if(count==1) {


                System.out.print(ch);
            }}
        }
}
