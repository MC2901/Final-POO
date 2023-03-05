import java.util.ArrayList;
import java.util.Date;

public class Keys  extends MundialStage {

    /**
     * El método generateMatches recibe una lista de equipos y genera partidos entre ellos, agregándolos a la lista de partidos de la fase actual.
     *
     * @param teams Lista de equipos que participarán en los partidos de la fase actual.
     */
    public void generateMatches(ArrayList<Team> teams){
        for (int i = 0; i <teams.size()-1 ; i+=2) {
            getMatchList().add(new Match(teams.get(i),teams.get(i+1),new Date()));
        }
    }

    /**
     * El método getNextStageTeams se encarga de obtener los equipos que avanzarán a la siguiente fase del mundial, según los resultados de los partidos de la fase actual.
     *
     * @return Una lista de equipos que avanzan a la siguiente fase.
     */
    @Override
    public ArrayList<Team> getNextStageTeams() {
        for (int i = 0; i <getMatchList().size() ; i++) {
            if (getMatchList().get(i).getResultMatch().localWin()){
                this.nextStageTeams.add(getMatchList().get(i).getLocalTeam());
            }else{
                this.nextStageTeams.add(getMatchList().get(i).getVisitingTeam());
            }
        }
        return nextStageTeams;
    }
}
