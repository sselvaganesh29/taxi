import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        AppProperties.loadProperties();


        String taxi1Person = AppProperties.getString("taxi1Person","NO KEY");
        Optional<String> Taxi1Name = AppProperties.getOptionalString("taxi1Name");
        String taxi2Name = AppProperties.getString("taxi2Name","NO KEY");

        String taxi1Name = Taxi1Name.orElse("NO KEY");




        int rideId = AppProperties.getInt("rideId",0);
        Optional<Integer> pId = AppProperties.getOptionalInt("personId");
        Optional<Integer> sp = AppProperties.getOptionalInt("startingPoint");
        Optional<Integer> en = AppProperties.getOptionalInt("endingPoint");
        Optional<Integer> Taxi1No = AppProperties.getOptionalInt("taxi1No");
        Optional<Integer> Taxi2No =AppProperties.getOptionalInt("taxi2No");

        int taxi1No = Taxi1No.orElse(0);
        int taxi2No = Taxi2No.orElse(0);
        int personId = pId.orElse(0);
        int startingPoint = sp.orElse(0);
        int endingPoint = en.orElse(0);








        Taxi taxi1 = new Taxi(taxi1No, taxi1Name, false);
        Taxi taxi2 = new Taxi(taxi2No, taxi2Name, true);

        TaxiManager taximanager = TaxiManager.INSTANCE;

        taximanager.addTaxi(taxi1);
        taximanager.addTaxi(taxi2);

        taximanager.updateTaxi(taxi1No,"caraxes",false);

        taximanager.deleteTaxi(taxi2No);

        Taxi taxiinfo = taximanager.taxiDetail(380);
        System.out.println("Taxi details for this taxi no:"+ taxiinfo);


        taxi1.createRide(rideId, new Person(personId,taxi1Person),startingPoint,endingPoint);
        taxi1.showRideDetails();

        System.out.println("-----------------");

    }

}