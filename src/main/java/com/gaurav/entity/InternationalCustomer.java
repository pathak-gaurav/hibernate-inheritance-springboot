package com.gaurav.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InternationalCustomer extends Customer implements Serializable {

    private String passportNumber;

    public InternationalCustomer( String firstName, String lastName, String passportNumber) {
        super(firstName, lastName);
        this.passportNumber = passportNumber;
    }
}
