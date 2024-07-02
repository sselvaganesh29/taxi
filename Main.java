//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        TaxiManager taximanager = new TaxiManager();
        RideManager rideManager = new RideManager();

        Taxi taxi_1 = new Taxi(365, "veghar", false);
        Taxi taxi_2 = new Taxi(370, "caraxes", true);
        Taxi taxi_3 = new Taxi(380, "vermithor", true);

        taximanager.addTaxi(taxi_1);
        taximanager.addTaxi(taxi_2);
        taximanager.addTaxi(taxi_3);

        Ride ride = new Ride( 1, new Taxi(1,"vhaghar"), new Person( 100, "Selva" ) ,1,5 );


        taximanager.updateTaxi(370,"caraxes",false);

        taximanager.delete_taxi(365);

        Taxi taxidetail = taximanager.taxi_detail(380);
        System.out.println("Taxi details for this taxi no:"+ taxidetail);

    }

}