/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

/**
 *
 * @author HP
 */
public class Event {

    /**
     * @param args the command line arguments
     */
    private String name, organizer, date;
    private double fees;
//    name, organizer, fees and date and time of the event
    public Event(String inName,String inOrganizer,String inDate,
    double inFees){
    this.name = inName;
    this.organizer = inOrganizer;
    this.date = inDate;
    this.fees = inFees;
}
    public void setName(String inName){
        name = inName;
    }
    public void setOrganizer(String inOrganizer){
        organizer = inOrganizer;
    }
    public void setDate(String inDate){
        date = inDate;
    }
    public void setName(double inFees){
        this.fees = inFees;
    }
    public String getName(){
        return name;
    }
    public String getOrganizer(){
        return organizer;
    }
    public String getDate(){
        return date;
    }
    public double fees(){
        return fees;
    }
    
}
