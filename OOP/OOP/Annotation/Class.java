package Annotation;

// Annotation as a additional information or as metadata
@Fancy (name = "Daniel", tags = {"age"})
public class Class {
    private String name;
    private int age;

    @Fancy (name = "get")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
