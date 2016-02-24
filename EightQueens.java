/*
Consider the Eight (N) Queens problem. It requires determining the
various ways in which eight queens could be configured on a chessboard
so that none of them could capture any other queen. (The rules of 
chess allow a queen to move in an arbitrary number of squares in 
horizontal, vertical, or diagonal fashion.) The figure below illustrates
one such configuration.

-------q
---q----
q-------
--q-----
-----q--
-q------
------q-
----q---

Bulid a program to solve the Eight Queens problem.
*/

public class EightQueens{

    
    //Can you place a q in spot n?
    public static boolean availableSpot(int[] row, int n){
	for (int i = 0; i < n; i++){
	    if (row[i] == row[n]) //same column
		return false; 
	    if ((row[i] - row[n]) == (n-i)) //diagonal 1
		return false; 
	    if((row[n] - row[i]) == (n-i)) //diagonal 2
		return false;
	}
	return true;	    
    }

    //prints the board
    public static void printBoard(int [] row){
	int N = row.length;
	String tile = "";
	for (int i = 0; i < N; i++){
	    for (int j = 0; j < N; j++){
		if (row[i] == j) tile += "q";
		else tile += "-";
	    }
	    tile += "\n"; //new row
	}
	System.out.println(tile);
    }

    public static void solve(int [] row, int tile, int numOfRows){
	//try {
	//    Thread.sleep(10); //1000 milliseconds is one second.
	//	} 
	//catch(InterruptedException ex) {
	//    Thread.currentThread().interrupt();
	//}
	int N = numOfRows;
	if (tile == N) printBoard(row); //when you're finished, print
	else{
	    for (int i = 0; i < N; i++){ //for each space in the row
		row[tile] = i; //space in row = i
		if (availableSpot(row, tile)) //if there is space
		    solve(row, tile+1, N); //go to next branch (next space)
	    }
	}
    }

    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
        int [] board = new int[N];
        solve(board, 0, N);
    }

} //end
