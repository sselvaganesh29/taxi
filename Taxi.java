import java.util.ArrayList;
import java.util.Collection;

public class Taxi
{
    private int taxiNo;

    private String taxiName;

    private boolean available;

    private static final int pricePerkm = 50;

    private Collection<Ride> rides = new ArrayList<>();

    public Collection<Ride> getRides()
    {
        return rides;
    }

    public Taxi(int taxiNo, String taxiName, boolean available)
    {
        this.taxiNo = taxiNo;
        this.taxiName = taxiName;
        this.available = available;
    }

    public Taxi(int taxiNo,String taxiName)
    {
        this.taxiNo = taxiNo;
        this.taxiName = taxiName;
    }

    public int getTaxino()
    {
        return taxiNo;
    }

    public void setTaxino(int taxiNo)
    {
        this.taxiNo = taxiNo;
    }

    public String getTaxiName()
    {
        return taxiName;
    }

    public void setTaxiname(String taxiName)
    {
        this.taxiName = taxiName;
    }

    public boolean getAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public void addRide( Ride ride )
    {
        rides.add( ride );
    }

    public void removeRide( Ride ride )
    {
        rides.remove( ride );
    }

    public static int getPricePerkm()
    {
        return pricePerkm;
    }


    public void createRide(int rideId, Taxi taxi, Person person, int startingPoint, int endingPoint)
    {
            int destination = Math.abs(startingPoint - endingPoint);
            int fare = destination * pricePerkm;
            Ride ride = new Ride(rideId, taxi, person, startingPoint, endingPoint,destination,fare);
            taxi.getRides().add( ride );
            ride.setEndingPoint(endingPoint);
    }


}
