public class Marca implements Cloneable{
    private String nome;

    public Marca(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Marca setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Marca{" +
                "nome='" + nome +
                '}';
    }
}
