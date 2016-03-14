import java.util.ArrayList;

public class InsertionSort{

    public static void createList(ArrayList<Integer> sort, int N){
	for (int i = 0; i < N; i++)
	    sort.add(i);
	for (int i = 0; i < N/2; i++){
	    int r = (int)(Math.random() * N);
	    sort.set(i, sort.set(r, sort.get(i))); //shuffle
	}
    }

    public static void walkingDown(ArrayList<Integer> sort,int i){
	if (sort.get(i)

	    }

 
	public static void play(ArrayList<Integer> sort, int N){
	    createList(sort, N);
	    System.out.println("Random: " + sort);
	    for (int i = 0; i < sort.size(); i++){
		System.out.println("start pass: " + i + sort);
		System.out.println("walk down " + sort.get(i));
		//if (
	    }
	}

	public static void main(String[] args){
	    int N = Integer.parseInt(args[0]);
	    ArrayList<Integer> sort = new ArrayList<Integer>();
	
	}

} //end
