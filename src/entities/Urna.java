package entities;

public class Urna {

    private Candidato candidato1;
    private Candidato candidato2;
    private Candidato candidato3;

    public Urna() {
    }

   public Urna(Candidato candidato1, Candidato candidato2, Candidato candidato3) {
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
        this.candidato3 = candidato3;
   }

    public Candidato getCandidato1() {
        return candidato1;
    }

    public void setCandidato1(Candidato candidato1) {
        this.candidato1 = candidato1;
    }

    public Candidato getCandidato2() {
        return candidato2;
    }

    public void setCandidato2(Candidato candidato2) {
        this.candidato2 = candidato2;
    }

    public Candidato getCandidato3() {
        return candidato3;
    }

    public void setCandidato3(Candidato candidato3) {
        this.candidato3 = candidato3;
    }

    public void votar(int codigo){
        if (codigo == candidato1.getCodigo()) {
            candidato1.adicionaVotos();
        } else if (codigo == candidato2.getCodigo()) {
            candidato2.adicionaVotos();
        } else if (codigo == candidato3.getCodigo()) {
            candidato3.adicionaVotos();
        }
    }

    public String exibirMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n---------------------------");
        sb.append("\n------URNA ELETRÔNICA------");
        sb.append("\n---------------------------");
        sb.append("\nInsira o código da candidato do seu voto: ");
        sb.append("\nDigite 0 para encerrar o seu voto ");

        return sb.toString();
    }

    public String exibirResultado() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n---------------------");
        sb.append("\n------RESULTADO------");
        sb.append("\n---------------------");
        sb.append("\nCandidato 1: " + candidato1.getCodigo() + " - " + candidato1.getNome() + " - Votos: " + candidato1.getVotos());
        sb.append("\nCandidato 2: " + candidato2.getCodigo() + " - " + candidato2.getNome() + " - Votos: " + candidato2.getVotos());
        sb.append("\nCandidato 3: " + candidato3.getCodigo() + " - " + candidato3.getNome() + " - Votos: " + candidato3.getVotos());

        if (candidato1.getVotos() > candidato2.getVotos() && candidato1.getVotos() > candidato3.getVotos()) {
            sb.append(("\nVencedor: " + candidato1.getNome()));
        } else if (candidato2.getVotos() > candidato1.getVotos() && candidato2.getVotos() > candidato3.getVotos()) {
            sb.append("\nVencedor: " + candidato2.getNome());
        } else if (candidato3.getVotos() > candidato1.getVotos() && candidato3.getVotos() > candidato2.getVotos()) {
            sb.append("\nVencedor: " + candidato3.getNome());
        } else {
            sb.append("\nHouve um empate.");
        }

        return sb.toString();

    }
}
