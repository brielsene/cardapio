package br.com.brielsene.cardapiobackend.dto;

public record FoodRequestDTO(
        String title,
        String image,
        Integer price
) {
}
