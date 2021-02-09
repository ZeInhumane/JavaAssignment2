package Event;

/**
 * The Event class provides a basic encapsulation of the 4 
 * properties that defines an event, and its necessary getters and setters.
 * @author Alvin Tang
 */
public class Event {
    private String name;
    private String organiser;
    private String date;
    private double fees;
    
    /**
     * Constructor
     * @param inName A string to describe the name of the event.
     * @param inOrganiser A string to describe the organiser.
     * @param inDate A string representing the date.
     * @param inFees A double for the cost of the event.
     */
    public Event(String inName,
            String inOrganiser,
            String inDate,
            double inFees){

        // Complete constructor here.
    }
    
    /**
     * Getter for name.
     * @return name of event
     */
    public String getName(){
        // TODO
    }
    /**
     * Changes the name of the event.
     * @param inName 
     */
    public void setName(String inName){
        // TODO
    }
    /**
     * Returns the organiser for the event.
     * @return organiser of event.
     */
    public String getOrganiser(){
        // TODO
    }
    
    /**
     * Change organiser for the event.
     * @param inOrganiser 
     */
    public void setOrganiser(String inOrganiser){
        // TODO
    }

    /**
     * Returns date of event as a string.
     * @return Date of event.
     */
    public String getDate() {
        // TODO
    }
    
    /**
     * Change the date for the event.
     * @param inDate 
     */
    public void setDate(String inDate) {
        // TODO
    }
    
    /**
     * Returns cost of the event.
     * @return Cost of event.
     */
    public double getFees(){
        // TODO
    }
    /**
     * Change cost of event.
     * @param inFees 
     */
    public void setFees(double inFees){
        // TODO
    }
    
    /**
     * Test program for the class.
     * @param args 
     */
    public static void main(String[] args) {
        Event theEvent = new Event("Swimming", "SP", "20/2/2021", 20.99);
        System.out.println(theEvent.getName() + " is on " + theEvent.getDate());
    }

}