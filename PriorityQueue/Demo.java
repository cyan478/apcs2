import java.util.PriorityQueue;

public class Demo{
    
    //uses an aux priority queue to sort the list in non decreasing order.
    //O(NlogN)
    public static void pqSort(String[] list){
	PriorityQueue<String> q = new PriorityQueue<String>();
	for (String s: list) //O(n)
	    q.add(s); //O(log N)
	for (int i = 0; i < list.length; i++) //O(n)
	    list[i] = q.poll(); //ordering in list, O(log N)
    }

    public static void main(String[] args){
	String [] fruits = {"kiwi","pear","apple","banana","watermelon",
			    "grapes","cantalope","orange"};
	PriorityQueue<String> pq = new PriorityQueue<String>();
	for(String fruit: fruits)
	    pq.add(fruit);

	while (pq.size != 0){
	    System.out.println("peek: " + pq.peek());
	    System.out.println("remove: " + pr.poll());
	}
    }



} //end
