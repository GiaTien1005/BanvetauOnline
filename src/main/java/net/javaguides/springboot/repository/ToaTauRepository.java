package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.ToaTau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToaTauRepository extends JpaRepository<ToaTau, String> {
}
