package Interface;

import Annotation.Fancy;

@Fancy (name = "Laptop", tags = {"Gaming", "cpu", "price"})
public interface Laptop extends LaptopBrand, IsGaming { // multiple interface inheritance

    void run();

    int laptopCpu();

    // default keyword to make concrete method
    // and not obliged to re-declare/override this method in the child class  
    default boolean isCheap() {
        return false;
    }
}