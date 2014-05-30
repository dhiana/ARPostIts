package com.dhiana.arpostits.model;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Integer id;
    private Integer marker;
    private Integer progress;
    private String title;
    private Boolean ready;
    private Boolean blocked;
    private List<Task> tasks = new ArrayList<Task>();

    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;

    public Integer getId() {
        return id;
    }

    public Integer getMarker() {
        return marker;
    }

    public void setMarker(Integer marker) {
        this.marker = marker;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getColor() {
        if (blocked) {
            return RED;
        } else if (ready) {
            return GREEN;
        }
        return YELLOW;
    }

}
