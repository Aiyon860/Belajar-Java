package RecordClass;

// record class is to store (save) data by using contructor (obligatory)
public record LoginRequest(String username, String password) { // ---> the username and password are fields
    // compact constructor ---> without () to make change on the constructor above
    // this contructor will be exist every different line (idk how to phrase this)
    public LoginRequest {
        System.out.println("Making the LoginRequest");
    }

    // constructor overloading in record class
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    /* 
    can't make method that try to manipulate the constructor (setter method)
    because the default of record class is FINAL
     
        public void setUsername(String username) {
            this.username = username;
        }
    */
}
