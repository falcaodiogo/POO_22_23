package aula05;

import aula06.DateYMD;

public class Property {

    private int id;
    private int numQuartos;
    private String localidade;
    private int preco;
    private boolean disponibilidade;
    private DateYMD dataInicio;
    private DateYMD dataFim;

    public Property(int id, int numQuartos, String localidade, int preco, boolean disponibilidade, DateYMD dataInicio, DateYMD dataFim) {
        this.id = id;
        this.numQuartos = numQuartos;
        this.localidade = localidade;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Property() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public DateYMD getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(DateYMD dataInicio) {
        this.dataInicio = dataInicio;
    }

    public DateYMD getDataFim() {
        return dataFim;
    }

    public void setDataFim(DateYMD dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", numQuartos=" + numQuartos +
                ", localidade='" + localidade + '\'' +
                ", preco=" + preco +
                ", disponibilidade=" + disponibilidade +
                ", dataInicio=" + dataInicio;
    }

}
