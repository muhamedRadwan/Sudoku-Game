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
public class ThreadIsSave extends Thread{
    int Num;
    Point P;
    public boolean Flag;
    public ThreadIsSave(Point P,int Num)
    {
        this.Num=Num;
        this.P=P;
    }
    @Override
    public void run()
    {
        solveSudoku S=new solveSudoku();
        Flag=S.Is_Save(P, Num);
    }
}
