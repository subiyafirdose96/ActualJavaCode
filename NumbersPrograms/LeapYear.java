package Package1.NumbersPrograms;

public class LeapYear {
    public static void main(String[] args) {
        //Print the leap years starting from 2025 to next 10
        int currentYear=2025;
        int endYear=currentYear+10;
        for(int year=currentYear; year<=endYear; year++){
            if(year%4==0 && year%100!=0) {
                System.out.println(year);
            }
        }
    }
}
