package InnerClass;

public class Company extends WorldBank {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public class Employee {
        private String name;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        // to access outer class
        public String getCompany() {
            return Company.this.getName(); // refer to the getName() of Company
            // you can also write in this: return Company.this.name(); ---> since inner class can get the access to the private member of outer class
            // return this.getName(); ---> refer to the getName() of Employee. So nope.
        }

        // to change/manipulate the value of getName() from super class of the outer class
        public void setWorldBank(String name) {
            Company.super.setName(name);
        }
    
        // to access getName() from super class of the outer class
        public String getWorldBank() {
            return Company.super.getName();
        }


    }
}

