
public class Candidato {

    private String nome;
    private int partido;
    private int numCandidato;
    private int pontuação;

    public Candidato(String candidato, int partido, int numCandidato) {
        this.nome = candidato;
        this.partido = partido;
        this.numCandidato = numCandidato;
        this.pontuação = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String candidato) {
        this.nome = candidato;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public int getNumCandidato() {
        return numCandidato;
    }

    public void setNumCandidato(int numCandidato) {
        this.numCandidato = numCandidato;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void addVoto() {
        this.pontuação += 1;
    }
}
