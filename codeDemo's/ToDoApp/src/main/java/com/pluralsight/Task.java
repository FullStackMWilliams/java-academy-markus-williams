package com.pluralsight;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean completed;
    private String urgency ;
    private String notificationsMessage;
    private boolean Reminder;

    public Task(String _title) {
        this.title = _title;
    }

    public void markCompleted(){
     this.completed = true;
    }
// Needed to add this return conditional if statement in order for the system to read our array list in our Main java class  that's why we were having trouble in having the computer tell us what we wanted
    public String toString() {
        if (completed) {
            return "[Completed]" + title;
        }else {
            return "[Uncompleted]" + title;
        }
    }
}
