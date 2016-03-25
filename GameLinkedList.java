//Modified DLinkedList.java for Game

public class GameLinkedList{
    
    private GameNode _header, _trailer;  // dummy (sentinel) nodes
    private int _size;

    public GameLinkedList(){
        _header = new GameNode(null, null, null);
        _trailer = new GameNode(null,_header, null);
        _header.setNext(_trailer);
        _size  = 0;
    }

    public int size(){
        return _size;
    }
    
    public boolean isEmpty(){
        return _size == 0;
    }
    
    public GameNode getFirst(){
        if (isEmpty()) throw new IllegalStateException();
        return _header.getNext();
    }
    
    public GameNode getLast(){
        if (isEmpty()) throw new IllegalStateException();
        return _trailer.getPrevious();
    }
    
    public GameNode getPrevious(GameNode current){
        if (current == _header)
            throw new IllegalArgumentException();
        return current.getPrevious();
    }
    
    public GameNode getNext(GameNode current){
        if (current == _trailer)
            throw new IllegalArgumentException();
        return current.getNext();
    }

    public void addBefore(GameNode b, GameNode a){
        GameNode prevB = getPrevious(b); // throws exception

        a.setNext(b);
        a.setPrevious(prevB);
        b.setPrevious(a);
        _size++;
    }
    
    public void addLast(GameNode node){
        addBefore(_trailer, node);
    }
    
    public void addLast(GameEntry value){
        addLast(new GameNode(value,null,null));
    }

    public void addAfter(GameNode a, GameNode b){
        GameNode afterA = getNext(a);
        a.setNext(b);
        b.setPrevious(a);
        afterA.setPrevious(b);
        b.setNext(afterA);
        _size++;
    }
    
    public void addFirst(GameNode current){
        addAfter(_header,current);
    }
    
    public void addFirst(GameEntry value){
        addFirst(new GameNode(value,null,null));
    }
    
    public GameEntry get(int i){
        if (i < 0 || i >= size())
            throw new IndexOutOfBoundsException();
        GameNode current = null;
        if ( i < size() / 2){
            current = _header;
            for (int j = 0; j <= i ; j++){
                current = current.getNext();
                System.out.print("h");
            }
        }
        else{
            current = _trailer;
            for (int j = 0; j < size() - i; j++){
                current = current.getPrevious();
                System.out.print("t");
            }
        }
        return current.getEntry();
    }

    public void remove(GameNode v){
        GameNode prev = getPrevious(v);
        GameNode next = getNext(v);
        prev.setNext(next);
        next.setPrevious(prev);
        _size--;
        // unlink the node
        v.setPrevious(null);
        v.setNext(null);
    }

    public GameEntry removeFirst(){
        GameEntry ans = getFirst().getEntry();
        remove(getFirst());
        return ans;
    }
    public GameEntry removeLast(){
        GameEntry ans = getLast().getEntry();
        remove(getLast());
        return ans;
    }
    
    
    public boolean hasPrevious(GameNode v){
        return v != _header;
    }
    
    public boolean hasNext(GameNode v){
        return v != _trailer;
    }
    
    public GameNode middleNode(){
        if (isEmpty()) throw new IllegalStateException();
        return isMid(_header,_trailer);
    }
    
    public GameNode isMid(GameNode x, GameNode y){
        if (x == y || getNext(x) == y) return y;
        return isMid(getNext(x), getPrevious(y));
    }
    
    public GameNode middleNode2(){
        if (isEmpty()) throw new IllegalStateException();
        GameNode a = _header;
        GameNode b = _trailer;
        while (true){
            if (a == b) return a;
            a = getNext(a);
            if (a == b) return a;
            b = getPrevious(b);
        }
    }
    
    public String toString(){
        String ans = "";
        GameNode current = _header.getNext();
        while (current != _trailer){
            ans += current.getEntry().toString() + ", ";
            current = current.getNext();
        }
        int len = ans.length();
        if (len > 0) ans = ans.substring(0,len - 2);
        ans = "[" + ans + " ]";
        return ans;
    }

} //end
