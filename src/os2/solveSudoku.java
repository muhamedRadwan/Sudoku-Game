/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.util.ArrayList;
/**
 *
 * @author Mohamed-A.Radwan
 */
public class solveSudoku {
    int [] [] sudoku;
    int size;
    public solveSudoku() {
      size=Operations.Rows.size();
    }

    
 public boolean Is_SaveRow( int row, int num)
    {
        for (int i=0; i<size; i++)
        {
            if (Operations.Rows.get(row).get(i)==num)
                return false;
        }
        return true;
    }


public boolean Is_SaveCol( int col, int num)
    {
        for (int i=0; i<size; i++)
        {
            if (Operations.Rows.get(i).get(col)==num)
                return false;
        }
        return true;
    }

public boolean Is_SaveBox( int boxStartRow, int boxStartCol, int num)
{
    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            if (Operations.Rows.get(row+boxStartRow).get(col+boxStartCol)== num)
                return true;
    return false;
}



public boolean Is_Save(Point point, int num)
{
    return  Is_SaveRow( point.row, num) &&
            Is_SaveCol( point.col, num) &&
           !Is_SaveBox( point.row - point.row%3 , point.col - point.col%3, num);
}

     public Point Find_Unassigned_Location( )
    {
        Point Localpoint=new Point();
        for(int row =0 ; row <size;row ++)
        {
            for (int col =0; col <size  ;col ++)
            {
               if (Operations.Rows.get(row).get(col).equals(0))
               { 
                   Localpoint.col=col;
                   Localpoint.row=row;  
                   Localpoint.Flage=true; 
                   return Localpoint;
               }  
            }
        }
        Localpoint.Flage=false;
     return Localpoint ;
    }
     
     public  boolean  SolveSudoku()
     {
        Point point=new Point();
         int row,col;
         ArrayList<ArrayList<Integer>> s = Operations.Rows;
         point=Find_Unassigned_Location();
         if(!point.Flage)
             return true;
         for(int i=1;i<=size;i++)
         {
             if(Is_Save(point,i))
             {
                Operations.Rows.get(point.row).set(point.col,i);
                 if(SolveSudoku())
                     return true;
                  Operations.Rows.get(point.row).set(point.col,0);
             }
         }
         return false;
     }

}
