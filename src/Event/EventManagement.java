package Event;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Collection of events. Implemented here using a one-d array.
 *
 * @author Matthew Chan
 */
public class EventManagement {
ArrayList<String> test = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();
//    private Event[] allResult;
    ArrayList<Event> allResult = new ArrayList<>();
    ArrayList<EventType> allResultEvent = new ArrayList<>();
    TextFileReader textFileReader = new TextFileReader();
    /**
     * Constructor to initialize the events in the array.
     */
    public EventManagement() {
        result = textFileReader.getAllData();
        for (int i = 0; i < result.size(); i++) {
            String currentLine = result.get(i);
            String name = currentLine.split(";")[0].trim();
            String club = currentLine.split(";")[1].trim();
            String price = currentLine.split(";")[2].trim();
            String date = currentLine.split(";")[3].trim();
            String eventType = currentLine.split(";")[4].trim();
            allResult.add(new Event(name, club, date, Double.parseDouble(price)));
            allResultEvent.add(new EventType(name, club, date, Double.parseDouble(price),eventType));
        }
    }

    /**
     * Show all events using a Message Dialog. This may be changed to return a
     * string instead of displaying a dialog.
     */
    public String displayAllEvents() {
        // Best effort at even spacing for the data presented.
        String displayAllEvents = String.format("%-10s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-35s", "Organizer")
                + String.format("%-35s", "Date")
                + String.format("%-35s", "Fees($)")
                + "\n";

        // loop thru all items in the array and output details.
        for (int i = 0; i < allResult.size(); i++) {
            System.out.println(allResult.size() + "this should be updated");
            displayAllEvents += String.format("%-10s", i + 1)
                    + String.format("%-30s", allResult.get(i).getName())
                    + String.format("%-35s", allResult.get(i).getOrganizer())
                    + String.format("%-35s", allResult.get(i).getDate())
                    + String.format("%-35s", allResult.get(i).getFees())
                    + "\n";
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
        allResult.add(new Event(inName, inOrganizer, inDate, inFees));
        //Add array list to another array list
        String stringInFees = String.valueOf(inFees);
        //List 1
        List<String> namesList = Arrays.asList(inName + ";", inOrganizer + ";", stringInFees + ";", inDate + ";", typeOfEvent + "\n");
        //List 2
        ArrayList<String> otherList = new ArrayList<>();
        otherList.addAll(namesList);

        try {
            FileOutputStream fileOut
                    = new FileOutputStream("./src/Event/EventDatabase.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(namesList);
            out.close();
            fileOut.close();

            File file = new File("./src/Event/EventDatabase.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write(otherList.get(0));
            fr.write(otherList.get(1));
            fr.write(otherList.get(2));
            fr.write(otherList.get(3));
            fr.write(otherList.get(4));
            System.out.println(allResult.size());

            System.out.println(allResult.size());
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
        String toAddToDat = null;
//        ArrayList<String> newDatabase = new ArrayList<>();
        int lineToDelete = -1;
        // TODO

        // event not found
        // TODO
        for (int i = 0; i < allResult.size(); i++) {
            if (allResult.get(i).getName().equalsIgnoreCase(eventToDelete)) {
                lineToDelete = i;
                allResult.remove(i);
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
                File fileDat = new File("./src/Event/EventDatabase.dat");
                FileWriter frDat = new FileWriter(fileDat, false);
                frDat.write("");
                frDat.close();
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
                        toAddToDat += result.get(i) + "\n";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    FileOutputStream fileOut
                            = new FileOutputStream("./src/Event/EventDatabase.dat");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(toAddToDat);
                    out.close();
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
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
        String displaySearch = String.format("%-10s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-35s", "Organizer")
                + String.format("%-35s", "Date")
                + String.format("%-35s", "Fees($)")
                + "\n";
        ArrayList<Integer> toBeDisplayed = new ArrayList<>();
        for (int i = 0; i < allResultEvent.size(); i++) {

            if (allResultEvent.get(i).getName().toLowerCase().contains(inEventName.toLowerCase())) {
                toBeDisplayed.add(i);
                System.out.println("line to delete" + i);
                i+=999;
            }
        }
        for (int i = 0; i < allResultEvent.size(); i++) {
            for (int j = 0; j < toBeDisplayed.size(); j++) {
                if (toBeDisplayed.get(j) == i) {
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", allResultEvent.get(i).getName())
                            + String.format("%-35s", allResultEvent.get(i).getOrganizer())
                            + String.format("%-35s", allResultEvent.get(i).getDate())
                            + String.format("%-35s", allResultEvent.get(i).getFees());
                    if(allResultEvent.get(i).getEventType() == "Online Event"){
                        displaySearch += String.format("%-1s", "\nThis is an online event, "
                                + "\n there is no limit to the number of participants." + "\n");
                    }else{
                        displaySearch += String.format("%-1s", "\nThis is a face to face event,the numer of participants is limited for 20, "
                                + "\n Please wear your masks and maintain social distance." + "\n");
                    }
                    
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

    public String registerEvent(String inEventName) {
        double totalPrice = 0;
        String displaySearch = String.format("%-10s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-35s", "Organizer")
                + String.format("%-35s", "Date")
                + String.format("%-35s", "Fees($)")
                + "\n";
        for (int i = 0; i < allResult.size(); i++) {
            if (allResult.get(i).getName().toLowerCase().contains(inEventName.toLowerCase())) {
                registerEvent.add(i);
                System.out.println("it is adding");
                i += 999;
            }
        }
        for (int i = 0; i < allResult.size(); i++) {
            for (int j = 0; j < registerEvent.size(); j++) {
                System.out.println("this is entering 0");
                if (registerEvent.get(j) == i) {
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", allResult.get(i).getName())
                            + String.format("%-35s", allResult.get(i).getOrganizer())
                            + String.format("%-35s", allResult.get(i).getDate())
                            + String.format("%-35s", allResult.get(i).getFees())
                            + "\n";
                    totalPrice += allResult.get(i).getFees();
                }
            }
        }
        displaySearch += "The total price of all the events is " + totalPrice;
        return displaySearch;
    }

    /**
     * search for all events equal or less than inFees
     *
     * @param inMaxFees
     * @return Returns array containing events that meet the search criteria.
     */
    public String searchByFees(double inMaxFees) {
        String displaySearch = String.format("%-10s", "S/N")
                + String.format("%-30s", "Name")
                + String.format("%-35s", "Organizer")
                + String.format("%-35s", "Date")
                + String.format("%-35s", "Fees($)")
                + "\n";
        ArrayList<Integer> toBeDisplayed = new ArrayList<>();
        for (int i = 0; i < allResult.size(); i++) {
            if (allResult.get(i).getFees() < inMaxFees) {
                toBeDisplayed.add(i);
            }
        }
        for (int i = 0; i < allResult.size(); i++) {
            for (int j = 0; j < toBeDisplayed.size(); j++) {
                if (toBeDisplayed.get(j) == i) {
                    displaySearch += String.format("%-10s", i + 1)
                            + String.format("%-30s", allResult.get(i).getName())
                            + String.format("%-35s", allResult.get(i).getOrganizer())
                            + String.format("%-35s", allResult.get(i).getDate())
                            + String.format("%-35s", allResult.get(i).getFees())
                            + "\n";
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
