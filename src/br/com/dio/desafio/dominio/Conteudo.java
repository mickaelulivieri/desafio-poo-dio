package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //atributos
    protected static final double xp_padrao = 10;

    private String titulo;

    private String descricao;

    //metodo
    public abstract double calcularXp();

    //get set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //toString
    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}