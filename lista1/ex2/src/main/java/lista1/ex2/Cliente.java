package lista1.ex2;

import java.math.BigDecimal;

public class Cliente {
    //atributos
    public String nome;
    public BigDecimal renda;
    public int idade;
    public Ocupacao ocupacao;

    //metodos
    public String toString() {
        return String.format("Cliente: %s %d %s", nome, idade, ocupacao.descricao);
    }
}