package com.nibado.example.springmongo.pojo;

import java.util.Locale;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @Id
    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String email;

    public User() {

    }

    public User(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "User[id=%s, name=%s, email=%s]", id, name, email);
    }

    public String getId() {
        return id;
    }

}
