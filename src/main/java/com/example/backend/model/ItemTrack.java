package com.example.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "tracking")
public class ItemTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracking_id", nullable = false)
    private String trackingID;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private String localization;

    @OneToOne
    @JoinColumn(name = "id_message", referencedColumnName = "id")
    private MessageTrack message;

}
