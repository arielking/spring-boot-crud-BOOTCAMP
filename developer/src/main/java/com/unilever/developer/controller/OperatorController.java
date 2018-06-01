package com.unilever.developer.controller;
import com.unilever.developer.domain.Operator;
import com.unilever.developer.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OperatorController {

    @Autowired
    private OperatorRepository operatorRepository;
    @GetMapping("operadores")
    public List<Operator> operators(){
        return operatorRepository.findAll();
    }

    @GetMapping("operador/{id}")
    public  Operator getOperador(@PathVariable long id){

        Optional<Operator> optMachine=operatorRepository.findById(id);
        if(optMachine.isPresent()){
            return optMachine.get();
        }
        else {
            return null;

        }
    }
    @PostMapping("/operador")
    public Operator createOperador(@RequestBody Operator operator) {
        return operatorRepository.save(operator);
    }

    @PutMapping("/operador")
    public  Operator updateOperator(@RequestBody Operator operator){return operatorRepository.save(operator);}

    @DeleteMapping("/operador/{id}")
    public boolean deleteOperador(@PathVariable Long id) { operatorRepository.deleteById(id);
        return true;
    }

}
