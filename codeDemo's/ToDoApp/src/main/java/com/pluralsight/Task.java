package com.pluralsight;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean complete;
    private String urgency ;
    private String notificationsMessage;
    private boolean Reminder;

    public Task(String _title) {
        this.title = _title;
    }
}
