package br.com.brielsene.cardapiobackend.repositorys;

import br.com.brielsene.cardapiobackend.models.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
}
