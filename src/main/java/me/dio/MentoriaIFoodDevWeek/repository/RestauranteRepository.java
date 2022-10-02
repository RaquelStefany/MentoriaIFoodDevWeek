package me.dio.MentoriaIFoodDevWeek.repository;

import me.dio.MentoriaIFoodDevWeek.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RestauranteRepository extends JpaRepository<Sacola, Long> {
}
