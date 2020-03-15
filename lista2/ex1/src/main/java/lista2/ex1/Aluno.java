package lista2.ex1;

public class Aluno extends Pessoa{
    public Aluno(String _nome, int _idade, String _cpf){
        super(_nome, _idade, _cpf);
        this.nome = _nome;
        this.idade = _idade;
        this.cpf = _cpf;
    }
    public String curso;
    public boolean matriculaTrancada;
    public String toString(){
        return String.format("Aluno: %s %d %s %s\n", nome, idade, cpf, curso);
    }
}
