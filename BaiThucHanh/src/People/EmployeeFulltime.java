package People;

public class EmployeeFulltime extends Employee {
    public int day;
    public int year;
    public EmployeeFulltime() {
        chucVu = "Fulltime";
        day = 0;
        year = 0;
    }
    public void EnterData() {
        super.EnterData();
        System.out.print("So nam da lam viec o cong ty: ");
        year = sc.nextInt();
        System.out.print("So ngay lam viec: ");
        day = sc.nextInt();
    }
    public void luong() {
        if (year<3)
        luong = luong * day * 8 + 100000;
        else if (year<5)
        luong = luong * day * 8 + 200000;
        else 
        luong = luong * day * 8 * 400000;
    }
    public void Display() {
        super.Display();
        System.out.println("So nam lam viec o cong ty: " + year);
    }

}
