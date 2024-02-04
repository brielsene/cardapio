package br.com.brielsene.cardapiobackend.services;

import br.com.brielsene.cardapiobackend.dto.FoodRequestDTO;
import br.com.brielsene.cardapiobackend.dto.FoodResponseDTO;
import br.com.brielsene.cardapiobackend.models.FoodModel;
import br.com.brielsene.cardapiobackend.repositorys.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Transactional
    public void saveFood(FoodRequestDTO data){
        FoodModel foodModel = new FoodModel();
        BeanUtils.copyProperties(foodModel, data);
        foodRepository.save(foodModel);

    }

    public List<FoodResponseDTO> getAll(){
      return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}
