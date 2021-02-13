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
 * @author Matthew Chan
 */
public class EventManagement {

    ArrayList<String> result = new ArrayList<>();

    private int countSearchResult; /// used by searchByFees
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
        String displayAllEvents = String.format("%-10s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-35s", "Organizer")
                + String.format("%-35s", "Date")
                + String.format("%-35s", "Fees($)")
                + String.format("%-35s", "Event Type") + "\n";
        displayAll.format(displayAllEvents);

        // loop thru all items in the array and output details.
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0].trim();
            String club = currentLine.split(";")[1].trim();
            String date = currentLine.split(";")[2].trim();
            String price = currentLine.split(";")[3].trim();
            String eventType = currentLine.split(";")[4].trim();
            displayAllEvents += String.format("%-10s", i + 1)
                    + String.format("%-30s", name)
                    + String.format("%-35s", club)
                    + String.format("%-35s", date)
                    + String.format("%-35s", price)
                    + String.format("%-35s", eventType) + "\n";
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
        List<String> namesList = Arrays.asList(inName + ";", inOrganizer + ";", stringInFees + ";", inDate + ";", typeOfEvent + "\n");
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

        return correctDeletion;
    }

    /**
     * Utility method that can be used by itself, or by the delete method.
     *
     * @param inEventName
     * @return Event object, if found.
     */
    public String searchByName(String inEventName) {
        String displaySearch = "";
        ArrayList<Integer> toBeDisplayed = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0];
            if (name.toLowerCase().contains(inEventName.toLowerCase())) {
                toBeDisplayed.add(i);
                System.out.println("line to delete" + i);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < toBeDisplayed.size(); j++) {
                if (toBeDisplayed.get(j) == i) {
                    String currentLine = result.get(i);
                    String name = currentLine.split(";")[0].trim();
                    String club = currentLine.split(";")[1].trim();
                    String date = currentLine.split(";")[2].trim();
                    String price = currentLine.split(";")[3].trim();
                    String eventType = currentLine.split(";")[4].trim();
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", name)
                            + String.format("%-35s", club)
                            + String.format("%-35s", date)
                            + String.format("%-35s", price)
                            + String.format("%-35s", eventType) + "\n";
                }
            }
        }
        return displaySearch;
        //TODO
        // Found it! Retrieve. 
        // Assuming there are no repeats.
        // If there are repeats, this will retrieve the last one found.
        // TODO

        // TODO
    }
    ArrayList<Integer> registerEvent = new ArrayList<>();
    public String registerEvent(String inEventName){
        double totalPrice = 0;
        String displaySearch = "";
        
        
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0];
            if (name.toLowerCase().contains(inEventName.toLowerCase())) {
                registerEvent.add(i);
                System.out.println("it is adding");
                i+=999;
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("this is entering -1");
            System.out.println(registerEvent.size() +" hi");
            for (int j = 0; j < registerEvent.size(); j++) {
                System.out.println("this is entering 0");
                if (registerEvent.get(j) == i) {
                    System.out.println("this is entering");
                    String currentLine = result.get(i);
                    String name = currentLine.split(";")[0].trim();
                    String club = currentLine.split(";")[1].trim();
                    String date = currentLine.split(";")[2].trim();
                    String price = currentLine.split(";")[3].trim();
                    String eventType = currentLine.split(";")[4].trim();
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", name)
                            + String.format("%-35s", club)
                            + String.format("%-35s", date)
                            + String.format("%-35s", price)
                            + String.format("%-35s", eventType) + "\n";
                    totalPrice += Double.parseDouble(date);  
                }
            }
        }
        displaySearch += totalPrice;
        return displaySearch;
    }
    /**
     * search for all events equal or less than inFees
     *
     * @param inMaxFees
     * @return Returns array containing events that meet the search criteria.
     */
    public String searchByFees(double inMaxFees) {
        String displaySearch = "";
        ArrayList<Integer> toBeDisplayed = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String stringPrice = currentLine.split(";")[2];
            double price = Double.parseDouble(stringPrice);
            if (price < inMaxFees) {
                toBeDisplayed.add(i);
                System.out.println("line to delete" + i);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < toBeDisplayed.size(); j++) {
                if (toBeDisplayed.get(j) == i) {
                    String currentLine = result.get(i);
                    String name = currentLine.split(";")[0].trim();
                    String club = currentLine.split(";")[1].trim();
                    String date = currentLine.split(";")[2].trim();
                    String price = currentLine.split(";")[3].trim();
                    String eventType = currentLine.split(";")[4].trim();
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", name)
                            + String.format("%-35s", club)
                            + String.format("%-35s", date)
                            + String.format("%-35s", price)
                            + String.format("%-35s", eventType) + "\n";
                }
            }
        }
        return displaySearch;
    }

    /**
     * Test method for all the methods in EventManager Class.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventManagement theEM = new EventManagement();

    }
}
