package me.dio.MentoriaIFoodDevWeek.repository;

import me.dio.MentoriaIFoodDevWeek.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SacolaRepository extends JpaRepository<Restaurante, Long> {
}
