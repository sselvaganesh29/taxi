import java.util.ArrayList;

public class TaxiManager
{
    private ArrayList<Taxi> taxiList;

    private ArrayList<Ride> rideList;


    public void addTaxi(Taxi taxi)
    {
        taxiList.add(taxi);
    }


    public void updateTaxi(int taxi_no, String newtaxi_name, boolean newavailable)
    {
        for (Taxi taxi : taxiList)
        {
            if (taxi.getTaxi_no() == taxi_no)
            {
                taxi.setTaxi_name(newtaxi_name);
                taxi.setAvailable(newavailable);
            }
        }
    }


    public void delete_taxi(int taxi_no)
    {
        taxiList.removeIf( taxi -> taxi.getTaxi_no() == taxi_no );
    }

    public Taxi taxi_detail( int taxi_no )
    {
        for ( Taxi taxi : taxiList )
        {
            if ( taxi.getTaxi_no() == taxi_no )
            {
                return taxi;
            }
        }
        return null;
    }


    public void createRide(int rideId, int taxi_no, Person person, int startingPoint, int endingPoint)
    {
        Taxi taxi = taxi_detail(taxi_no);
        if (taxi != null)
        {
            Ride ride = new Ride(rideId, taxi, person, startingPoint, endingPoint);
            rideList.add(ride);
        }
        else
        {
            System.out.println("This taxino is" + taxi_no + "not found");
        }
    }


    public void changeDestination(int rideId, int newEndingpoint)
    {
        for (Ride ride : rideList)
        {
            if (ride.getrideId() == rideId)
            {
                ride.setEndingPoint(newEndingpoint);
                ride.getPerson().setDestination(newEndingpoint);
                System.out.println("Destination updated" + newEndingpoint);
            }
            else
            {
                    System.out.println(rideId + "Not found!!!!");
            }

        }
    }


}
