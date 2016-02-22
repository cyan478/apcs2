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

    private int [][] _board;
    private int _n;

    public EightQueens(){
	_board = new int [8][8];
	_n = 0;
    }

    public EightQueens(N){
	_board = new int [N][N];
	_n = 0;
    }

    public void solve(){
	int N = _board.length;
	for (int i = 0; i <= N / 2; i++){
	    for (int j = 0; j <= N / 2; j++){
		if (solve(i,j)) return;
	    }
	}
    }

    public boolean solve(int x, int y){
	try {
	    Thread.sleep(10); //1000 milliseconds is one second.
	} 
	catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	int N = _board.length;
	
	
    }
    



    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
	EightQueens q = new EightQueens(N);
	// System.out.println(q);
	q.solve();
	System.out.println(q);
	//}

    }


    




} //end
