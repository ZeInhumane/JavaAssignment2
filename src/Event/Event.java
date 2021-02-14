package Event;

/**
 * The Event class provides a basic encapsulation of the 4 properties that
 * defines an event, and its necessary getters and setters.
 *
 * @author Matthew Chan
 */
public class Event implements java.io.Serializable {

    /**
     * @param args the command line arguments
     */
    private String name, organizer, date, eventType;
    private double fees;
//    name, organizer, fees and date and time of the event

    public Event(String inName, String inOrganizer, String inDate, double inFees,
            String inEventType) {
        this.name = inName;
        this.organizer = inOrganizer;
        this.date = inDate;
        this.fees = inFees;
        this.eventType = inEventType;
    }

    public String getName() {
        return name;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getDate() {
        return date;
    }

    public double getFees() {
        return fees;
    }

    public String getEventType() {
        return eventType;
    }

    //Getters and setters
    public void setName(String inName) {
        name = inName;
    }

    public void setOrganizer(String inOrganizer) {
        organizer = inOrganizer;
    }

    public void setDate(String inDate) {
        date = inDate;
    }

    public void setFees(double inFees) {
        this.fees = inFees;
    }
    public void setEventType(String inEventType) {
        this.eventType = inEventType;
    }

}
