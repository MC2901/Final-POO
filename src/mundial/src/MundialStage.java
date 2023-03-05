package mundial.src;

import java.util.ArrayList;

public class MundialStage {

    // Nombre de la fase de la Copa Mundial
    private String stage;

    // Lista de partidos jugados
    private ArrayList<Match> matchList;

    // Lista de equipos clasificados para la siguiente fase
    protected ArrayList<Team> nextStageTeams;

    /**
     * Constructor que inicializa la lista de partidos y la lista de equipos para la siguiente fase.
     */
    public MundialStage() {
        this.matchList = new ArrayList<Match>();
        this.nextStageTeams = new ArrayList<Team>();
    }

    /**
     * Agrega un partido a la lista de partidos jugados.
     * @param match - el partido que se va a agregar
     * @return la lista actualizada de partidos jugados
     */
    public ArrayList<Match> addMatch(Match match) {
        this.matchList.add(match);
        return this.matchList;
    }

    /**
     * Genera los resultados de los partidos.
     * @param matches - los partidos que se van a jugar
     */
    public void generateMarker(ArrayList<Match> matches) {
        for (Match match : matches) {
            match.makeGoal();
        }
    }

    // getters y setters

    public ArrayList<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(ArrayList<Match> matchList) {
        this.matchList = matchList;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ArrayList<Team> getNextStageTeams() {
        return nextStageTeams;
    }

    public void setNextStageTeams(ArrayList<Team> nextStageTeams) {
        this.nextStageTeams = nextStageTeams;
    }

}
