package generic.Constraint;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<Integer>(1000); // not error
        NumberData<Double> doubleNumberData = new NumberData<Double>(1.00); // not error

        System.out.println(integerNumberData.getData());
        System.out.println(doubleNumberData.getData());

        // NumberData<String> stringNumberData = new NumberData<String>("Daniel"); --> error, because String is not derivative of 'Number'
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }    
    }

    // the second (and so on) bounded parameter must be interface. Simply because in Java we cannot make 2 parents class.
    // public static class StringNumberData<T extends Number & String> {

    // }
}
