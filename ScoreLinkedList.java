public class ScoreLinkedList{

    private GameLinkedList _scores;

    public ScoreLinkedList(){
	GameNode last = _scores.getLast();
	GameNode first = _scores.getFirst();
	_scores = new GameLinkedList();
	for (int i = 0; i < 10 ; i++){
            _scores.addLast(new GameEntry()); 
        }
        last.setNext(first);
        first.setPrevious(last); 
    }

    public boolean add(GameEntry entry){
        int N = _scores.size(); 
        GameNode current = _scores.getLast();
        if (entry.compareTo(current.getEntry()) <= 0){
            return false;
        }
	for(int i = N-1; i > 0; i--){
	    current.setValue(current.getPrevious().getEntry());
	    current = current.getPrevious();
	    if (entry.compareTo(current.getEntry()) < 0){
		current.getNext().setValue(entry);
		return true;
	    }
	}
	_scores.getFirst().setValue(entry);
	return true;
    }
    
    public void initialize(int len, int maxScore){
	for (int i = 0 ; i < _scores.size(); i++){
	    GameEntry entry = GameEntry.randomEntry(len, maxScore);
	    if (add(entry)){
		System.out.println("adding: " + entry);
	    }
	    else
		System.out.println(entry + " not added");
	}
    }

    public GameEntry getTopEntry(){
        return _scores.getFirst().getEntry();
    }


    public String toString(){
        String ans = "Rank\tInitials\tScore\n";
        int p = 1;
        GameNode current = _scores.getFirst();
        for (int i=0; i<_scores.size(); i++){
            ans += p++ + ".\t" + current.getEntry() + "\n";
            current = current.getNext();
        }
        return ans;
    }


    public static void main(String [] args){
        ScoresArray scores = new ScoresArray();
        System.out.println(scores);
        scores.initialize(3,10000);
	System.out.println();
        System.out.println(scores);
        scores.initialize(3,10000);
	System.out.println();
        System.out.println(scores);

    }

} //end

