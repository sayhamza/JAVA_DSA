// package Backtracking;

// public class nQueen {

//     public static void nQun(char board[][],int row){
        
       
//             //Column Loop
//                for (int j = 0; j < board.length; j++) {
//             board[row][j]='Q';
//             nQun(board, row+1);
//             board[row][j]='.';

//             //  if(issafe(board,row,j)){

//             //  }

//             //Base Case
//             if (row==board.length) {
//                 printBoard(board);
//                 return;
                
//             }
//         }

//         }
//         // public static boolean issafe(char board[][],int row,int col){
//         //     //Vertical Direction Up
//         //     for (int i = row-1; i >=0; i--) {
//         //         if (board[i][col]=='Q') {
//         //             return false;
//         //         }   
//         //     }

//         }
     
    
//     public static void printBoard(char board[][]){
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j]+" ");
//                 System.out.println();
//             }
//         }
//     }


//     public static void main(String[] args) {
//         int n =2;
//         char board[][]=new char[n][n];

//         //Initialization

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j]='.';
                
//             }
            
//         }
//         nQun(board, 0);
        
        
    
    

