package main.java.lista2.ex1;
import lista2.ex1.Aluno;
import java.math.BigDecimal;
import lista2.ex1.Pessoa;

public class Responsavel extends Pessoa{
    public Responsavel(String _nome, int _idade, String _cpf){
        super(_nome, _idade, _cpf);
    }
    public Aluno aluno;
    public BigDecimal renda;
    public Ocupacao ocupacao;
    public String toString(){
        return String.format("Responsavel: %s %d %s\n", nome, idade, cpf);
    }

}