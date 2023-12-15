package com.project.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@Table(name = "Customer") -- not needed as class and table name are same
public class Account extends BaseEntity {

    @Column(name = "cutomer_id")
    private Long customerId;

    @Id
    private Long accountNumber;

    private String accountType;
    private String branchAddress;
}
