package org.example.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Tribut {
    private int id;
    private String name;
    private int distrikt;
    @JsonProperty("status")
    private Status status;
    private int skillLevel;

    public Tribut() {}

    public Tribut(int id, String name, int distrikt, Status status, int skillLevel) {
        this.id = id;
        this.name = name;
        this.distrikt = distrikt;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrikt() {
        return distrikt;
    }

    public void setDistrikt(int distrikt) {
        this.distrikt = distrikt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Tribut{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", distrikt=" + distrikt +
                ", status=" + status +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
