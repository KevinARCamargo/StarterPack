package escol4;

public class AlunoMed extends Aluno{
    
    //Atributos
    private double media;
    private int ano;
    
    //Construtores

    public AlunoMed() {
    }

    public AlunoMed(double media, int ano, int id, String nome, String dataNasc, String endereco) {
        super(id, nome, dataNasc, endereco);
        this.media = media;
        this.ano = ano;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
}
