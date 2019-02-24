package com.gaurav.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NationalCustomer extends Customer implements Serializable {

    private String socialSecurityNumber;

    public NationalCustomer( String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName);
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
