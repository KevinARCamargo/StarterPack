package escol4;

//A classe abstrata não permite instanciações de objetos da mesma
public abstract class Aluno{
    //Atributos
    private int id;
    private String nome;
    private String dataNasc;
    private String endereco;
    
    //Métodos
    //Construtor Vazio
    public Aluno() {
    }
    
    //Construtor Definido
    public Aluno(int id, String nome, String dataNasc, String endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
