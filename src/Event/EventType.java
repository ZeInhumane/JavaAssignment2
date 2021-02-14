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
public class EventType extends Event {

    private String eventType;

    public EventType(String inName, String inOrganizer, String inDate, double inFees,
            String inEventType) {
        super(inName, inOrganizer, inDate, inFees);
        this.eventType = inEventType;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String inEventType) {
        this.eventType = inEventType;
    }
}
