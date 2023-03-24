package task3;

public class Surface extends Object {
    TypeSurface typeSurface;

    public Surface(TypeSurface typeSurface, String name) {
        this.name = name;
        this.typeSurface = typeSurface;
    }

    public TypeSurface getTypeSurface() {
        return typeSurface;
    }

    public void setTypeSurface(TypeSurface typeSurface) {
        this.typeSurface = typeSurface;
    }
}
