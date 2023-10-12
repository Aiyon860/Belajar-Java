package generic.Invariant;

public class Invariant<T> {
    private T data;

    public Invariant(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}