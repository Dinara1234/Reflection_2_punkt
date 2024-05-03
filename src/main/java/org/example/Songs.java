package org.example;


import org.example.json_serializer.JsonElement;

import static org.junit.Assert.assertEquals;

public class Songs {
    @JsonElement
    public String name;
    @JsonElement
    public int listeners;
    @JsonElement
    public String author;
    public String getName() {
        return name;
    }

    @JsonElement
    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Songs(String name, int listeners, String author) {

        this.listeners = listeners;
        this.name = name;
        this.author = author;
    }
}