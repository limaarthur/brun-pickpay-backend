package com.ignitec.pickpay.repositories;

import com.ignitec.pickpay.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
