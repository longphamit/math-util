/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util.test;

import math.longpc.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ASUS
 */

// class choi tro tach data
@RunWith(value = Parameterized.class)
public class MathUtilAdvancedTest {
    // chuan bi data qua 1 ham va feed vao cho can test
    // ham nay phai tra ve mang cac gia tri lien quan
    // quy uoc phai la static de de truy xuat
    //quy uoc dung mang object ko choi mang primitive
    // vi lon xon data dua vao so chu --> object
    @Parameters
    public static Integer[][] initData(){
        return new Integer[][]{{0,1},{1,1},{2,2},{5,120},{6,720}};
        // tach dung dong vao ham assert vaf ham getfactorial
        // ta can cac bien tuong ung de don value
    }
    @Parameter(value=1)
    public long expected;
    @Parameter(value=0)
    public int input;
    @Test
    public void testFactorialValidArgumentReturnWell(){
        assertEquals(expected, MathUtility.getFactorial(input));
    }
    
}
