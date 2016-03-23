public class ScoresArray{
    
    private GameEntry[] _scores;
   

    public ScoresArray(){
	this(10);
    }

    public ScoresArray(int n){
	_scores = new GameEntry[n];
       	for (int i = 0; i < n ; i++)
	    _scores[i] = new GameEntry();
    }

    public void initialize(int len, int maxScore){
	for (int i = 0 ; i < _scores.length; i++){
	    GameEntry entry = GameEntry.randomEntry(len, maxScore);
	    
	    if (addV3(entry))
		System.out.println("adding: " + entry);
	    else
		System.out.println(entry + " not added");
	}
    }

    // Uses a linear search for the insertion point
    public boolean addV1(GameEntry entry){
	boolean ans = false;
	for (int i = 0; i < _scores.length; i++){
	    if (entry.compareTo(_scores[i]) > 0){
		GameEntry t = _scores[i];
		_scores[i] = entry;
		ans = true;
		entry = t;
	    }
	}
	return ans;
    }
    // Uses a linear search for the insertion point
    public boolean addV2(GameEntry entry){
	for (int i = 0; i < _scores.length; i++){
	    if (entry.compareTo(_scores[i]) > 0){
		GameEntry t = _scores[i];
		_scores[i] = entry;
		while ( ++i < _scores.length){
		    entry = t;
		    t = _scores[i];
		    _scores[i] = entry;
		}
		return true;
	    }
	}
	return false;
    }

    // starts linear search at the bottom 
    public boolean addV3(GameEntry entry){
	int N = _scores.length;
	if (entry.compareTo(_scores[N-1]) <= 0)
	    return false;
	for(int i = N-1; i > 0; i--){
	    _scores[i] = _scores[i-1];
	    if (entry.compareTo(_scores[i]) < 0){
		_scores[i] = entry;
		return true;
	    }
	}
	_scores[0] = entry;
	return true;
    }

    // use a modified binary search to find the insertion point
    public boolean addBS(GameEntry entry){
	return true;
    }


    
    public GameEntry getTopEntry(){
	return _scores[0];
    }



    public String toString(){
	String ans = "Rank\tInitials\tScore\n";
	int i = 1;
	for (GameEntry entry: _scores)
	    ans += i++ + ".\t" + entry + "\n";
	return ans;
    }


    public static void main(String [] args){
	ScoresArray scores = new ScoresArray();
	System.out.println(scores);
	scores.initialize(3,1000);
	System.out.println(scores);
	scores.initialize(3,1000);
	System.out.println(scores);
    }

}
