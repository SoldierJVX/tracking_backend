package com.example.backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "message_tracking")
public class MessageTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

}
