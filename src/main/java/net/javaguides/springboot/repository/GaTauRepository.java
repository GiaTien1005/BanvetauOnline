package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.GaTau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaTauRepository extends JpaRepository<GaTau, Long> {
}
