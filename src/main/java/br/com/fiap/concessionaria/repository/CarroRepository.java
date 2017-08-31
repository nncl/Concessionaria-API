package br.com.fiap.concessionaria.repository;

import br.com.fiap.concessionaria.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
    public List<Carro> findByNome(String nome);
}
