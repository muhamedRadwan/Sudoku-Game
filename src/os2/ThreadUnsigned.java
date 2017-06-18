/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

/**
 *
 * @author emad
 */
public class ThreadUnsigned extends Thread{
    public Point P;
    @Override
    public void run()
    {
        solveSudoku S=new solveSudoku();
        P=S.Find_Unassigned_Location();
    }
}
