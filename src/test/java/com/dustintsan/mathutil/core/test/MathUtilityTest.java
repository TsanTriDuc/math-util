/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dustintsan.mathutil.core.test;

import com.dustintsan.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//quy ước đặt tên package của Java
//tên miền dảo ngược, chữ thường 100%
//com.tên-cty.tên-dự-án.tên-module.tên-clas-sẽ-dùng
//com.microsoft.sqlservêr.jdbc

//C# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sqlserver...

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //ở đây chứa các lệnh các hàm dùng để đi test cá hàm chính ở bên code chính
    //ở bên thư mục src phía trên coi hàm chạy ổn ko
    //ở đây ta làm các hàm ứng với các test case để test code chính ở bên
    //MathUtility. ví dụ  .getFactorial()
    
    //Test case là 1 bộ data đưa vào hàm, app để verify hàm, app có xử lí
    //đúng hay ko, nó đi kèm theo cách xài hàm, trình tự xài app + expected
    //value + status test case passed ha failed
    
    //Test case #1: Check getFactorial with n = 0, 0! hopes to see 1 returned
    @Test
    //tên hàm mang ý nghĩa của test case luôn
    public void testFactorialGivenRightArg0ReturnsWell(){
        int n = 0; //given right agrument
        long expectedValue = 1; //hi vọng n! 0! => 1
        long actualValue; //= ???; // đoán xem trả về mấy
        //nếu expected == actual, hàm ngon với case này
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
        //cách cũ là phải sout() từng cái 1 và dùng mắt để nhìn đúng sai
    }
    
    //Test case #2: Check getFactorial with n = 1, expected => 1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell(){
        int n = 1;
        long expectedValue = 1;
        long actualValue; //=??? //chờ xem
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    //Test case #3: Check getFactorial with n = 2, expected => 2! = 2
    //                                      n = 3, expected => 3! = 6
    //                                          5              5! = 120 
    @Test
    public void testFactorialGivenRightArg235ReturnsWell(){
        int n = 2;
        long expectedValue = 2;
        long actualValue; //=??? //chờ xem
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue); //2
        
        assertEquals(6, MathUtility.getFactorial(3));
        
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //Test case #4: Check if getFactorial returns exception if we pass n < 0
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException(){
        //Input n < 0, n = -1
        //Expected result: Illegal Argument Exception
        //nhớ quy ước: màu xanh ứng với trả về như kì vọng
        //màu đỏ: actual !== kì vọng
        //Ngoại lệ exception k là value, ta ko khai báo biến bằng ngoại lệ
        //ko assertEquals (value, value)
        
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
}

//Phần kiến thức bổ sung vào CV
//TDD - Test Driven Development
//Là kỹ thuật viết code của dân dev đi kèm với viết các test case
//Để kiểm thử ngay những code vừa viết
//Tức là code mỗi hàm, luôn đi kèm code kiểm thử
//Kết quả kiểm thử hiển thị theo 2 màu xanh - code ngon, pass các test case
//Màu đỏ, code đã ko pass test case
//Việc này cứ liên tục như vậy, viết code, viết test case, run test
//Case để xem xanh đỏ, kĩ thuật này gọi là TDD

//Mọi ngôn ngữ lập trình đều hỗ trợ các bộ thư viện, Framework
//giúp test code 2 màu xanh đỏ gọi là unit testing framework
//Mọi ngôn ngữ đều hỗ trợ TDD, vấn đề dev team có xài hay ko
//Nhóm làm OBS có xài

//Đề bài thuyết trình nhóm
//Nhóm hãy chọn 1 unit testing framework để demo
//Vào gg gõ: Unit Testing Framework for <NNLT>
//C#: NUnit, XUnit, MS Test
//Java: Testing
//JS: Mocha, Jasmine

//Dòng thứ 2 trong CV
//DDT - Data Driven Testing | từ tương đương
//                            Parameterized Testing
//                          Viết test case theo style tham số hoá
//(Đừng nhầm với TDD - Test Driven Development)             
//DDT là phần mở rộng thêm, kỹ thuật nâng cao để giúp tổ chức
//các test case khi viết code Unit Test, nó có bà con với TDD

//DDT - Parameterized Testing là kĩ thuật viết các test case
//Mà ta tách riêng phần data ra khỏi các câu lệnh assert()
//cho dễ quản lí tính thiếu đủ của các test case
//dễ theo dõi các phần code liên quan đến test hàm
//vì câu lệnh so sánh Expected vs Actual trở nên gọn nhẹ hơn