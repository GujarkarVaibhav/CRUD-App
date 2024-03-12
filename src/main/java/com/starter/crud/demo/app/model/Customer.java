package com.starter.crud.demo.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Customer {
    @EmbeddedId
    private FullName fullName ;
    private String phone ;
    private String email ;
}
