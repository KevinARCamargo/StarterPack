package escol4;

public class AlunoSup extends Aluno {
    //Atributos
    private double IRA;
    private int periodo;
    
    //Construtores

    public AlunoSup() {
    }

    public AlunoSup(int id, String nome, String dataNasc, String endereco, double IRA, int periodo) {
        super(id, nome, dataNasc, endereco);
        this.IRA = IRA;
        this.periodo = periodo;
    }

    public double getIRA() {
        return IRA;
    }

    public void setIRA(double IRA) {
        this.IRA = IRA;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
    
}
