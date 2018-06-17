package com.rum.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = Contact.COLLECTION_NAME)
public class Contact implements Serializable {

    public static final String COLLECTION_NAME = "contacts";

    @Id
    private String id;

    private String name;

    private String number;

    private String email;

    public Contact(){

    }

    public Contact(String name, String number, String email){

        this.name = name;
        this.number = number;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
