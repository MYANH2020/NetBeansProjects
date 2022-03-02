/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author anhhuynh
 */
import java.util.HashSet;
import java.util.Set;

import java.util.Stack;
import java.util.PriorityQueue;
public class HW1 {

    /**
     * @param args the command line arguments
     */
    
private int moves = 0;
private SearchNode finalNode;
private Stack<Board> boards;


public Solver(Board initial) {
    if (!initial.isSolvable()) throw new IllegalArgumentException("Unsolvable puzzle");

    // this.initial = initial;
    PriorityQueue<SearchNode> minPQ = new PriorityQueue<SearchNode>(initial.size() + 10);

    Set<Board> previouses = new HashSet<Board>(50);
    Board dequeuedBoard = initial;
    Board previous = null;
    SearchNode dequeuedNode = new SearchNode(initial, 0, null);
    Iterable<Board> boards;

    while (!dequeuedBoard.isGoal()) {
        boards = dequeuedBoard.neighbors();
        moves++;

        for (Board board : boards) {
            if (!board.equals(previous) && !previouses.contains(board)) {
                minPQ.add(new SearchNode(board, moves, dequeuedNode));
            }
        }

        previouses.add(previous);
        previous = dequeuedBoard;
        dequeuedNode = minPQ.poll();
        dequeuedBoard = dequeuedNode.current;
    }
    finalNode = dequeuedNode;
}

// min number of moves to solve initial board
public int moves() {
    if (boards != null) return boards.size()-1;
    solution();
    return boards.size() - 1;
}

public Iterable<Board> solution() {
    if (boards != null) return boards;
    boards = new Stack<Board>();
    SearchNode pointer = finalNode;
    while (pointer != null) {
        boards.push(pointer.current);
        pointer = pointer.previous;
    }
    return boards;
}

private class SearchNode implements Comparable<SearchNode> {
    private final int priority;
    private final SearchNode previous;
    private final Board current;


    public SearchNode(Board current, int moves, SearchNode previous) {
        this.current = current;
        this.previous = previous;
        this.priority = moves + current.manhattan();
    }

    @Override
    public int compareTo(SearchNode that) {
        int cmp = this.priority - that.priority;
        return Integer.compare(cmp, 0);
    }


}
public static void main(String[] args) {
    int[][] tiles = {{4, 1, 3},
            {0, 2, 6},
            {7, 5, 8}};



    double start = System.currentTimeMillis();
    Board board = new Board(tiles);
    Solver solve = new Solver(board);
    System.out.printf("# of moves = %d && # of actual moves %d & time passed %f\n, ", solve.moves(), solve.moves, (System.currentTimeMillis() - start) / 1000);


}

        // TODO code application logic here
    

    
}
