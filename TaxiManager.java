import java.util.ArrayList;
import java.util.stream.Stream;

public class TaxiManager
{
    public static final TaxiManager INSTANCE = new TaxiManager();

    private final ArrayList<Taxi> taxiList;


    private TaxiManager()
    {
        taxiList = new ArrayList<>();
    }


    public void addTaxi(Taxi taxi)
    {
        taxiList.add(taxi);
    }


    public void updateTaxi(int taxiNo, String newtaxiName, boolean newavailable)
    {
        for (Taxi taxi : taxiList)
        {
            if (taxi.getTaxino() == taxiNo)
            {
                taxi.setTaxiname(newtaxiName);
                taxi.setAvailable(newavailable);
            }
        }
    }


    public void deleteTaxi(int taxiNo)
    {
        taxiList.removeIf( taxi -> taxi.getTaxino() == taxiNo );
    }

    public Taxi taxiDetail(int taxiNo)
    {
        for ( Taxi taxi : taxiList )
        {
            if ( taxi.getTaxino() == taxiNo )
            {
                return taxi;
            }
        }
        return null;
    }

}
