package com.karamveer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {

    @Id
    private int id;

    private String name;

    private String specialist;

    public Doctor(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
    }
}
