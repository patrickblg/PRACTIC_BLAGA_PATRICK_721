package org.example.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ereignis {
    private int id;
    private int tributId;
    private EventType eventType;
    private int points;
    private int day;

    public Ereignis(){}

    public Ereignis(int id, int tributId, EventType eventType, int points, int day) {
        this.id = id;
        this.tributId = tributId;
        this.eventType = eventType;
        this.points = points;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTributId() {
        return tributId;
    }

    public void setTributId(int tributId) {
        this.tributId = tributId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Ereignis{" +
                "id=" + id +
                ", tributId=" + tributId +
                ", eventType=" + eventType +
                ", points=" + points +
                ", day=" + day +
                '}';
    }
}
