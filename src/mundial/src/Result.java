public class Result {
    private int localGoals;
    private int visitingGoals;

    public boolean localWin() {
        return localGoals > visitingGoals;
    }

    public boolean draw() {
        return localGoals == visitingGoals;
    }

    public int getLocalGoals() {
        return localGoals;
    }

    public int getVisitingGoals() {
        return visitingGoals;
    }
    public void setLocalGoals(int localGoals) {
        this.localGoals = localGoals;
    }

    public void setVisitingGoals(int visitingGoals) {
        this.visitingGoals = visitingGoals;
    }

}

