package br.com.brielsene.cardapiobackend.controllers;

import br.com.brielsene.cardapiobackend.dto.FoodRequestDTO;
import br.com.brielsene.cardapiobackend.dto.FoodResponseDTO;
import br.com.brielsene.cardapiobackend.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<FoodResponseDTO>>getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(foodService.getAll());
    }

    @PostMapping
    public ResponseEntity createNewFood(@RequestBody FoodRequestDTO data){
        foodService.saveFood(data);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
