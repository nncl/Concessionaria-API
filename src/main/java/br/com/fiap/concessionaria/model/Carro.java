package br.com.fiap.concessionaria.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "carro")
public class Carro {

    @Id
    // TODO Implement
    private int id;
    private String modelo;
    private int ano;
    private Fabricante fabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}