package com.ignitec.pickpay.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_wallet_type")
public class WalletType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public WalletType() {
    }

    public WalletType(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public enum Enum {

        USER(1L, "user"),
        MERCHANT(2L, "merchant");

        Enum(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        private Long id;
        private String description;

        public WalletType get() {
            return new WalletType(id, description);
        }
    }
}
