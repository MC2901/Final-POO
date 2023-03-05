package garaje.src;

public class Client {
    private String clientName;
    private String clientPlate;
    private String expectedResult;
    private int points = 0; // Añadimos un campo para almacenar los puntos del cliente

    public Client(String clientName, String clientPlate, String expectedResult) {
        this.clientName = clientName;
        this.clientPlate = clientPlate;
        this.expectedResult = expectedResult;
    }

    public void addPoints() {
       points++;
    }

    public int getPoints() {
        return points;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPlate() {
        return clientPlate;
    }

    public void setClientPlate(String clientPlate) {
        this.clientPlate = clientPlate;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

}
