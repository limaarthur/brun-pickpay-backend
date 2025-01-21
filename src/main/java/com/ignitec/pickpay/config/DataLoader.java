package com.ignitec.pickpay.config;

import com.ignitec.pickpay.entities.WalletType;
import com.ignitec.pickpay.repositories.WalletTypeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    @Autowired
    private WalletTypeRespository walletTypeRespository;

    public DataLoader(WalletTypeRespository walletTypeRespository) {
        this.walletTypeRespository = walletTypeRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(WalletType.Enum.values()).forEach(walletType -> walletTypeRespository.save(walletType.get()));
    }
}
