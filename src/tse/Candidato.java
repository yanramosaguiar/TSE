package tse;

public class Candidato {
    
    private int numero;
    private String nome;
    private int votos;

    //Construtor customizado
    public Candidato(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        this.votos = 0;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVotos() {
        return votos;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void incrementarVoto(){
        votos = votos + 1;
    }
}