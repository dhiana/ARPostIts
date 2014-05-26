package com.dhiana.arpostits.model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private Integer id;
    private Integer progress;
    private String title;
    private Boolean ready;
    private Boolean blocked;

    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;

    public Integer getId() {
        return id;
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

    public int getColor() {
        if (blocked) {
            return RED;
        } else if (ready) {
            return GREEN;
        }
        return YELLOW;
    }

}
