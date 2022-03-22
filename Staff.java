import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Staff {
    public String employeeID;
    public String firstName;
    public String lastName;
    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public Staff (String ID, String fName, String lName) {
        employeeID = ID;
        firstName = fName;
        lastName = lName;
    }

    public void staffLogin() {

    }

    public void staffLogout() {

    }

    public void viewOutstandingOrders() {

    }

    public void viewDailySpecial() {

    }

    public int hoursToWork() {
        int hours = 0;
        return hours;
    }

    public int hoursWorked() {
        int hours = 0;
        return hours;
    }

    public String loginTime() {
        LocalDateTime login = LocalDateTime.now();
        return dtf.format(login);
    }

    public String logoutTime() {
        LocalDateTime logout = LocalDateTime.now();
        return dtf.format(logout);
    }

    public boolean currLoggedIn() {
        boolean isLoggedIn = false;
        return isLoggedIn;
    }

}
