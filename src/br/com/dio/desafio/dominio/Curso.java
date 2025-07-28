package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    //atributo
    private int cargaHoraria;

    //construtor
    public Curso() {
    }

    //metodo
    @Override
    public double calcularXp() {
        return xp_padrao * cargaHoraria;
    }

    //get set
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    //toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
