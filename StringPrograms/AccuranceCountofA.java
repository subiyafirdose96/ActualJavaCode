package Package1.StringPrograms;

public class AccuranceCountofA {
    public static void main(String[] args) {
        String s="java";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println("a is accured "+ count+ " times");

    }
}
