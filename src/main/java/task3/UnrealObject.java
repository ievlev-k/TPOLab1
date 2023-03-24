package task3;

public class UnrealObject extends Object {
    Characteristic characteristic;

    public UnrealObject(Characteristic characteristic, String name) {
        this.name = name;
        this.characteristic = characteristic;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }
}
