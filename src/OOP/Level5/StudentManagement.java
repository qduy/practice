package OOP.Level5;

import javax.swing.text.DefaultTextUI;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
    //dùng để chứa danh sách sinh viên
    Vector list = new Vector();

    public StudentManagement(){
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("--Các chức năng của chương trình");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Xem danh sách sinh viên");
            System.out.println("3.Sắp xếp danh sách sinh viên theo điểm tăng dần");
            System.out.println("4.Tìm nhân viên theo tên");
            System.out.println("5.Thoát");

            //nhập số từ bàn phím -> loại chức năg tương ứng
            int type;
            Scanner sc01 = new Scanner(System.in);
            System.out.println("Nhập loại chức năng: ");
            type = sc01.nextInt();
            //kiểm tra và gọi chức năng tương ứng
            switch (type){
                //các truơng hợp
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    this.sort();
                    break;
                case 4:
                    this.search();
                    break;
                case 5:
                    System.out.println("---Kết thức chương trình---");
                return;
            }
        }
    }

    public void input(){
        //số sv
        int numSv;
        Scanner sc02 = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        numSv = sc02.nextInt();
        //nhập thông tin cho mỗi sv
        for (int i=1; i <= numSv; i++){
            System.out.println("Nhập thông tin cho sinh viên thứ "+i);
            System.out.println(" ID: ");
            int id = Integer.parseInt(sc02.next());
            sc02.nextLine(); //xoá bỏ đệm
            System.out.println(" Tên: ");
            String name = sc02.nextLine();
            System.out.println(" Điểm trung bình: ");
            float aver = sc02.nextFloat();

            // sau khi nhập thông tin, tạo đối tượng sinh viên
            Student st = new Student(id,name,aver);

            list.add(st);
        }
        System.out.println("\n-----------\n");
    }

    public void view(){
        //hiển thị danh sách sinh viên
        System.out.println("Danh sách các sinh viên: ");
        //lấy sinh viên từ danh sách (vector) và lưu trữ ở vEnum
        Enumeration vEnum = list.elements();
        //duyệt từng phần tử của vEnum
        int i=1;
        //chưa hết phần từ
        while (vEnum.hasMoreElements()){
            //lấy phần tử từ vEnum ép lại kiểu Student
            Student std = (Student)vEnum.nextElement();

            //hiển thị thông tin sinh viên
            System.out.println("  "+". ID "+std.getId()+" Tên: "+std.getName()+" Điểm trung bình: "+std.getAver());
            i++;
        }
        System.out.println("\n--------\n");
    }

    // sử dụng hàm sort của lớp Array để sắp xếp danh sách theo chiều tăng của điểm trung bình
    public void sort(){
        //đưa dữ liệu từ Vector vào mảng để gọi hàm sort
        Student[] std = new Student[list.size()];
        int index = 0;

        Enumeration vEnum = list.elements();
        while (vEnum.hasMoreElements()){
            std[index] = (Student)vEnum.nextElement();
            index++;
        }
        // sắp xếp mảng
        Arrays.sort(std);
        System.out.println("\n--Thứ tự sinh viên sau khi đước dắp xếp");
        for (index=0; index<std.length; index++){
            System.out.println("  "+(index+1)+".ID "+std[index].getId()+" Tên: "+std[index].getName()+" Điểm trung bình: "+std[index].getAver());
        }
        System.out.println("\n-------\n");
    }

    public void search(){
        // Nhập tên sinh viên cần tìm kiếm
        Scanner sc03 = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String svFind = sc03.nextLine();
        //duyệt từng phần tử của mảng để kiếm tra tên
        Enumeration vEnum = list.elements();
        System.out.println("Thông tin sinh viên tìm được:");
        while (vEnum.hasMoreElements()){
            Student std = (Student)vEnum.nextElement();
            //nếu tên sinh viên chứa chuỗi nhập thì hiển thị thông tin đói tượng sv
            if (std.getName().indexOf(svFind) != -1) System.out.println("  "+". ID "+std.getId()+" Tên: "+std.getName()+" Điểm trung bình: "+std.getAver());

        }
        System.out.println("\n-------\n");
    }

    public static void main(String[] args) {
       new StudentManagement();
    }
}
