package com.starter.crud.demo.app.model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class FullName implements Serializable {

    private String firstName ;
    private String lastName ;

}
