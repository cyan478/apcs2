import java.util.ArrayList;

public class InsertionSort{
    
    //for arraylist
    public static void createList(ArrayList<String> sort, int N){
	for (int i = 0; i < N; i++)
	    sort.add(i+"");
	for (int i = 0; i < N/2; i++){
	    int r = (int)(Math.random() * N);
	    sort.set(i, sort.set(r, sort.get(i))); //shuffle
	}
    }

    //for dlinked
    public static void createDList1(ArrayList<String> rlist, DLinkedList dlist){
	for (int i = 0; i < rlist.size(); i++){
	    DNode a = new DNode(rlist.get(i), null, null);
	    dlist.addLast(a);
	}
    }

    /*
    public static void createDList2(ArrayList<String> rlist, DLinkedList dlist){
	for (int i = rlist.size()-1; i > -1; i--)
	    dlist.addFirst(rlist.get(i));
    }
    */

    //for arraylist
    public static void walkingDown(ArrayList<String> sort,int i){
	if (i <= 0) return;
	if (sort.get(i-1).compareTo(sort.get(i)) > 0){
	    sort.set(i, sort.set(i-1,sort.get(i)));
	    System.out.println(sort);
	    walkingDown(sort, i-1);
	}
    }

    //for arraylist
    public static void play(ArrayList<String> sort, int N){
	System.out.println("Random: " + sort);
	for (int i = 1; i < sort.size(); i++){
	    System.out.println("start pass: " + i + " " +sort );
	    System.out.println("walk down " + sort.get(i));
	    walkingDown(sort, i);
	}
    }

    public static void insertionSort(DLinkedList L){
        int N = L.size();
	DNode pivot = L.getFirst().getNext();
	for (int i = 1; i < N; i++){
	    DNode pivotNext = pivot.getNext();
	    DNode prev = pivot.getPrevious();
	    while (L.hasPrevious(prev) && 
		   pivot.getValue().compareTo(prev.getvalue()) < 0))
		prev = prev.getPrevious();
	    L.remove(pivot);
	    L.addAfter(prev, pivot);
	    pivot = pivot.getNext();
    }

    public static void main(String[] args){
	int N = Integer.parseInt(args[0]);
	ArrayList<String> sort = new ArrayList<String>();
	createList(sort, N);
	System.out.println("shuffled arraylist: " + sort);
	DLinkedList dlink1 = new DLinkedList();
	createDList1(sort, dlink1);
	System.out.println("Doubly linked list: " +dlink1);
	/* doesnt work ??
	DLinkedList dlink2 = new DLinkedList();
	createDList2(sort, dlink2);
	System.out.println("Doubly linked list: " + dlink2);
	*/
	insertionSort(dLink1);

	//play(sort, N);
    }

} //end
