package com.unilever.developer.controller;

import com.unilever.developer.domain.Cards;
import com.unilever.developer.domain.User;
import com.unilever.developer.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;
    @GetMapping("cards")
    public List<Cards> getCArds(){return cardsRepository.findAll();
    }
    @GetMapping("card/{id}")
    public Cards getCard(@PathVariable Long id) {

        Optional<Cards> optUser = cardsRepository.findById(id); // returns java8 optional
        if (optUser.isPresent()) {
            return optUser.get();
        } else {
            // handle not found, return null or throw
            return null;
        }


    }
    @DeleteMapping("/card/{id}")
    public boolean deleteCard(@PathVariable Long id) { cardsRepository.deleteById(id);
        return true;
    }

    @PutMapping("/card")
    public Cards updateCARD(@RequestBody Cards cards) {
        return cardsRepository.save(cards);
    }

    @PostMapping("/card")
    public Cards createCArd(@RequestBody Cards cards) {
        return cardsRepository.save(cards);
    }



}