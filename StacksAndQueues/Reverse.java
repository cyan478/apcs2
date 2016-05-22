import java.util.List;
import java.util.ArrayList;

public class Reverse{

    //generic method
    public static<E> void reverse(List<E> L){
	int N = L.size();
	Stack<E> s = new ArrayStack<E>(N);
	for (int i = 0; i < N; i++){
	    s.push(L.get(i)); //O(1) if L is ArrayList
	                      //O(N) if L is LinkedList
	}
	for (int i = 0; i < N; i++){
	    L.set(i, s.pop()); //O(1) if L is ArrayList
	                      //O(N) if L is LinkedList
	}
    }

    public static <E> boolean inStack(Stack<E> stack, E value){
	boolean ans = false;
	Stack<E> aux = new NodeStack<E>();
	while (!stack.isEmpty()){
	    if (value.equals(stack.top())){
		ans = true;
		break;
	    }
	    aux.push(stack.pop());
	}
	while (!aux.isEmpty())
	    stack.push(aux.pop());
	return ans;
    }

    public static void main(String[] args){
	ArrayList<Integer> L = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++)
	    L.add(i);
	System.out.println(L);
	reverse(L);
	System.out.println(L);
	
	ArrayList<String> L2 = new ArrayList<String>();
	String letters = "abcdefg";
	for (int i = 0; i < letters.length(); i++)
	    L2.add(letters.substring(i,i+1));
	System.out.println(L2);
	reverse(L2);
	System.out.println(L2);
    }





} //end
