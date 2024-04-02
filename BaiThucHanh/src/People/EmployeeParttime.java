package People;

public class EmployeeParttime extends Employee {
    public int hour;
    public EmployeeParttime() {
        chucVu = "Parttime";
        hour = 0;
    }
    public void EnterData() {
        super.EnterData();
        System.out.print("So gio lam viec: ");
        hour = sc.nextInt();
    }
    public void luong() {
        luong *= hour;
    }
    public void Display() {
        super.Display();
    }
}
