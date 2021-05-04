package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.ToaTau;
import net.javaguides.springboot.model.VeTau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeTauRepository extends JpaRepository<VeTau, String> {
}
