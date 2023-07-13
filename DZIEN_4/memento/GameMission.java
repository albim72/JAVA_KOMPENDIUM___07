public class GameMission {
    private int percentageCompleted = 0;
    int previousPercentageCompleted = 0;

    public GameMission() {
    }

    public int getPercentageCompleted() {
        return percentageCompleted;
    }

    public void setPercentageCompleted(int percentageCompleted) {
        this.previousPercentageCompleted = this.percentageCompleted;
        this.percentageCompleted = percentageCompleted;
    }
}
