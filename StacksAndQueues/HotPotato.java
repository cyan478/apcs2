public class HotPotato{

    public static boolean isChosen(int NumPlayers){
	boolean ans = false;
	int N = (int)(Math.random() * NumPlayers);
	if (N == 0)
	    ans = true;
	return ans;
    }

    public void play(NodeQueue circle, int numPlayers, E current, int round){
	System.out.println("Round #" + round + ": " + circle);
	for (int i = 0; i < numPlayers; i++){
	    current = circle.dequeue();
	    if (isChosen(numPlayers)){
		round++;
		break;
	    }
	    else
		
		
	}
    }

    

    public static void main(String[] args){
	NodeQueue circle = new NodeQueue<String>();
	circle.enqueue("a");
	circle.enqueue("b");
	circle.enqueue("c");
	circle.enqueue("d");
	circle.enqueue("e");
	circle.enqueue("f");
	circle.enqueue("g");
	System.out.println("Circle: " + circle);
	play(circle, circle.front(), circle.size(), 0);
    }

} //end
