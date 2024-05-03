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


    public Songs(String name, int listeners, String author) {

        this.listeners = listeners;
        this.name = name;
        this.author = author;
    }
}