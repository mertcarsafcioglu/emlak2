package com.acikarttirma.emlak.repository;

import com.taputeklif.emlak.domain.Hood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoodRepository extends JpaRepository<Hood,Long> {
}
