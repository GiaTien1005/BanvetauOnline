package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.ChoNgoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoNgoiRepository extends JpaRepository<ChoNgoi, String> {
}
