package task3;

public enum Job {
    SPEAKER("Спикер"),
    WRITER("Писатель"),
    ARTIST("Художник"),
    SOLDIER("Солдат"),
    JOBLESS("Безработный");
    String text;

    Job(String text){
        this.text = text;
    }
}
