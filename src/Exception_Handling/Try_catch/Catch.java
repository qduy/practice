package Exception_Handling.Try_catch;
// đa khối lệnh catch
public class Catch {
    public static void main(String[] args) {
        try{
            int a[] = new int[6];
            a[6] = 50/0;
        }catch (ArithmeticException a){
            System.out.println("task1 completed");
        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("task2 completed");
        }catch (Exception e){
            System.out.println("common task completed");
        }
        System.out.println("rest of code...");

        // trường hợp sai là khi đưa catch(Exception e) lên đầu tiên
    }
}
