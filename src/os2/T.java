package os2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad
 */
public class T extends Thread{
    public boolean flag;
    ArrayList<ArrayList<Integer>> A;
    ArrayList<Integer>A2;
    public int x=0;
    public T(ArrayList<ArrayList<Integer>> A,int x)
    {
        this.x=x;
        this.A=A;
    }
    public T(ArrayList<Integer> A2)
    {
        this.A2=A2;
    }
    @Override
    public void run() 
    {
        Operations E=new Operations();
        boolean b;
        if(x==1)
        {
        b=E.Check_Row_Column(A);
        }
        else
        {
            b=E.Check_Box(A2);
        }
        this.flag=b;
    }
    
}
