package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solutions {

    public int countIslands(int[][] grid) {
// TODO: Implement this method
        if (grid==null||grid.length==0||grid[0].length==0){
        return 0;
        }
        int numRows= grid.length;
        int numCol=grid[0].length;
        int isCount=0;
        for (int row=0;row<numRows;row++){
            for (int col=0;col<numCol;col++){
                if (grid[row][col]==1){
                    isCount++;
                    islans(grid,row,col,numRows,numCol);
                }
            }
        }
        return isCount;
    }
    private void  islans(int[][] grid,int row,int col,int numRow, int numCol){
        if (row<0||col<0||row>=numRow||col>=numCol||grid[row][col]==0){
            return;
        }
        grid[row][col]=0;
        islans(grid,row+1,col,numRow,numCol);
        islans(grid,row-1,col,numRow,numCol);
        islans(grid,row,col+1,numRow,numCol);
        islans(grid,row,col-1,numRow,numCol);

    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
Solutions solutions =new Solutions();
int[][] grid={
        {1,1,0,0},
        {1,0,0,1},
        {0,0,1,1},
        {0,0,0,0}
};
        System.out.printf("Islands1"+solutions.countIslands(grid)+"\n");
        int[][] grid2={
                {1,1,0,0},
                {0,1,0,1},
                {0,1,1,1},
                {0,0,0,1}
        };
        System.out.printf("Islands2\n"+solutions.countIslands(grid2)+"\n");
        int[][] grid3={
                {1,0,1,0},
                {0,0,0,0},
                {1,0,1,0},
                {0,1,0,1}

        };
        System.out.printf("Islands3\n"+solutions.countIslands(grid3)+"\n");

        int[][] grid4={
                {1,1,1},
                {1,1,1},
                {0,1,0}
        };

        System.out.printf("Islands4\n"+solutions.countIslands(grid4)+"\n");





    }
}