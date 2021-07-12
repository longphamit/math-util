/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.longpc;

/**
 *
 * @author ASUS
 */
public class MathUtility {
     public static final double PI=3.1415;
    // ham tinh gia thua n!= 1.2.3.4....n
    // minh khong tinh duoc giai thua am
    // ham giai thua trong gioi han dau vao tu 0-20
    
    //test code TDD --> expected 
    //
    public static long getFactorial(int n){
        if(n<0||n>20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if(n == 0||n ==1){
           return 1;
        }
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        //ko xai else, co else tru diem
        return result;
    }
    
}
