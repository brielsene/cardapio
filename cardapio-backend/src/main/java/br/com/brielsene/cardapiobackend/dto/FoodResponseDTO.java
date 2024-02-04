package br.com.brielsene.cardapiobackend.dto;

import br.com.brielsene.cardapiobackend.models.FoodModel;

public record FoodResponseDTO(
        Long id,
        String title,
        String image,
        Integer price
) {

    public FoodResponseDTO(FoodModel foodModel){
        this(foodModel.getId(), foodModel.getTitle(), foodModel.getImage(), foodModel.getPrice());
    }
}
