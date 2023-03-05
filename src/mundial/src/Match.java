package mundial.src;

import java.util.Date;
import java.util.Random;

public class Match {

    private Date dateMatch; // Fecha del partido
    private Team localTeam; // Equipo local
    private Team visitingTeam; // Equipo visitante
    private Result resultMatch; // Resultado del partido

    // Constructor sin argumentos
    public Match() {
        this.setResultMatch(new Result()); // Se inicializa el resultado del partido con un nuevo objeto de tipo Result
    }

    // Constructor con argumentos
    public Match(Team localTeam, Team visitingTeam, Date dateMatch, Result resultMatch) {
        this.setDateMatch(dateMatch); // Se establece la fecha del partido
        this.setLocalTeam(localTeam); // Se establece el equipo local
        this.setVisitingTeam(visitingTeam); // Se establece el equipo visitante
        resultMatch = new Result(); // Se crea un nuevo objeto de tipo Result
        this.setResultMatch(resultMatch); // Se establece el resultado del partido con el nuevo objeto creado
    }

    // Constructor con argumentos, pero sin resultado del partido
    public Match(Team localTeam, Team visitingTeam, Date dateMatch) {
        this.setDateMatch(dateMatch); // Se establece la fecha del partido
        this.setLocalTeam(localTeam); // Se establece el equipo local
        this.setVisitingTeam(visitingTeam); // Se establece el equipo visitante
        this.setResultMatch(new Result()); // Se inicializa el resultado del partido con un nuevo objeto de tipo Result
    }

    // Método para registrar los goles marcados en el partido
    public void makeGoal() {
        Random random = new Random();
        int localGoals = random.nextInt(6); // Genera un número aleatorio entre 0 y 5 para los goles del equipo local
        int visitingGoals = random.nextInt(6); // Genera un número aleatorio entre 0 y 5 para los goles del equipo visitante
        getResultMatch().setVisitingGoals(visitingGoals); // Se establece el número de goles del equipo visitante
        getResultMatch().setLocalGoals(localGoals); // Se establece el número de goles del equipo local
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public Team getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(Team visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public Result getResultMatch() {
        return resultMatch;
    }

    public void setResultMatch(Result resultMatch) {
        this.resultMatch = resultMatch;
    }
}
