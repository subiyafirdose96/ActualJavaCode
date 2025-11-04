package Package1;

public class RollTollMain {
    public static void main(String[] args) {
        Road_Toll rt= new Road_Toll();
        //rt.number_of_tires=6;
        //rt.vehicle_type="auto";
        rt.tollCharge_calculate();

        Road_Toll rt2=  new Road_Toll("Auto", 3);
        rt2.tollCharge_calculate();

    }
}
