/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.util.Random;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Make_Sudoku {
    
     public int[][] diff_gen(int diff){
             int a[][] = new int[9][9];
            int b[][] = new int[9][9];
       int p = 1;
        Random r = new Random();
        int i1=r.nextInt(9);
        int firstval = i1;
        while (p == 1) {
            int x = firstval, v = 1;
                                           //generate random sudoko nums
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((x + j + v) <= 9)
                        a[i][j] = j + x + v;
                    else
                        a[i][j] = j + x + v - 9;
                    if (a[i][j] == 10)
                        a[i][j] = 1;
                 
                }
                x += 3;
                if (x >= 9)
                    x = x - 9;
                if (i == 2) {
                    v = 2;
                    x = firstval;
                }
                if (i == 5) {
                    v = 3;
                    x = firstval;
                }

            }
                                // move random places
            switch (diff) {
                
                 case 1:  //Extremly Easy 

                     for (int i = 0; i < 70; i++) {
                         int f = r.nextInt(9);
                         int s = r.nextInt(9);
                         while(b[f][s]==0){
                           f = r.nextInt(9);
                          s = r.nextInt(9);
                          b[f][s]=a[f][s];
                         }
                          
                     }
                     
                    break;
                    
                 case 2:  //Easy 

              
               
                for (int i = 0; i < 50; i++) {
                         int f = r.nextInt(9);
                         int s = r.nextInt(9);
                         b[f][s]=a[f][s] ;  
                     }
                                    break;

                 case 3:  //Medium

              
              for (int i = 0; i < 40; i++) {
                         int f = r.nextInt(9);
                         int s = r.nextInt(9);
                         b[f][s]=a[f][s] ;  
                     }
                break;
                 case 4:  //Difficult

         
               for (int i = 0; i < 35; i++) {
                         int f = r.nextInt(9);
                         int s = r.nextInt(9);
                         b[f][s]=a[f][s] ;  
                     }
               
                break;
                 case 5:  //Evil 

          
               
               for (int i = 0; i < 30; i++) {
                         int f = r.nextInt(9);
                         int s = r.nextInt(9);
                         b[f][s]=a[f][s] ;  
                     }
               break;
               
                default:
                    System.err.println("error");
                    break;
                
              
            }
            p=0;
           
}
            return b;
        
        }
}
