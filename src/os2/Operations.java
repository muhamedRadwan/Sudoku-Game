/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author emad
 */
public class Operations {
    int Counter=0;
    public static ArrayList<ArrayList<Integer>> elements, Cols, Rows;
    ArrayList<Integer> Row, tempRow1, tempRow2, tempRow3, TempCol1, TempCol2, TempCol3;
    public ArrayList<Integer> Col;
    public ArrayList<ArrayList<Integer>> sudoku;
    public void SetElements(ArrayList<ArrayList<Integer>> elements) {

        Operations.elements = elements;
    }

    public Operations() {
        elements = new ArrayList<>(9);
        Rows = new ArrayList<>(9);
        Cols = new ArrayList<>(9);
    }


    public void undoMakeRowsToInteger(ArrayList<ArrayList<Integer>> sudoku) {
        this.sudoku = new ArrayList<>(9);
        for (int co = 0; co < 9; co += 3) {
            tempRow1 = new ArrayList<>();
            tempRow2 = new ArrayList<>();
            tempRow3 = new ArrayList<>();
            //bt3d el row 
            for (int count = co; count < co + 3; count++) {
                for (int counter = 0; counter < 3; counter++) {
                    tempRow1.add(sudoku.get(count).get(counter));
                    tempRow2.add(sudoku.get(count).get(counter + 3));
                    tempRow3.add(sudoku.get(count).get(counter + 6));
                }
            }
            this.sudoku.add(tempRow1);
            this.sudoku.add(tempRow2);
            this.sudoku.add(tempRow3);

        }
    }
    public ArrayList<ArrayList<JTextField>> undoMakeRowsToJtext(ArrayList<ArrayList<JTextField>> sudoku) {
        ArrayList<ArrayList<JTextField>> Tempsudoku = new ArrayList<>(9);
        ArrayList<JTextField> JtexttempRow1,JtexttempRow2,JtexttempRow3,JTextRow;

        for (int co = 0; co < 9; co += 3) {
            JtexttempRow1 = new ArrayList<>();
            JtexttempRow2 = new ArrayList<>();
            JtexttempRow3 = new ArrayList<>();
            //bt3d el row 
            for (int count = co; count < co + 3; count++) {
                for (int counter = 0; counter < 3; counter++) {
                    JtexttempRow1.add(sudoku.get(count).get(counter));
                    JtexttempRow2.add(sudoku.get(count).get(counter + 3));
                    JtexttempRow3.add(sudoku.get(count).get(counter + 6));
                }
            }
            Tempsudoku.add(JtexttempRow1);
            Tempsudoku.add(JtexttempRow2);
            Tempsudoku.add(JtexttempRow3);
        }
        return Tempsudoku;
    }
    public void MakeRows() {
        //Deh 3add   el Boxes
        Rows=new ArrayList<>();
        for (int co = 0; co < 9; co += 3) {
            tempRow1 = new ArrayList<>(9);
            tempRow3 = new ArrayList<>();
            tempRow2 = new ArrayList<>();
            //Deh 3dd EL Boxes Fee EL Eow EL wa7ed
            for (int i = co; i < co + 3; i++) {
                Row = elements.get(i);//BOx=1 ,Box2
                //Deh 3add EL Text Filed Fee EL Box El wa7ed
                for (int j = 0; j < 3; j++) {
                    //System.out.print(Row.get(j));
                    //System.out.print(Row.get(j+3));
                    //System.out.print(Row.get(j+6));
                    tempRow1.add(Row.get(j));
                    tempRow2.add(Row.get(j + 3));
                    tempRow3.add(Row.get(j + 6));
                    /*
                    i=0             i=1                     i=2
                    j=0:3           J=0:3                   J=3:0
                    tempRow1=[8,1,2] tempRow2=[8,1,2,7,5,3]   tempRow3=[8,1,2,7,5,3,6,4,9]
                     */
                }
            }
            Rows.add(tempRow1);
            Rows.add(tempRow2);
            Rows.add(tempRow3);
            // System.out.println("---------------------");
        }
    }
    public ArrayList<ArrayList<JTextField>>  MakeRowsJText(ArrayList<ArrayList<JTextField>> JtextArray) {
        //Deh 3add   el Boxes
      ArrayList<ArrayList<JTextField>> JTextRows=new ArrayList<>();
      ArrayList<JTextField> JtexttempRow1,JtexttempRow2,JtexttempRow3,JTextRow;
        for (int co = 0; co < 9; co += 3) {
            JtexttempRow1 = new ArrayList<>(9);
            JtexttempRow2 = new ArrayList<>();
            JtexttempRow3 = new ArrayList<>();
            //Deh 3dd EL Boxes Fee EL Eow EL wa7ed
            for (int i = co; i < co + 3; i++) {
                JTextRow = JtextArray.get(i);//BOx=1 ,Box2
                //Deh 3add EL Text Filed Fee EL Box El wa7ed
                for (int j = 0; j < 3; j++) {
                    //System.out.print(Row.get(j));
                    //System.out.print(Row.get(j+3));
                    //System.out.print(Row.get(j+6));
                    JtexttempRow1.add(JTextRow.get(j));
                    JtexttempRow2.add(JTextRow.get(j + 3));
                    JtexttempRow3.add(JTextRow.get(j + 6));
                    /*
                    i=0             i=1                     i=2
                    j=0:3           J=0:3                   J=3:0
                    tempRow1=[8,1,2] tempRow2=[8,1,2,7,5,3]   tempRow3=[8,1,2,7,5,3,6,4,9]
                     */
                }
            }
            JTextRows.add(JtexttempRow1);
            JTextRows.add(JtexttempRow2);
            JTextRows.add(JtexttempRow3);
            // System.out.println("---------------------");
        }
        return JTextRows;
    }

