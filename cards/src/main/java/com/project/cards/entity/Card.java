package com.project.cards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card extends BaseEntity {


    @Id
    private Long cardNumber;

    private String cardType;

}
