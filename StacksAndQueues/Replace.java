public class Replace{

    public static<E> void replace (Queue<E> q, E oldValue, E newValue){
	int N = q.size();
	for (int i = 0; i < q.size(); i++){
	    E entry = q.dequeue();
	    if (entry.equals(oldValue))
		q.enqueue(newValue);
	    else
		q.enqueue(entry);
	}
    }

    public static void main(String[] args){
	Queue<String> q = new NodeQueue<String>();
	String data = "abcabcabc";
	for (int i = 0; i < data.length(); i++)
	    q.enqueue(data.substring(i,i+1));
	System.out.println("Queue: " + q);
	replace (q,"a","x");
	replace(q,"b","y");
	replace(q,"c","z");
	System.out.println("Queue changed: " + q);
    }

} //end
