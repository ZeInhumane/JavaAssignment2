package Event;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Collection of events. Implemented here using a one-d array.
 *
 * @author Alvin Tang
 */
public class EventManagement {

    ArrayList<String> result = new ArrayList<>();

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
        try (BufferedReader br = new BufferedReader(new FileReader("./src/Event/EventDatabase.txt"))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        System.out.println(result.size());
    }

    /**
     * Show all events using a Message Dialog. This may be changed to return a
     * string instead of displaying a dialog.
     */
    public String displayAllEvents() {

        String displayAll = null;
        // Best effort at even spacing for the data presented.
        String displayAllEvents = String.format("%-8s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-25s", "Organizer")
                + String.format("%-20s", "Date")
                + String.format("%-35s", "Fees($)")
                + String.format("%-20s", "Event Type") + "\n";
        displayAll.format(displayAllEvents);

        // loop thru all items in the array and output details.
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0];
            String club = currentLine.split(";")[1];
            String date = currentLine.split(";")[2];
            String price = currentLine.split(";")[3];
            String eventType = currentLine.split(";")[4];
            displayAllEvents += String.format("%-8s", i+1)
                    + String.format("%-30s", name)
                    + String.format("%-25s", club)
                    + String.format("%-20s", date)
                    + String.format("%-35s", price)
                    + String.format("%-20s", eventType) + "\n";
        }
        return displayAllEvents;
    }

    /**
     * Add new event to the events array.
     *
     * @param inName
     * @param inOrganiser
     * @param inDate
     * @param inFees
     */
    public void addEvent(String inName, String inOrganizer, String inDate, double inFees, String typeOfEvent) {
        //Add array list to another array list
        String stringInFees = String.valueOf(inFees);
        //List 1
        List<String> namesList = Arrays.asList(inName + ";", inOrganizer + ";", stringInFees + ";", inDate + ";", typeOfEvent);
        //List 2
        ArrayList<String> otherList = new ArrayList<>();
        otherList.addAll(namesList);
        try {
            File file = new File("./src/Event/EventDatabase.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write(otherList.get(0));
            fr.write(otherList.get(1));
            fr.write(otherList.get(2));
            fr.write(otherList.get(3));
            fr.write(otherList.get(4));
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Delete an event on a given name. Capitalization doesn't matter. Uses the
     * utility method, searchByName()
     *
     * @param inEventName
     */
    public boolean deleteEvent(String inEventName) {
        boolean correctDeletion = true;
        String eventToDelete = inEventName;
//        ArrayList<String> newDatabase = new ArrayList<>();
        int lineToDelete = -1;
        // TODO

        // event not found
        // TODO
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0];
            if (name.equalsIgnoreCase(eventToDelete)) {
                lineToDelete = i;
                System.out.println("line to delete" + i);
            }
        }
        if (lineToDelete != -1) {
            //clear database first
            try {
                File file = new File("./src/Event/EventDatabase.txt");
                FileWriter fr = new FileWriter(file, false);
                fr.write("");
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < result.size(); i++) {
                if (lineToDelete == i) {
                } else {
                    try {
                        File newDatabase = new File("./src/Event/EventDatabase.txt");
                        FileWriter newDatabasefr = new FileWriter(newDatabase, true);
                        newDatabasefr.write(result.get(i) + "\n");
                        newDatabasefr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } else {
            correctDeletion = false;
        }
//        else {
//            // create the new array with events less the deleted event
//            // Size of new array will be current array length, less one
//            // TODO
//
//            // there are 2 indices we'll be working with.
//            // i is the index for the current array
//            // theNewIndex is the index into theNewList
//            // TODO
//                // this isn't the droid we're looking for...
//                // We'll add all events that are not the event we want to delete
//                // TODO
//            }
        // TODO
        return correctDeletion;
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
    public static void main(String[] args) {
        EventManagement theEM = new EventManagement();
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
    }
}
