package com.api.app.models;

import java.io.Serializable;

public class ModelResponse implements Serializable{
    private int id;
    private String nombre;
    private boolean status;
    private int codigo;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isStatus() {
        return status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
