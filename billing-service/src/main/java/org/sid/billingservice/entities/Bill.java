package org.sid.billingservice.entities;

import org.sid.billingservice.model.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<Productitem> productitems;
    private Long customerId;
    @Transient
    private Customer customer;
}
