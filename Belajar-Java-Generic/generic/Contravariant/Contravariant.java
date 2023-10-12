package generic.Contravariant;

public class Contravariant<T> {
    private T data;

    public Contravariant(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
