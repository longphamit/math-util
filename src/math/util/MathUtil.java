/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import math.longpc.MathUtility;
import static math.longpc.MathUtility.getFactorial;
import static math.longpc.MathUtility.*;
// goi ham static ko can cham y chang c
/**
 *
 * @author ASUS
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // test ham bang mat
        long expected= 120;
        long actual=getFactorial(5);
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        System.out.println(expected==actual);
        // expected: 720 if tinh 6!
        System.out.println("6!: "+getFactorial(6));
        // expected :1 if 0!
        System.out.println("0!: "+getFactorial(0));
        //expected:IllegalArgumentException if tinh -5!
        //System.out.println("-5!: "+getFactorial(-5));
        // in thu PI
         System.out.println("PI: "+PI);
         
         // muon ket luan ham ngon thi ta phai nhin bang mat
         // so sanh voi ky vong
         // lam tung truong hop chay ham - test case
         // cach nay on nhung mat suc
         // cach nang cao: dung mau xanh do
         // ta thay xanh, ham y moi tinh huong on
         // ta thay do chi 1 thang mau do coi nhu ham toang
         // ta xai them 1 framework --> Unit Test 
         // trong do JUnit, NUNIT la nhung framework cu the de test cac ham hieu qua
         // dung no ta tich hop vao 1 quy trinh lam phan mem lon hon
         // CI/CT/CD/DEVOPS
         // 
         // minh hoa khai niem refactoring - toi uu chinh sua lai code cho tot hon
         // minh hoa khai niem Regression Test test hoi quy, test lai nhung gi minh tung test
        // de xem thu con xanh ko
        
        
        
    }
     //viet de quy
    public static long getFactorial(int n){
            if(n<0||n>20){
                throw new IllegalArgumentException("n must be between 0..20");
                
            }
            if(n==0|| n==1){
                return 1;
            }
            return n*getFactorial(n-1);
        }
}
