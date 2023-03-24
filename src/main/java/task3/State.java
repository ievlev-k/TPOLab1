package task3;

public enum State {
    DISCOVERED ("обнаружил"),
    UNDERSTOOD ("понял"),
    LOST("потерял");

    String text;

    State (String text){
        this.text = text;
    }
}
