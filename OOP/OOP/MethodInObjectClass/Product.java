package MethodInObjectClass;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // to override the toString method
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    } 
    
    // to override equals method
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // to override hashCode method
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    
    // to override the equals method (in manual way)
    // public boolean equals(Object o) {
    //     if (o == this) {
    //         return true;
    //     }
        
    //     if (!(o instanceof Product)) {
    //         return false;
    //     }

    //     Product product = (Product) o;

    //     if (this.price != product.price) {
    //         return false;
    //     }

    //     if (this.name != null) {
    //         return this.name.equals(product.name);
    //     }
    //         else {
    //             return product.name == null;
    //         }
    // }
}
