package OOP.Level3;

public class Level3 {
     private float x,y;

     // hàm khởi tạo mặc định
     public Level3(){
         this.x=0;
         this.y=0;
     }
     //hàm khởi tạo 2 thuộc tính
     public Level3(float x, float y){
         this.y = y;
         this.x = x;
     }

     public void move(float dx, float dy){
         x += dx;
         y += dy;
     }
     // tính khoảng cách giữa 2 điểm
    public float distance(Level3 A){
         return (float) Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y, 2));
    }
    // hiển thị toạ độ của điểm hiện tại
    public void display(){
        System.out.println("( "+x+" , "+y+" )" );
    }

    public static void main(String[] args) {
        // tạo 2 điểm A, B
        Level3 A,B;
        A = new Level3(3,4);
        B = new Level3(6,7);

        System.out.println("Toạ độ của A là: ");A.display();
        System.out.println("Toạ độ của B là: ");B.display();
        // di chuyển đến vị trí mới
        A.move(4,2);
        //toạ độ mới của A
        System.out.println("Toạ độ mới của điểm A: ");A.display();
        //tính khoảng cách từ A đến B
        double d= A.distance(B);
        System.out.println("Khoảng cách từ A đến B: "+d);
    }

}
