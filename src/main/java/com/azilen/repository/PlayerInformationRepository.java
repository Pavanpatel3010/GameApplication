package com.azilen.repository;

import com.azilen.entity.PlayerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerInformationRepository extends JpaRepository<PlayerInformation, Long> {
}
