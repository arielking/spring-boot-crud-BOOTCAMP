package com.unilever.developer.controller;

import com.unilever.developer.domain.Area;
import com.unilever.developer.domain.Product;
import com.unilever.developer.repository.AreaRepository;
import com.unilever.developer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AreaController {

    @Autowired
    private AreaRepository areaRepository;
    @GetMapping("areas")
    public List<Area> areas(){
        return areaRepository.findAll();
    }

    @GetMapping("area/{id}")
    public  Area getArea(@PathVariable long id){

        Optional<Area> optMachine=areaRepository.findById(id);
        if(optMachine.isPresent()){
            return optMachine.get();
        }
        else {
            return null;

        }
    }
    @PostMapping("/area")
    public Area createArea(@RequestBody Area area) {
        return areaRepository.save(area);
    }

    @PutMapping("/area")
    public  Area updateArea(@RequestBody Area area){return areaRepository.save(area);}

    @DeleteMapping("/area/{id}")
    public boolean deleteArea(@PathVariable Long id) { areaRepository.deleteById(id);
        return true;
    }




}

