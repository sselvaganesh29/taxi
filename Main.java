//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        TaxiManager taximanager = new TaxiManager();

        Taxi taxi1 = new Taxi(365, "ROLLS", false);
        Taxi taxi2 = new Taxi(370, "VOLVO", true);
        Taxi taxi3 = new Taxi(380, "BMW", true);
        Taxi taxi4 = new Taxi(390, "BENZ", true);
        Taxi taxi5 = new Taxi(400, "INOVUA", true);

        taximanager.addTaxi(taxi1);
        taximanager.addTaxi(taxi2);
        taximanager.addTaxi(taxi3);
        taximanager.addTaxi(taxi4);
        taximanager.addTaxi(taxi5);

        taximanager.updateTaxi(370,"caraxes",false);

        taximanager.deleteTaxi(365);

        Taxi taxiinfo = taximanager.taxiDetail(380);
        System.out.println("Taxi details for this taxi no:"+ taxiinfo);

        taximanager.createRide(20,390,new Person(90,"selva"),8,10);

        int price = taximanager.calculatePrice(8,10);
        System.out.println("The ride price:" + price);

    }

}