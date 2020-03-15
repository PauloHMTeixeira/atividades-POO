package lista2.ex1;

public abstract class Pessoa{
    public String cpf;
    public int idade;
    public String nome;

    public Pessoa(String _nome, int _idade, String _cpf){
        this.nome = _nome;
        this.idade = _idade;
        this.cpf = _cpf;
    }
    @Override
        public boolean equals(Object o){
            if(this.cpf == ((Pessoa)o).cpf){
                return true;
            }
            else{
                return false;
            }
        }
        
    @Override
        public int hashCode(){
            return 
        }
}