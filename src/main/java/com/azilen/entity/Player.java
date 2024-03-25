package com.azilen.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "partner_user_id")
    private String partnerUserId;
    @OneToOne(mappedBy = "player")
    private Wallet wallet;
    @OneToOne(mappedBy = "player")
    private PlayerInformation playerInformation;
}
