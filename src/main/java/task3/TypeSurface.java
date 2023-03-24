package task3;

public enum TypeSurface {
    DRY("Сухая"),
    SLIPPERY("Скользкая"),
    ROUGH("Шерховатая");

    String text;

    TypeSurface(String text){
        this.text = text;
    }
}
