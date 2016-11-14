package com.otto;

/**
 * Created by Hari Prasad on 11/14/16.
 */

public class Report {
    private String message;

    public Report(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
