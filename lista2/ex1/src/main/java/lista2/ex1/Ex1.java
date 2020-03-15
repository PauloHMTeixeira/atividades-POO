package main.java.lista2.ex1;

import lista2.ex1.Pessoa;
import lista2.ex1.Aluno;
import java.math.BigDecimal;

public class Ex1{
    public static void main(String[] args){
        try{
        Aluno p1 = new Aluno("Paulo", 19, "111");
        p1.curso = "CC";
        p1.matriculaTrancada = false;
        System.out.println(p1);

        Aluno p4 = new Aluno("Serro", 21, "333");
        p4.curso = "CC";
        p4.matriculaTrancada = false;
        System.out.println(p4);

        Responsavel p2 = new Responsavel("Roberto", 45, "222");
        p2.aluno = p1;
        p2.renda = new BigDecimal(10000d);
        p2.ocupacao = new Ocupacao();
        p2.ocupacao.descricao = "Adm";
        p2.ocupacao.id = 123;
        System.out.println(p2);

        Responsavel p3 = new Responsavel("Sergio", 53, "444");
        p3.aluno = p4;
        p3.renda = new BigDecimal(10000d);
        p3.ocupacao = new Ocupacao();
        p3.ocupacao.descricao = "Juiz";
        p3.ocupacao.id = 321;
        System.out.println(p3);

        p1.equals(p4);
        System.out.println(p1.equals(p4));
        p2.equals(p3);
        System.out.println(p2.equals(p3));
        p1.hashCode();
        System.out.println(p1.hashCode());
        }
        catch(Exception e ) {}
    }
}
