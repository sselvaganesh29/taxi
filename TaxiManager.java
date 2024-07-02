import java.util.ArrayList;

public class TaxiManager
{

    private ArrayList<Taxi> taxiList;


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


}
