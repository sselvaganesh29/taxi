import java.util.ArrayList;

public class TaxiManager
{
    private ArrayList<Taxi> taxiList;

    private ArrayList<Ride> rideList;

    public TaxiManager()
    {
        taxiList = new ArrayList<>();
        rideList = new ArrayList<>();
    }


    public void addTaxi(Taxi taxi)
    {
        taxiList.add(taxi);
    }


    public void updateTaxi(int taxiNo, String newtaxi_name, boolean newavailable)
    {
        for (Taxi taxi : taxiList)
        {
            if (taxi.getTaxiNo() == taxiNo)
            {
                taxi.setTaxi_name(newtaxi_name);
                taxi.setAvailable(newavailable);
            }
        }
    }


    public void deleteTaxi(int taxiNo)
    {
        taxiList.removeIf( taxi -> taxi.getTaxiNo() == taxiNo );
    }

    public Taxi taxiDetail( int taxiNo )
    {
        for ( Taxi taxi : taxiList )
        {
            if ( taxi.getTaxiNo() == taxiNo )
            {
                return taxi;
            }
        }
        return null;
    }


    public void createRide(int rideId, int taxiNo, Person person, int startingPoint, int endingPoint)
    {
        Taxi taxi = taxiDetail(taxiNo);
        if (taxi != null)
        {
            Ride ride = new Ride(rideId, taxi, person, startingPoint, endingPoint);
            int price = calculatePrice(startingPoint, endingPoint);
            rideList.add(ride);
            ride.setEndingPoint(endingPoint);
        }
        else
        {
            System.out.println("This taxino is" + taxiNo + "not found");
        }
    }

    public int calculatePrice(int startingPoint, int endingPoint)
    {
        int distance = Math.abs(startingPoint - endingPoint);
        int pricePerkm = 50;
        return distance * pricePerkm;
    }

}
