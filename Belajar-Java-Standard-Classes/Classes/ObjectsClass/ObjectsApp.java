package ObjectsClass;

import java.util.Objects;

public class ObjectsApp {
    // // Contoh dari Pak Eko (part 1)
    public static class Data {
        private String name;

        public Data(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Data other = (Data) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Data [name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        // // Contoh dari Pak Eko (part 2)
        execute(new Data("Daniel")); 
    }

    public static void execute(Data data) {
    //    // when not using "Objects", we have to check/validate manually
    //    if (data != null) {
    //     System.out.println(data.toString());
    //     System.out.println(data.hashCode());
    //    }

       // when using "Objects"
       System.out.println(Objects.toString(data));
       System.out.println(Objects.hashCode(data));
    }
}