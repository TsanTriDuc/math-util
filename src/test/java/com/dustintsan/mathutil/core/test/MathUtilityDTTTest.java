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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityDTTTest {

    //Chuẩn bị data, sau này đưa vào hàm assert() của Framework
    //data này sẽ từ từ đc trích vào trong hàm assert()
    //nó nằm trong hàm có style là static = nằm cố định 1 vùng ram
    //Test case
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720
    //ta thấy có các bộ data
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}...
    //              [7][12]
    //ta để riêng data này ra 1 mảng 2 chiều
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }

    //Test case để so sánh hàm có trả về kì vọng ko
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentRetunrsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
