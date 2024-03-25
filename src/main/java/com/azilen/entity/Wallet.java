package com.azilen.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private Player player;
    @Column(name = "available_tokens")
    private Integer availableTokens;
    @Column(name = "reserved_tokens")
    private Integer reservedTokens;
    @Column(name = "total_tokens")
    private Integer totalTokens;
}
