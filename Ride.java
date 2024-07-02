import java.lang.annotation.Repeatable;

public class Ride
{
    private int rideId;

    private Taxi taxi;

    private Person person;

    private int startingPoint = 1;

    private int endingPoint;

    public Ride( int rideId, Taxi taxi, Person person, int startingPoint, int endingPoint )
    {
        this.rideId = rideId;
        this.taxi = taxi;
        this.person = person;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public int getrideId() {
        return rideId;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public Person getPerson() {
        return person;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public int getEndingPoint() {
        return endingPoint;
    }

    public void setrideId(int id) {
        this.rideId = id;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void setEndingPoint(int endingPoint) {
        this.endingPoint = endingPoint;
    }

}
