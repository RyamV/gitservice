package com.api.app.models;

import java.io.Serializable;

public class ModelRequest implements Serializable{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
