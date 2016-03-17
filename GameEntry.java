public class GameEntry implements Comparable{ //<GameEntry>, doesnt have to be obj

    private String _name;
    private int _score;

    public GameEntry(){
	_name = "AAA";
	_score = 0;
    }

    public GameEntry(String N, int S){
	_name = N;
	_score = S;
    }

    public String getName(){
	return _name;
    }

    public int getScore(){
	return _score;
    }
    
    public String toString(){
	return _name + " " + _score;
    }

    public int compareTo(Object other){
	GameEntry o = ((GameEntry)other); //casting
	if (this.getScore() == (o.getScore()))
	    return (this.getName().compareTo(o.getName()));
	return (this.getScore() - (o.getScore()));
    }

    public static void main(String[] args){
	//String N = args[0];
	//int S = Integer.parseInt(args[1]);
	//GameEntry a = new GameEntry("AAA", 1000);
	//GameEntry b = new GameEntry("AAA", 1000);
	//System.out.println(a.compareTo(b));
    }










} //end
