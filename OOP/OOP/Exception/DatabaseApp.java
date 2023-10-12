package Exception;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Daniel", null);

        /* We can use try-catch in Error Exception, but it is not recommended.
         * try {
         *    connectDatabase("Daniel", null);
         *    System.out.println("Success");
         * } catch (DatabaseError error){
         *    System.out.println("Error " + error.getMessage());
         * } 
         */
    }

    public static void connectDatabase (String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Can't Connect to Database");
        }
    }
}
