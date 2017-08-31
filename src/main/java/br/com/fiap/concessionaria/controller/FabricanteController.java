package br.com.fiap.concessionaria.controller;

import br.com.fiap.concessionaria.model.Fabricante;
import br.com.fiap.concessionaria.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    @GetMapping
    public List<Fabricante> doGetAll(){
        return fabricanteRepository.findAll();
    }

    @GetMapping("/{nome}")
    public List<Fabricante> doGetByName(@PathVariable(value = "nome") String nome){
        return fabricanteRepository.findByNome(nome);
    }

    @PostMapping
    public void doSave(@RequestBody Fabricante fabricante){
        fabricanteRepository.save(fabricante);
    }
}
