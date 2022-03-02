/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueensproblem;

/**
 *
 * @author anhhuynh
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class nQueens {

    /**
     * @param args the command line arguments
     */
    public static int TOT_QUEEN = 8;

private int[][] arr;

private int[] posit;
    public static void main(String[] args) {

boolean flag = true;

int counts = 0;

while (flag) {

nQueens arr = new nQueens(

new int[TOT_QUEEN][TOT_QUEEN], new int[8]);

arr.placingQ();

System.out.println("Trial #: " + (counts+1));

System.out.println("Original Pairs:");

arr.displayBoard();

System.out.println("# Pairs of queens attacking each other: "

+ arr.heights() + "\n");

int locMinimum = arr.heights();

boolean flag1 = false;

int[] arr1 = new int[8];

for (int y = 0; y < arr.arr.length; y++) {

System.out.println("Iterating through COLUMN " + y + ":");

flag1 = false;

for (int x = 0; x < arr.arr.length; x++) {

if (x != arr.posit[y]) {

arr.mvQ(x, y);

arr.displayBoard();

System.out.println();

if (arr.heights() < locMinimum) {

flag1 = true;

locMinimum = arr.heights();

arr1[y] = x;

}

arr.reset(x, y);

}

}

arr.boardReset(y);

if (flag1) {

arr.placingBestQueens(y, arr1[y]);

System.out.println("Best pairs found this iteration: ");

arr.displayBoard();

System.out.println("# Pairs of queens attacking each other: "
        + arr.heights() + "\n");

}
else {

System.out.println("No better pairs found.");

arr.displayBoard();

System.out.println("# Pairs of queens attacking each other: "

+ arr.heights() + "\n");

}

}

if (arr.heights() == 0)

flag = false;

counts++;

if (counts == 6) {

flag = false;

}

System.out.println("Done in " + (counts-1) + " restarts.");

}

}

public nQueens(int[][] arr, int[] positions) {

this.arr = arr;

this.posit = positions;

}

private int[] generatingQ() {

List<Integer> rPos = new ArrayList<Integer>();

Random rand = new Random();

for (int x = 0; x < TOT_QUEEN; x++) {

rPos.add(rand.nextInt(8));

}

int[] randomPositions = new int[TOT_QUEEN];

for (int x = 0; x < rPos.size(); x++) {

randomPositions[x] = rPos.get(x);

}

return randomPositions;

}

public void placingQ() {

posit = generatingQ();

for (int x = 0; x < arr.length; x++) {

arr[posit[x]][x] = 1;

}

}

public int heights() {

int totPair = 0;

for (int x = 0; x < arr.length; x++) {

ArrayList<Boolean> arrList = new ArrayList<Boolean>();

for (int y = 0; y < arr[x].length; y++) {

if (arr[x][y] == 1) {

arrList.add(true);

}

}

if (arrList.size() != 0)

totPair = totPair + (arrList.size() - 1);

}

int r = arr.length;

int c = arr.length;

int maximum = r + c - 2;

for (int addition = 0; addition <= maximum; addition++) {

ArrayList<Boolean> arrList = new ArrayList<Boolean>();

for (int x = 0; x < r; x++) {

for (int y = 0; y < c; y++) {

if (x + y - addition == 0) {

if (arr[x][y] == 1) {

arrList.add(true);

}

}

}

}

if (arrList.size() != 0)

totPair = totPair + (arrList.size() - 1);

}

int arrList = chckMirrors();

return totPair + arrList;

}

private int chckMirrors() {

int[] arr1 = { arr[7][0] };

int[] arr2 = { arr[7][1], arr[6][0] };

int[] arr3 = { arr[7][2], arr[6][1], arr[5][0] };

int[] arr4 = { arr[7][3], arr[6][2], arr[5][1], arr[4][0] };

int[] arr5 = { arr[7][4], arr[6][3], arr[5][2], arr[4][1],

arr[3][0] };

int[] arr6 = { arr[7][5], arr[6][4], arr[5][3], arr[4][2],

arr[3][1], arr[2][0] };

int[] arr7 = { arr[7][6], arr[6][5], arr[5][4], arr[4][3],

arr[3][2], arr[2][1], arr[1][0] };

int[] arr8 = { arr[7][7], arr[6][6], arr[5][5], arr[4][4],

arr[3][3], arr[2][2], arr[1][1], arr[0][0] };

int[] arr9 = { arr[6][7], arr[5][6], arr[4][5], arr[3][4],

arr[2][3], arr[1][2], arr[0][1] };

int[] arr10 = { arr[5][7], arr[4][6], arr[3][5], arr[2][4],

arr[1][3], arr[0][2] };

int[] arr11 = { arr[4][7], arr[3][6], arr[2][5], arr[1][4],

arr[0][3] };

int[] arr12 = { arr[3][7], arr[2][6], arr[1][5], arr[0][4] };

int[] arr13 = { arr[2][7], arr[1][6], arr[0][5] };

int[] arr14 = { arr[1][7], arr[0][6] };

int[] arr15 = { arr[0][7] };

int totPair = 0;

totPair += chckHorizontal(arr1);

totPair += chckHorizontal(arr2);

totPair += chckHorizontal(arr3);

totPair += chckHorizontal(arr4);

totPair += chckHorizontal(arr5);

totPair += chckHorizontal(arr6);

totPair += chckHorizontal(arr7);

totPair += chckHorizontal(arr8);

totPair += chckHorizontal(arr9);

totPair += chckHorizontal(arr10);

totPair += chckHorizontal(arr11);

totPair += chckHorizontal(arr12);

totPair += chckHorizontal(arr13);

totPair += chckHorizontal(arr14);

totPair += chckHorizontal(arr15);

return totPair;

}

public void mvQ(int row, int col) {

arr[posit[col]][col] = 2;

arr[row][col] = 1;

}

private int chckHorizontal(int[] b) {

int totPair = 0;

ArrayList<Boolean> arrList = new ArrayList<Boolean>();

for (int x = 0; x < b.length; x++) {

if (b[x] == 1)

arrList.add(true);

}

if (arrList.size() != 0)

totPair = (arrList.size() - 1);

return totPair;

}

public void reset(int row, int col) {

if (arr[row][col] == 1)

arr[row][col] = 0;

}

public void boardReset(int col) {

for (int x = 0; x < arr.length; x++) {

if (arr[x][col] == 2)

arr[x][col] = 1;

}

}

public void placingBestQueens(int col, int queenPos) {

for (int x = 0; x < arr.length; x++) {

if (arr[x][col] == 1)

arr[x][col] = 2;

}

arr[queenPos][col] = 1;

for (int x = 0; x < arr.length; x++) {

if (arr[x][col] == 2)

arr[x][col] = 0;

}

}

public void displayBoard() {

for (int x = 0; x < arr.length; x++) {

for (int y = 0; y < arr[x].length; y++) {

System.out.print(arr[x][y] + " ");

}

System.out.println();

}

}


    
    
}
