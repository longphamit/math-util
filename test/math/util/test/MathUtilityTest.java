/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util.test;

import java.sql.SQLException;
import static math.longpc.MathUtility.*;
import math.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    
    public MathUtilityTest() {
    }
    @Test // cach dat ten noi len muc tieu cua ham co nhieu quy tac day ten 
    // ham test
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120,getFactorial(5));
        assertEquals(1,getFactorial(0));
        assertEquals(120,getFactorial(5));
        assertEquals(720,getFactorial(6));
    }
    // ngoai le ko phai la thu co dai luong dung de so sanh
    // ma chi thay no xuat hien nhu ko
    // neu ngoai le xuat hien thi thay co 1 object exception thuoc class tuong ung
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialInvalidArgumentThrowsException(){
        MathUtil.getFactorial(5);
    }
    // ngoai le ko phai la value de dem ra so sanh chi co the kiem tra
    // coi no co xuat hien ko
    
}
