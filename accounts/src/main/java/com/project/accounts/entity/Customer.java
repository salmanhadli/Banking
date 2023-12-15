package com.project.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@Table(name = "Customer") -- not needed as class and table name are same
public class Customer extends BaseEntity {

    @Id
    // follow db default way of generating ids
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "cutomer_id")
    private Long customerId;

    private String name;

    private String email;

    private String mobileNumber;
}
