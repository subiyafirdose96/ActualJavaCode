package Package1;

public class Road_Toll {
    String vehicle_type;
    int number_of_tires;

    //constructor
    public Road_Toll(){
vehicle_type = "lorry";
number_of_tires = 6;
        System.out.println(vehicle_type);
    }

    //constructor overloading
    public Road_Toll(String vehicle_type, int number_of_tires){
        this.number_of_tires= number_of_tires;
        this.vehicle_type = vehicle_type;
    }

    public void tollCharge_calculate(){
        if(number_of_tires==2 || number_of_tires<2 || number_of_tires==3)
        {
            System.out.println("amount is 0" + " "+ vehicle_type);
        } else if (number_of_tires==4) {
            System.out.println("Amount is 10rs" + " " + vehicle_type);

        }
        else{
            System.out.println("Amount is 20" + " " +vehicle_type);
        }
    }
}
