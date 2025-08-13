package com.example.donation.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String category;
    private String description;
    private String location;
    private boolean claimed;

    @ManyToOne
    private User donor;

    @ManyToOne
    private User claimer;
}
