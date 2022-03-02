/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle1;




/* Course: CS3642
// Student name: My Anh Huynh
// Student ID: 000980970
// Assignment #: #1
// Due Date: 03/04/2021
 *
 * @author anhhuynh
 */
public class EightPuzzle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] tiles = {{4, 1, 3},
            {0, 2, 6},
            {7, 5, 8}};



    double start = System.currentTimeMillis();
    Board board = new Board(tiles);
    Solver solve = new Solver(board);
    System.out.printf("# of moves = %d && # of actual moves %d & time passed %f\n, ", solve.moves(), solve.moves(), (System.currentTimeMillis() - start) / 1000);
    
}
}
