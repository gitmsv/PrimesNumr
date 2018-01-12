/*This application displays all the prime numbers from 1 to 100.*/
package primesnumr;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 12.01.2018
 */
public class PrimesNumr {

    /*Простым числом является натуральное число, которое делится только на себя
    и на единицу и которое больше единицы */
    
    public static void main(String[] args) {
       int n = 100;
       for (int i = 2; i <= n; i++) {
            boolean bln = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    bln = false;
                    break;
                }
            }
            if (bln) {
                System.out.println(i + " prime numbers");
            }
        }
    }
}