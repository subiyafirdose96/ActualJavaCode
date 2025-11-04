package Package1.StringPrograms;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        //output: jav
        String s= "ja@3va";
        String checked="";
        int i;
        for( i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(checked.indexOf(ch)==-1){
                checked =checked+ch;
            }
        }
        System.out.println(checked);

    }
    }






