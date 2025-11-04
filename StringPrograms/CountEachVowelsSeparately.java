package Package1.StringPrograms;

public class CountEachVowelsSeparately {
    public static void main(String[] args) {
        String s = "Learning automation is easy";
        int vowel = 0;
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
            }}

            System.out.println("Count of 'a': " + aCount);
            System.out.println("Count of 'e': " + eCount);
            System.out.println("Count of 'i': " + iCount);
            System.out.println("Count of 'o': " + oCount);
            System.out.println("Count of 'u': " + uCount);

    }
}

