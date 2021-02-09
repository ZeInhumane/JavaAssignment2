package Event;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Collection of events. Implemented here using a one-d array.
 *
 * @author Alvin Tang
 */
public class EventManagement {

    private Event[] events; /// All available events

    private int countSearchResult; /// used by searchByFees

    /**
     *
     * @return number of items in the returned search array.
     */
    public int getCountSearchResult() {
        return 0;
        // TODO
    }

    /**
     * Constructor to initialize the events in the array.
     */
    public EventManagement() {
        int lines = 0;
        int numOfEvents = 0;
        String nextLine;
        try (BufferedReader br = new BufferedReader(new FileReader("eventDatabase.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Show all events using a Message Dialog. This may be changed to return a
     * string instead of displaying a dialog.
     */
    public void displayAllEvents() {
        // Best effort at even spacing for the data presented.
        // TODO

        // loop thru all items in the array and output details.
        // TODO
        // Change to return as string instead if desired.
        // TODO
    }

    /**
     * Add new event to the events array.
     *
     * @param inName
     * @param inOrganiser
     * @param inDate
     * @param inFees
     */
    public void addEvent(String inName, String inOrganiser, String inDate, double inFees) {
        // Create new array with current array length + 1
        // TODO

        // copy existing events to the new array
        // TODO
        // the new event is appended as the last event in new array
        // TODO
        // Reassign events to the new events.  The old array will be discarded.
        // TODO
    }

    /**
     * Delete an event on a given name. Capitalization doesn't matter. Uses the
     * utility method, searchByName()
     *
     * @param inEventName
     */
    public void deleteEvent(String inEventName) {
        // Try to locate the event by name first
        // TODO

        // event not found
        // TODO

        else {
            // create the new array with events less the deleted event
            // Size of new array will be current array length, less one
            // TODO

            // there are 2 indices we'll be working with.
            // i is the index for the current array
            // theNewIndex is the index into theNewList
            // TODO
                // this isn't the droid we're looking for...
                // We'll add all events that are not the event we want to delete
                // TODO
            }

        // TODO
    }
}

/**
 * Utility method that can be used by itself, or by the delete method.
 *
 * @param inEventName
 * @return Event object, if found.
 */
//    public Event searchByName(String inEventName) {
//        //TODO
//            // Found it! Retrieve. 
//            // Assuming there are no repeats.
//            // If there are repeats, this will retrieve the last one found.
//            // TODO
//        
//        // TODO
//    }
/**
 * search for all events equal or less than inFees
 *
 * @param inMaxFees
 * @return Returns array containing events that meet the search criteria.
 */
//    public Event[] searchByFees(double inMaxFees) {
//        // TODO
//        // Max case scenario is that all events meet inMaxFees
//        // TODO
//        
//        // iterate all items in the events array
//        // TODO
//        
//        // TODO
//    }
/**
 * Test method for all the methods in EventManager Class.
 *
 * @param args
 */
//    public static void main(String[] args) {
//        EventManager theEM = new EventManager();
//        theEM.displayAllEvents();
//        theEM.addEvent("Kickboxing", "Alvin", "5/6/2099", 59);
//        
//        theEM.displayAllEvents();
//        
//        // Test Search by name
//        Event theFoundEvent = theEM.searchByName("Swimming");
//        if (theFoundEvent == null)
//           JOptionPane.showMessageDialog(null, "Swimming not found!");
//        theFoundEvent = theEM.searchByName("Dancing");
//        
//        if(theFoundEvent != null)
//            JOptionPane.showMessageDialog(null, theFoundEvent.getName() + " is by " + theFoundEvent.getOrganiser());
//        // end Test Search by name
//        
//        Event[] theResults = theEM.searchByFees(11);
//        for(int i = 0; i< theEM.getCountSearchResult(); i++)
//            System.out.println(theResults[i].getName() + " costing $" + theResults[i].getFees());
//        
//        theEM.deleteEvent("Dancing");
//        theEM.displayAllEvents();
//    }
}
