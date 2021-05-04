package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Tau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauRepository extends JpaRepository<Tau, String> {
}
