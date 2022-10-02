package me.dio.MentoriaIFoodDevWeek.repository;

import me.dio.MentoriaIFoodDevWeek.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
