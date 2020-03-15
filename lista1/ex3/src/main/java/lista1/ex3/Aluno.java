package lista1.ex3;
public class Aluno{
    public String nome;
    public int idade;
    public int nota;

    public String toString() {
        return String.format("Aluno: %s. \nIdade: %d. \nNota: %d.", nome, idade, nota);
    }
}
//declaracao da classe