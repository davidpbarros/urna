
import java.util.ArrayList;
import java.util.List;

public class CandidatoRepo {

    private static List<Candidato> candidatos = new ArrayList<Candidato>();

    public static void addCandidato(Candidato candidato) {
        CandidatoRepo.candidatos.add(candidato);
    }

    public static Candidato getCandidato(int numCandidato) {
        Candidato candidatoEncontrado = null;
        for (Candidato candidato : candidatos) {
            if (numCandidato == candidato.getNumCandidato()) {
                candidatoEncontrado = candidato;
                break;
            }
        }
        return candidatoEncontrado;
    }
}
