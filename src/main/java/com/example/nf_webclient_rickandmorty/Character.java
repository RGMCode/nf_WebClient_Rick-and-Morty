package com.example.nf_webclient_rickandmorty;

import lombok.Data;

@Data
public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String gender;
}
