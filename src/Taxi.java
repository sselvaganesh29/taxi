import java.util.ArrayList;
import java.util.Collection;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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


    public void createRide(int rideId, Person person, int startingPoint, int endingPoint)
    {
        Properties rideps = new Properties();

        try(FileInputStream ridefield = new FileInputStream("configuration/ride.properties"))
        {
            rideps.load(ridefield);

            int startingPt = Integer.parseInt(rideps.getProperty("ride.startingPoint"));


            int destination = Math.abs(startingPoint - endingPoint);
            int fare = destination * pricePerkm;
            Ride ride = new Ride(rideId, this, person, startingPoint, endingPoint, destination, fare);
            this.getRides().add( ride );
            ride.setEndingPoint(endingPoint);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void showRideDetails()
    {
        for (Ride ride : getRides())
        {
            System.out.println("Ride ID: " + ride.getRideId());
            System.out.println("Person Name: " + ride.getPerson().getName());
            System.out.println("Starting Point: " + ride.getStartingPoint());
            System.out.println("Ending Point: " + ride.getEndingPoint());
            System.out.println("Destination: " + ride.getDestination());
            System.out.println("Fare: " + ride.getFare());
        }
    }


}