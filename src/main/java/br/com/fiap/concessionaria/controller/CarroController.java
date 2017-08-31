package br.com.fiap.concessionaria.controller;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public List<Carro> doGetAll(){
        return carroRepository.findAll();
    }

    @GetMapping("/{nome}")
    public List<Carro> doGetByName(@PathVariable(value = "nome") String nome){
        return carroRepository.findByNome(nome);
    }

    @PostMapping
    public void doSave(@RequestBody Carro carro){
        carroRepository.save(carro);
    }

}
