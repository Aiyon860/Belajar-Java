package generic.Covariant;

public class Covariant<T> {
    private T data;

    public Covariant(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
