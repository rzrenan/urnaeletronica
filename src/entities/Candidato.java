package entities;

public class Candidato {

    private int codigo;
    private String nome;
    private int votos;

   public Candidato() {
   }

    public Candidato(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Candidato(String nome, int codigo, int votos) {
        this.nome = nome;
        this.codigo = codigo;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void adicionaVotos() {
       votos++;
    }
}
