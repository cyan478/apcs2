import java.util.ArrayList;

public class InsertionSort{

    public static void createList(ArrayList<String> sort, int N){
	for (int i = 0; i < N; i++)
	    sort.add(i+"");
	for (int i = 0; i < N/2; i++){
	    int r = (int)(Math.random() * N);
	    sort.set(i, sort.set(r, sort.get(i))); //shuffle
	}
    }

    public static void walkingDown(ArrayList<String> sort,int i){
	if (i <= 0) return;
	if (sort.get(i-1).compareTo(sort.get(i)) > 0){
	    sort.set(i, sort.set(i-1,sort.get(i)));
	    System.out.println(sort);
	    walkingDown(sort, i-1);
	}
    }

 
    public static void play(ArrayList<String> sort, int N){
	createList(sort, N);
	    System.out.println("Random: " + sort);
	    for (int i = 1; i < sort.size(); i++){
		System.out.println("start pass: " + i + " " +sort );
		System.out.println("walk down " + sort.get(i));
	        walkingDown(sort, i);
	    }
	}

	public static void main(String[] args){
	    int N = Integer.parseInt(args[0]);
	    ArrayList<String> sort = new ArrayList<String>();
	    play(sort, N);
	}

} //end
