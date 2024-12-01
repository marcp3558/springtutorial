package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Glossary {
    public String title;
    public ArrayList<String> theList;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("theList")
    public ArrayList<String> getTheList() {
        return theList;
    }

    public void setTitle(String value) {
        title = value;
    }

    public void setTheList(ArrayList<String> value) {
        theList = value;
    }
}
