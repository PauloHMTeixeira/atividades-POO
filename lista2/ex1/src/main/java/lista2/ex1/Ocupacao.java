package main.java.lista2.ex1;

public class Ocupacao{
    public String descricao;
    public int id;
    @Override
        public boolean equals(Object o){
            if(this.id == ((Pessoa)o).id){
                return true;
            }
            else{
                return false;
            }
        }
}
