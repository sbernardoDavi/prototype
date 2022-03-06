public class Blusa implements Cloneable{
    private int id;
    private String tamanho;
    private Marca marca;

    public Blusa(int id, String tamanho, Marca marca){
        this.id = id;
        this.tamanho = tamanho;
        this.marca = marca;
    }


    public int getId() {
        return id;
    }

    public Blusa setId(int id) {
        this.id = id;
        return this;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Blusa setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public Marca getMarca() {
        return marca;
    }

    public Blusa setMarca(Marca marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public Blusa clone() throws CloneNotSupportedException{
        Blusa blusaClone = (Blusa) super.clone();
        blusaClone.marca = (Marca) blusaClone.marca.clone();
        return blusaClone;
    }

    @Override
    public  String toString() {
        return "Blusa{"+
                "id="+id+
                ", tamanho="+tamanho+
                ", marca="+marca+ '\''+
                '}';

    }
}
