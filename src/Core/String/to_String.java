package Core.String;

public class to_String {
    int rollno;
    String name;
    String city;

    to_String(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return rollno+" "+name+" "+city;
    }

    public static void main(String[] args) {
        to_String tt1 = new to_String(101, "Viet", "HaNoi");
        to_String tt2 = new to_String(102, "Nam", "DaNang");
        System.out.println(tt1);
        System.out.println(tt2);
    }
}
