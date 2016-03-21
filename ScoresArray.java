public class ScoresArray{

    private GameEntry[] _scores;

    public ScoresArray(int n){
	_scores = new GameEntry[n];
	for (int i = 0; i < n; i++)
	    _scores[i]= new GameEntry();
    }

    public ScoresArray(){
	this(10);
    }

    public int numScores(){
	return _scores.length;
    }

    public GameEntry topEntry(){
	return _scores[0];
    }

    public boolean add(GameEntry entry){
	int newScore = entry.getScore();
	int storedEntry = entry;
	for (int i = 0; i < _numScores(); i++){
	    int currentScore = _score[i];
	    if (currentScore - newScore < 0){
		storedEntry = _score[i];
	        break;
	    }
	    return false;
	}
	for (int i = numScore
	    
    }

    public String toString(){
	String ans = "";
        ans += "Rank\tInitials\tScore\n";
        for (int i = 1; i <= _scores.length; i++){
	    ans += i + ".";
	    ans += "\t" + _scores[i-1];
	    ans += "\n";
	}
	return ans;
    }

    public static void main(String[] args){
	ScoresArray a = new ScoresArray();
	System.out.println("scores: " + a.numScores());
	System.out.println("top entry: " + a.topEntry());
	System.out.println(a.toString());
    }



} //end
