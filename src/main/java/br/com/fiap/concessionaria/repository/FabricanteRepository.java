package br.com.fiap.concessionaria.repository;

import br.com.fiap.concessionaria.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    public List<Fabricante> findByNome(String nome);
}
