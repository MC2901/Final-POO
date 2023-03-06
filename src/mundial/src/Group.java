package mundial.src;

import java.util.ArrayList;
import java.util.Date;

public class Group extends MundialStage {
    /**
     * Genera los partidos del grupo.
     * @param teams - los equipos que forman parte del grupo
     */
    public void generateMatch(ArrayList<Team> teams) {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                getMatchList().add(new Match(teams.get(i), teams.get(j), new Date()));
            }
        }
    }

    /**
     * Obtiene los equipos que pasan a la siguiente fase.
     * @return la lista de equipos que pasan a la siguiente fase
     */
    @Override
    public ArrayList<Team> getNextStageTeams() {
        for (Match match : getMatchList()) {
            if (match.getResultMatch().localWin()) {
                match.getLocalTeam().addPoints();
            } else {
                match.getVisitingTeam().addPoints();
            }
        }

        // Ordena los equipos por puntaje de forma descendente
        getMatchList().sort((m1, m2) -> m2.getLocalTeam().getPoints() - m1.getLocalTeam().getPoints());

        // Obtiene los dos primeros equipos de la lista ordenada
        for (int i = 0; i < 2; i++) {
            this.nextStageTeams.add(getMatchList().get(i).getLocalTeam());
        }
        return nextStageTeams;
    }

    public Group(){
        this.setStage("Fase de Grupos");
    }

    /**
     * Genera el marcador para cada partido del grupo.
     * @param matches - los partidos del grupo
     */
    @Override
    public void generateMarker(ArrayList<Match> matches) {
        // Llama a la función generateMarker de la superclase MundialStage
        super.generateMarker(matches);
    }

}
