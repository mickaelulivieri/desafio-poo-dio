package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //atributo
    private LocalDate data;

    //metodo
    @Override
    public double calcularXp() {
        return xp_padrao + 20;
    }

    //construtor
    public Mentoria() {
    }

    //get set
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                ", data=" + getData() +
                '}';
    }
}
