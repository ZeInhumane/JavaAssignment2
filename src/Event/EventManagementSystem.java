/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static jdk.nashorn.internal.objects.Global.undefined;

/**
 *
 * @author HP
 */
public class EventManagementSystem extends javax.swing.JFrame {

    EventManagement EventManagement = new EventManagement();

    /**
     * Creates new form Test
     */
    public EventManagementSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userSelectGroup = new javax.swing.ButtonGroup();
        userSelectEventType = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Normal = new javax.swing.JRadioButton();
        Administrator = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eventName = new javax.swing.JTextField();
        eventOrganizer = new javax.swing.JTextField();
        eventFees = new javax.swing.JTextField();
        onlineEvent = new javax.swing.JRadioButton();
        faceToFaceEvent = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        addEvent = new javax.swing.JButton();
        deleteEvent = new javax.swing.JButton();
        eventDate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchByEventText = new javax.swing.JTextField();
        searchByName = new javax.swing.JButton();
        registerEvent = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        searchByFeesButton = new javax.swing.JButton();
        searchByFeesText = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayEvents = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        displayEvent = new javax.swing.JButton();
        resetForm = new javax.swing.JButton();
        exitForm = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        userSelectGroup.add(Normal);
        Normal.setText("Normal User");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });

        userSelectGroup.add(Administrator);
        Administrator.setSelected(true);
        Administrator.setText("Administrator");
        Administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministratorActionPerformed(evt);
            }
        });

        jLabel1.setText("User Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Administrator)
                        .addGap(52, 52, 52)
                        .addComponent(Normal))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Administrator)
                    .addComponent(Normal))
                .addGap(16, 16, 16))
        );

        Administrator.getAccessibleContext().setAccessibleName("Administratior");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Name:");

        jLabel3.setText("Organizer:");

        jLabel4.setText("Fees:");

        jLabel5.setText("Date:");

        eventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameActionPerformed(evt);
            }
        });

        eventOrganizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventOrganizerActionPerformed(evt);
            }
        });

        userSelectEventType.add(onlineEvent);
        onlineEvent.setText("Online Event");

        userSelectEventType.add(faceToFaceEvent);
        faceToFaceEvent.setText("Face to Face Event");
        faceToFaceEvent.setToolTipText("");

        jLabel6.setText("Add/Delete Event");

        addEvent.setBackground(new java.awt.Color(51, 204, 0));
        addEvent.setText("Add Event");
        addEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEvent(evt);
            }
        });

        deleteEvent.setBackground(new java.awt.Color(51, 204, 0));
        deleteEvent.setText("Delete Event");
        deleteEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEvent(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eventOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eventFees, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(onlineEvent)
                                .addGap(87, 87, 87)
                                .addComponent(faceToFaceEvent)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(addEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteEvent)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eventOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eventFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faceToFaceEvent)
                    .addComponent(onlineEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEvent)
                    .addComponent(deleteEvent))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("Event Name:");

        searchByName.setText("Search By Name");
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByName(evt);
            }
        });

        registerEvent.setText("Register Event");
        registerEvent.setEnabled(false);
        registerEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(searchByEventText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchByName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(registerEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchByEventText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("Event Fees($)");

        searchByFeesButton.setText("Search by fees");
        searchByFeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByFees(evt);
            }
        });

        searchByFeesText.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByFeesText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(searchByFeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(searchByFeesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(searchByFeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        displayEvents.setEditable(false);
        displayEvents.setColumns(20);
        displayEvents.setRows(5);
        jScrollPane1.setViewportView(displayEvents);

        jLabel9.setText("Results");

        displayEvent.setBackground(new java.awt.Color(0, 102, 255));
        displayEvent.setForeground(new java.awt.Color(255, 255, 255));
        displayEvent.setText("Display Events");
        displayEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllEvents(evt);
            }
        });

        resetForm.setBackground(new java.awt.Color(0, 102, 255));
        resetForm.setForeground(new java.awt.Color(255, 255, 255));
        resetForm.setText("Reset");
        resetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFormActionPerformed(evt);
            }
        });

        exitForm.setBackground(new java.awt.Color(0, 102, 255));
        exitForm.setForeground(new java.awt.Color(255, 255, 255));
        exitForm.setText("Exit");
        exitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitForm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitForm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        registerEvent.setEnabled(true);
        addEvent.setEnabled(false);
        deleteEvent.setEnabled(false);
    }//GEN-LAST:event_NormalActionPerformed

    private void AdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministratorActionPerformed
        registerEvent.setEnabled(false);
        addEvent.setEnabled(true);
        deleteEvent.setEnabled(true);
    }//GEN-LAST:event_AdministratorActionPerformed

    private void resetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFormActionPerformed
        eventName.setText(null);
        eventOrganizer.setText(null);
        eventFees.setText(null);
        eventDate.setText(null);
        displayEvents.setText(null);
        searchByFeesText.setValue(0);
        searchByEventText.setText(null);
    }//GEN-LAST:event_resetFormActionPerformed

    private void exitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFormActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFormActionPerformed

    private void eventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameActionPerformed

    private void eventOrganizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventOrganizerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventOrganizerActionPerformed

    private void displayAllEvents(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllEvents
        displayEvents.setText("");

        displayEvents.append(EventManagement.displayAllEvents());
    }//GEN-LAST:event_displayAllEvents

    private void addEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEvent
        EventManagement EventManagement = new EventManagement();
        String inName = null;
        String inOrganizer = null;
        String inDate = null;
        String typeOfEvent = null;
        boolean correctSubmission = true;
        double inEventFees = 0;
        System.out.println(eventName.getText() + " this is supposed to be an empty event name");
        try {
            inEventFees = Double.parseDouble(eventFees.getText());
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Please enter a valid event fee", "Alert", JOptionPane.WARNING_MESSAGE);
            eventFees.setText("");
            correctSubmission = false;
        }

        if (eventName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an event name that is not null", "Alert", JOptionPane.WARNING_MESSAGE);
            correctSubmission = false;
        } else {
            inName = eventName.getText();
        }

        if (eventOrganizer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an organizer that is not null", "Alert", JOptionPane.WARNING_MESSAGE);
            correctSubmission = false;
        } else {
            inOrganizer = eventOrganizer.getText();
        }

        if (eventDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an event date that is not null", "Alert", JOptionPane.WARNING_MESSAGE);
            correctSubmission = false;
        } else {
            inDate = eventDate.getText();
        }

        if (onlineEvent.isSelected()) {
            typeOfEvent = "Online Event";
        } else if (faceToFaceEvent.isSelected()) {
            typeOfEvent = "Face To Face Event";
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid event", "Alert", JOptionPane.WARNING_MESSAGE);
            correctSubmission = false;
        }

        if (correctSubmission == true) {
            EventManagement.addEvent(inName, inOrganizer, inDate, inEventFees, typeOfEvent);
            JOptionPane.showMessageDialog(this, "Successfully submitted the event into the database!", "Success", JOptionPane.INFORMATION_MESSAGE);
            eventName.setText("");
            eventOrganizer.setText("");
            eventDate.setText("");
            eventFees.setText("");
            userSelectEventType.clearSelection();
            displayEvents.setText("");

            displayEvents.append(EventManagement.displayAllEvents());
            validate();
        }
    }//GEN-LAST:event_addEvent

    private void deleteEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEvent

        String inName = eventName.getText();
        boolean isFulfilled;
        isFulfilled = EventManagement.deleteEvent(inName);
        if (isFulfilled == true) {
            JOptionPane.showMessageDialog(this, "Successfully deleted the event" + inName + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
            displayEvents.setText("");

            displayEvents.append(EventManagement.displayAllEvents());
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid event to delete by :0", "Alert", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_deleteEvent

    private void searchByName(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByName

        displayEvents.setText("");
        String inEventName = searchByEventText.getText();
        if (inEventName == null) {
            JOptionPane.showMessageDialog(this, "Please enter a something to search by!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (!inEventName.matches("^[a-zA-Z0-9_][a-zA-Z0-9_ ]*[a-zA-Z0-9_]$")) {
            JOptionPane.showMessageDialog(this, "Please enter a STRING to search by!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            String displaySearchResults = EventManagement.searchByName(inEventName);
            if(displaySearchResults == null ||displaySearchResults == ""){
                JOptionPane.showMessageDialog(this, "There seems to be no event by that name!", "Alert", JOptionPane.WARNING_MESSAGE);
            }else{
                displayEvents.append(displaySearchResults);
            }
        }
    }//GEN-LAST:event_searchByName

    private void searchByFees(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByFees
        displayEvents.setText("");
        double inEventFees = (double) searchByFeesText.getValue();

        String displaySearchResults = EventManagement.searchByFees(inEventFees);
        displayEvents.append(displaySearchResults);
    }//GEN-LAST:event_searchByFees
ArrayList<String> checkForDuplicate = new ArrayList<>();
    private void registerEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEventActionPerformed
        
        String inEventName = searchByEventText.getText();
        boolean isDuplicate = false;
        for (int i = 0; i < checkForDuplicate.size(); i++) {
            String checkForDupe = checkForDuplicate.get(i);
            System.out.println(checkForDupe + "checking for this dupe");
            System.out.println(inEventName + " in event name");
            if (checkForDupe.equalsIgnoreCase(inEventName)) {
                System.out.println("it is entering");
                checkForDuplicate.get(i);
                isDuplicate = true;
            } else {
            }
        }
        
        if (inEventName == null) {
            JOptionPane.showMessageDialog(this, "Please enter a something to register !", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (!inEventName.matches("^[a-zA-Z0-9_][a-zA-Z0-9_ ]*[a-zA-Z0-9_]$")) {
            JOptionPane.showMessageDialog(this, "Please enter a STRING to search by!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (isDuplicate == true) {
            JOptionPane.showMessageDialog(this, "Please enter a another event to register by, as this event has already been registered!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            displayEvents.setText(null);
            String displaySearchResults = EventManagement.registerEvent(inEventName);
            displayEvents.append(displaySearchResults);
            checkForDuplicate.add(inEventName);
            System.out.println(checkForDuplicate);
            System.out.println(isDuplicate);
        }
    }//GEN-LAST:event_registerEventActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Administrator;
    private javax.swing.JRadioButton Normal;
    private javax.swing.JButton addEvent;
    private javax.swing.JButton deleteEvent;
    private javax.swing.JButton displayEvent;
    private javax.swing.JTextArea displayEvents;
    private javax.swing.JTextField eventDate;
    private javax.swing.JTextField eventFees;
    private javax.swing.JTextField eventName;
    private javax.swing.JTextField eventOrganizer;
    private javax.swing.JButton exitForm;
    private javax.swing.JRadioButton faceToFaceEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton onlineEvent;
    private javax.swing.JButton registerEvent;
    private javax.swing.JButton resetForm;
    private javax.swing.JTextField searchByEventText;
    private javax.swing.JButton searchByFeesButton;
    private javax.swing.JSpinner searchByFeesText;
    private javax.swing.JButton searchByName;
    private javax.swing.ButtonGroup userSelectEventType;
    private javax.swing.ButtonGroup userSelectGroup;
    // End of variables declaration//GEN-END:variables
}
