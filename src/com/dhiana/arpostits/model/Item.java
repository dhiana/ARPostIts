package com.dhiana.arpostits.model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private Integer id;
    private Integer progress;
    private String title;

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

}
