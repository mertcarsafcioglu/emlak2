package com.acikarttirma.emlak.repository;

import com.acikarttirma.emlak.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction,Long> {
}
