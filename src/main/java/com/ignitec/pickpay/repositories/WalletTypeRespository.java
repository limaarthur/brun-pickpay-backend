package com.ignitec.pickpay.repositories;

import com.ignitec.pickpay.entities.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRespository extends JpaRepository<WalletType, Long> {
}
