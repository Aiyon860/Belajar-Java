package Encapsulation;

public class Category {
    private String id;

    // method getter for id
    public String getId() {
        return id;
    }

    // method setter for id
    public void setId(String id) {
        if (id != null) { // ----> Validation on Setter
            this.id = id;
        }   
    }

    private boolean expensive;

    // method getter for expensive
    public boolean isExpensive() {
        return this.expensive;
    }

    // method setter for expensive
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    


}
