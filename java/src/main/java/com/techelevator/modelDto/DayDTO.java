package com.techelevator.modelDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayDTO {

    @JsonProperty("is_overnight")
    private boolean isOvernight;
    private String start;
    private String end;
    private int day;

    public boolean isOvernight() {
        return isOvernight;
    }

    public void setOvernight(boolean overnight) {
        isOvernight = overnight;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public DayDTO(boolean isOvernight, String start, String end, int day) {
        this.isOvernight = isOvernight;
        this.start = start;
        this.end = end;
        this.day = day;
    }

    public DayDTO() {
    }
}
