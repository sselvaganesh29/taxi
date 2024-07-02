import java.util.ArrayList;

public class RideManager extends TaxiManager
{
    private ArrayList<Ride> rideList;

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

}