    public void MakeCol() {
        //Deh 3add   el Boxes
        Cols=new ArrayList<>();
        for (int co = 0; co < 3; co += 1) {
            TempCol1 = new ArrayList<>(9);
            TempCol2 = new ArrayList<>();
            TempCol3 = new ArrayList<>();
            //Deh 3dd EL Boxes Fee EL Eow EL wa7ed
            for (int i = co; i < co + 7; i += 3) {
                Col = new ArrayList<>();
                Col = elements.get(i);//BOx=0 ,Box=3 ,Box=6
                //Box=1  .Box=4 ,Box=7
                //Box=2  ,Box=5 ,Box=8
                //Deh 3add EL Text Filed Fee EL Box El wa7ed
                for (int j = 0; j < 9; j += 3) {
                    //System.out.print(Row.get(j+3));
                    //System.out.print(Row.get(j+6));
                    TempCol1.add(Col.get(j));
                    TempCol2.add(Col.get(j + 1));
                    TempCol3.add(Col.get(j + 2));
                    /*
                    i=0             i=3                     i=6
                    j=0:9           J=0:9                   J=0:9
                    TempCol1=[8,9,6] TempCol2=[8,9,6,1,3,2]   TempCol3=[8,9,6,1,3,2,5,4,7]
                     */
                }
            }
            Cols.add(TempCol1);
            Cols.add(TempCol2);
            Cols.add(TempCol3);
            //System.out.println("---------------------");
        }
    }

    public boolean Check_Row_Column(ArrayList<ArrayList<Integer>> A) {
        int Sum = 0;
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> S = new ArrayList();
            Sum = 0;
            for (int j = 0; j < A.get(i).size(); j++) {
                if (S.contains(A.get(i).get(j)) == false) {
                    S.add(A.get(i).get(j));
                } else {
                    return false;
                }
            }
            for (int h = 0; h < S.size(); h++) {
                Sum += S.get(h);
            }
            if (Sum != 45) {
                return false;
            }
        }
        return true;
    }

    public boolean Check_Box(ArrayList<Integer> A) {
        ArrayList<Integer> S = new ArrayList();
        int Sum = 0;
        for (int j = 0; j < A.size(); j++) {
            if (S.contains(A.get(j)) == false) {
                S.add(A.get(j));
            } else {
                return false;
            }
        }
        for (int h = 0; h < S.size(); h++) {
            Sum += S.get(h);
        }
        if (Sum != 45) {
            return false;
        }
        return true;
    }

    public boolean Repated(ArrayList<ArrayList<JTextField>> list) {
        ArrayList<Boolean> CheckRow = new ArrayList<>();
        boolean flage=false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                Counter=0;
                if((Integer.parseInt(list.get(i).get(j).getText()))!=0)
                    if(!Is_Save(list,new Point(i,j),Integer.parseInt(list.get(i).get(j).getText())))
                    {

                            flage=true;
                    }
            }
        }
        return flage;
    }

    public boolean Is_Save(ArrayList<ArrayList<JTextField>> list,Point point, int num) {
         Is_SaveRow(list,point.row, num);
         Is_SaveCol(list,point.col, num);
         Is_SaveBox(list,point.row - point.row % 3, point.col - point.col % 3, num);
         return Counter == 3;//1 to row & 1 to col & 1 to BOx 
    }

    public void Is_SaveRow(ArrayList<ArrayList<JTextField>> list,int row, int num) {
        for (int i = 0; i < list.size(); i++) {

            if ( Integer.parseInt(list.get(row).get(i).getText())== num) {
                Counter++;
                if(Counter>1)
                   list.get(row).get(i).setBackground(Color.red);   
            }
        }
    }

    public void Is_SaveCol(ArrayList<ArrayList<JTextField>> list,int col, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i).get(col).getText())== num) {
               Counter++;
               if(Counter>2)
                   list.get(i).get(col).setBackground(Color.red);
            }
        }
    }

    public void Is_SaveBox(ArrayList<ArrayList<JTextField>> list,int boxStartRow, int boxStartCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (Integer.parseInt(list.get(row + boxStartRow).get(col+boxStartCol).getText())== num) {
                    Counter++;
                    if(Counter>3)
                      list.get(row + boxStartRow).get(col+boxStartCol).setBackground(Color.red);
                }
            }
        }
    }

    
}
