import java.util.Scanner;
class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grid [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int player = 1;
        while(true){
            drawBoard(grid);
            int number = sc.nextInt();
            if(player == 1){
                if (!isOccupied(grid,number-1)){
                    grid[number-1] = "X";
                    player = 2;
                }
            }
            else{
                if (!isOccupied(grid,number-1)){
                    grid[number-1] = "O";
                    player = 1;
                }
            }
            if((grid[0]==grid[1] && grid[0]==grid[2])|| //Winning Conditions
            (grid[3]==grid[4] && grid[3]==grid[5])||
            (grid[6]==grid[7] && grid[6]==grid[8])||
            (grid[0]==grid[3] && grid[0]==grid[6])||
            (grid[1]==grid[4] && grid[1]==grid[7])||
            (grid[2]==grid[5] && grid[2]==grid[8])||
            (grid[2]==grid[4] && grid[2]==grid[6])){
            drawBoard(grid);
            System.out.println("player " + (3-player) + " has won!");
            break;
            }
        }
    }

    public static void drawBoard(String[]grid){
        System.out.print  (" "+grid[0]+" |  "+grid[1]+" | "+grid[2]+" "
                        +"\n - +  - + - "
                        +"\n "+grid[3]+" |  "+grid[4]+" | "+grid[5]+" "
                        +"\n - +  - + - "
                        +"\n "+grid[6]+" |  "+grid[7]+" | "+grid[8]+" \n"); 
    }

    public static boolean isOccupied(String[]grid, int idx){
        if (grid[idx] == "X" || grid[idx] == "O") return true;
        else return false;
    }
}
