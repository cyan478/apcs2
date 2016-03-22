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
	GameEntry current = entry;
	for (int i = 0; i < _scores.length; i++){
	    if (current.compareTo(_scores[i]) > 0){
		GameEntry temp = current;
		current = _scores[i];
		_scores[i] = temp;
	    }
	}
	return current != entry;
    }

    public void initialize(int maxScore, int len){
	for (int i = 0; i < _scores.length; i++){
	    GameEntry entry = GameEntry.randomEntry(maxScore,len);
	    if(add(entry)
		
]

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
	ScoresArray s = new ScoresArray();
	//System.out.println("scores: " + s.numScores());
	//System.out.println("top entry: " + s.topEntry());
	//System.out.println(s.toString());
	GameEntry b = GameEntry.randomEntry(2000,3);
	s.add(b);
	System.out.println(s);
    }



} //end
