package AbstractMethod;

/*
 * Abstract method = when there is no block in the method and you cannot declare the body of the method that 
 * belong in the parent class. You can only define the method only.
 * And you have to override the method in the child class 
 * Means that every child class that inherit from the parent class must override the method that has abstract keyword
 */


public abstract class Animal {
    public String name;
    public abstract void run();
}
