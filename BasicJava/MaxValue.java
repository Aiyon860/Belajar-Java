class MaxValue {
    public static void main(String[] args) {
        int B[] = {30, 10, 20};
        var max = B[0];

        for (int i = 1; i < 3; i++) {
            if (B[i] > max) {
                max = B[i];
            }
        }
        System.out.println(max);
    }
}
