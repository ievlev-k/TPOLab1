package task3;

public class RealObject extends Object{

    Characteristic characteristic;
    Integer number;

    public RealObject(String name, Characteristic characteristic, int number) {
        this.name = name;
        this.characteristic = characteristic;
        this.number = number;
    }


    public RealObject(String name, Characteristic characteristic) {
        this.name = name;
        this.characteristic = characteristic;
        this.number = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }




    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public Integer move (Surface surface, AliveObject aliveObject){
        if (surface.typeSurface == TypeSurface.SLIPPERY){
            System.out.println(aliveObject.name + " проскользил " + getCharacteristic().text + " " + getName());
            this.number--;
            return number;
        }
        if (surface.typeSurface == TypeSurface.DRY){
            System.out.println(aliveObject.name + " поднялся " + getCharacteristic().text + " " + getName());
            this.number++;
            return number;
        }
        if (surface.typeSurface ==TypeSurface.ROUGH){
            System.out.println(aliveObject.name + " остался рядом с " + getCharacteristic().text + " " + getName());
            return number;
        }
        return null;
    }


}
