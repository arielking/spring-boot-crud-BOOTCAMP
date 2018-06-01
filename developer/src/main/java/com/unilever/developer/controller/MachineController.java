package com.unilever.developer.controller;
import com.unilever.developer.domain.Machine;
import com.unilever.developer.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MachineController {

    @Autowired
    private MachineRepository machineRepository;
    @GetMapping("machines")
    public List<Machine> getMachines(){
        return machineRepository.findAll();
    }

    @GetMapping("machine/{id}")
    public  Machine getMachine(@PathVariable long id){

        Optional<Machine> optMachine=machineRepository.findById(id);
        if(optMachine.isPresent()){
            return optMachine.get();
        }
        else {
            return null;

        }
    }
    @PostMapping("/machine")
    public Machine createMachine(@RequestBody Machine machine) {
        return machineRepository.save(machine);
    }

    @PutMapping("/machine")
    public  Machine updateMachine(@RequestBody Machine machine){return machineRepository.save(machine);}

    @DeleteMapping("/machine/{id}")
    public boolean deleteMachine(@PathVariable Long id) { machineRepository.deleteById(id);
        return true;
    }




}
