package main.java.lista2.ex1;

import lista2.ex1.Pessoa;
import lista2.ex1.Aluno;
import java.math.BigDecimal;

public class Ex1{
    public static void main(String[] args){
        Aluno p1 = new Aluno("Paulo", 19, "07810176455");
        p1.curso = "CC";
        p1.matriculaTrancada = false;
        System.out.println(p1);

        Responsavel p2 = new Responsavel("Roberto", 45, "2222222222");
        p2.aluno = p1;
        p2.renda = new BigDecimal(10000d);
        p2.ocupacao = new Ocupacao();
        p2.ocupacao.descricao = "Adm";
        System.out.println(p2);

        p1.equals(p2);
        System.out.println(p1.equals(p2));
        p1.hashCode();
        System.out.println(p1.hashCode());
    }
}