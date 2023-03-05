package mundial.src;

import java.util.ArrayList;

public class Team {
    private String teamName; // Nombre del equipo

    private ArrayList<Match> matchesPlayed; // ArrayList de partidos jugados

    private int points; // La cantidad de puntos que el equipo tiene

    public int addedPoints; // La cantidad de puntos que se suman a los puntos existentes
    // Constructor vacío
    Team() {
    }

    /**
     * Constructor que crea un equipo con un nombre específico.
     * @param teamName - el nombre del equipo
     */
    public Team(String teamName) {
        this.setTeamName(teamName);
    }

    /**
     * Método que agrega 3 puntos al equipo y actualiza la cantidad total de puntos.
     */
    public void addPoints() {
        this.setPoints(3);
        addedPoints = points + addedPoints;
        this.setPoints(addedPoints);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}