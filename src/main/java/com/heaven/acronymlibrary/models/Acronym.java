package com.heaven.acronymlibrary.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;



public class Acronym {
    @Id
    private ObjectId _id;

    private String acronymName;

    private String acronymMeaning;

    public Acronym() {
    }

    public Acronym(ObjectId _id, String acronymName, String acronymMeaning) {
        this._id = _id;
        this.acronymName = acronymName;
        this.acronymMeaning = acronymMeaning;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getAcronymName() {
        return acronymName;
    }

    public void setAcronymName(String acronymName) {
        this.acronymName = acronymName;
    }

    public String getAcronymMeaning() {
        return acronymMeaning;
    }

    public void setAcronymMeaning(String acronymMeaning) {
        this.acronymMeaning = acronymMeaning;
    }
}
