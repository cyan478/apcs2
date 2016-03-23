public class GameNode{

    private GameEntry _entry;
    private GameNode _previous, _next;

    public GameNode(GameEntry entry, GameNode previous, GameNode next){
	_entry = entry;
	_previous = previous;
	_next = next;
    }

    public GameEntry getEntry(){
	return _entry;
    }

    public GameNode getNext(){
	return _next;
    }

    public GameNode getPrevious(){
	return _previous;
    }

    //modifier
    public GameEntry setValue(GameEntry x){
	GameEntry ans = getEntry();
	_entry = x;
	return ans;
    }
    public GameNode setNext(GameNode x){
	GameNode ans = getNext();
	_next = x;
	return ans;
    }
    public GameNode setPrevious(GameNode x){
	GameNode ans = getPrevious();
	_previous = x;
	return ans;
    }
    

}
