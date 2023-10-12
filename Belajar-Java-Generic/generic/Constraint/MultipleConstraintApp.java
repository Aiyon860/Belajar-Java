package generic.Constraint;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<Manager>(new Manager()); --> Error because it didn't implements 'CanSayHello'
        Data<VicePresident> vicePresidentData = new Data<VicePresident>(new VicePresident("Tirza"));

        System.out.println(vicePresidentData.getData());  

        VicePresident vp = new VicePresident();
        vp.sayHello("Tirza");
    }

    public interface CanSayHello {
        void sayHello(String name);
    } 

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

        @Override
        public String toString() {
            return "Manager []";
        }
        
    }

    public static class VicePresident extends Employee implements CanSayHello {

        public VicePresident(String name) {
            System.out.println("Test " + name);
        }

        public VicePresident() {

        }

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);            
        }
        
    }

    // Employee is class and CanSayHelo is interface
    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            this.data.sayHello("Daniel"); // now can access the CanSayHello's method
        }
    }
}
