package List;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class ListApp {
    public static void main(String[] args) {
        listArray();
        // same goes apply to LinkedList
    }

    public static void listArray() {
        System.out.println("ARRAY LIST");
        List<String> arrayList = new ArrayList<>(100);
        // add
        arrayList.add("Daniel");
        arrayList.add("Adi");
        arrayList.add("Pratama");

        // get
        while (arrayList.containsAll(arrayList)) {
            if (arrayList.contains("")) {
                System.out.println(arrayList.get(0));
                break;
            } else if (arrayList.contains("")) {
                System.out.println(arrayList.get(1));
                break;
            } else if (arrayList.contains("Pratama")) {
                System.out.println(arrayList.get(2));
                break;
            } else {
                System.out.println("Data tidak ada");
                break;
            }
        }

        // set
        arrayList.set(0, "Tirza");
        arrayList.set(1, "Nadya");
        arrayList.set(2, "Wibowo");

        StringJoiner joiner = new StringJoiner("-", "[", "]");

        for (var name : arrayList) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());

        // remove
        arrayList.removeAll(Arrays.asList("Tirza", "Nadya", "Wibowo"));

        if (arrayList.containsAll(Arrays.asList("Tirza", "Nadya", "Wibowo"))) {
            System.out.println("Penghapusan Gagal");
        } else {
            System.out.println("Penghapusan Sukses");
        }
    }

}
