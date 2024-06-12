/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dustintsan.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    //ta sẽ viết những hàm toán học cung cấp cho bên ngoài sử dụng 
    //giống như thư viện Math. của JDK
    //Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    //thì sẽ được thiết kế là static!!!
    //static sẽ được gọi trực tiếp qua tên class
    
    //Hàm tính n! = 1.2.3.4...n
    //n 0...20; do 21! tràn kiểu long, ko có âm giai thừa
    //0! = 1
    public static long getFactorial(int n){
        //sửa lại từ 10 thành 1 để có màu xanh trở lại
//        long product = 1; //biến con heo đất, biến nhân dồn
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n==0 || n == 1)
            return 1; //điểm dừng đệ quy
        //code chạy đến đây, n = 1..2..20
        return n * getFactorial(n - 1);
        //n! = n * (n - 1)!     sài stack LIFO - last in first out
        //Using recursion to demostrate regression test
    }
}

//Học về regression test - kiểm thử hồi quy
//Kiểm thử lại những thứ đã từng kiểm thử, tại sao phải làm điều này
//Lý do: Code đang ổn, mà k đụng vào nó, thì nó vẫn ổn
//      Nhưng nếu có fix bug, có sửa hàm, có tối ưu thuật toán trong
//      hàm, thì hàm cân phải được test lại - test lại thứ đã từng test
//      test lại hàm đã từng test, để xác nhận rằng nó còn ngon - còn 
//      xanh hay ko sau khi code được sửa

//Nếu có unit test code (JUnit) việc test lại code cực nhanh
//chỉ cần thấy màu xanh của các JUnit Test Case đucowj run là đủ
//Nhanh nữa: đưa Unit Test lên GitHub, cài CI Script (File YAML YML) vào
//mọi thứ tự độn báo xanh đỏ luôn

//Kiểm thử lại những thứ đã kiểm thứ gọi là Test hồi quy - Regression Test
//Nên dùng tự động bằng cách xài Unit Test Framework
//Nhìn = mắt từ hàm main() cach truyền thống là ko nên

//5! = 1.2.3.4.5 = 1.2.3.4    .5
//                      4!    .5
//5! = 5 x 4!

//4! = 1.2.3.4 = 1.2.3   .4 = 4 x 3!
//3! = 1.2.3 = 3 x 2!
//2! = 1.2 = 2x 1!
//  RETURN, được tính =
//1! = 1

//N! = N x (N-1)!
//Công thức đệ quy - Recursion - Gọi lại chính mình với quy mô nhỏ hơn