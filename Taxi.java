import java.util.ArrayList;
import java.util.Collection;

public class Taxi
{
    private int taxiNo;

    private String taxiName;

    private boolean available;

    private int destination;

    private int price;

    private final Collection<Ride> rides = new ArrayList<>();


    public Taxi(int taxino, String taxi_name, boolean available)
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

    public int getTaxiNo()
    {
        return taxiNo;
    }

    public void addRide( Ride ride )
    {
        rides.add( ride );
    }

    public void removeRide( Ride ride )
    {
        rides.remove( ride );
    }

    public String getTaxi_name()
    {
        return taxiName;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setTaxi_no(int taxiNo)
    {
        this.taxiNo = taxiNo;
    }

    public void setTaxi_name(String taxiName)
    {
        this.taxiName = taxiName;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

}
