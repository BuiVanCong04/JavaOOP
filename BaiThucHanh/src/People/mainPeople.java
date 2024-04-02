package People;

public class mainPeople {
    public static void main(String[] args) {
        EmployeeFulltime ef = new EmployeeFulltime();
        ef.xuatvitri();
        ef.EnterData();
        ef.luong();
        ef.Display();
        EmployeeParttime ep = new EmployeeParttime();
        ep.xuatvitri();
        ep.EnterData();
        ep.luong();
        ep.Display();
    }
    
}
