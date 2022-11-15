package org.sid.billingservice.entities;

import org.sid.billingservice.model.Product;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Productitem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity;
    private double price;
    private long productId;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
}
