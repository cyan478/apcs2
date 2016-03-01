public class DLinkedList{

    private int _size;
    private DNode _header, _trailer;

    public DLinkedList(){
	_size = 0;
	_header = new DNode(null,null,null);
	_trailer = new DNode(null,null,null);
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	if (_header.getNext() == _trailer) return true;
	return false;
    }

    public DNode getFirst(){
	if (isEmpty()) throw new IllegalStateException();
	return _header.getNext();
    }

    public DNode getLast(){
	if (isEmpty()) throw new IllegalStateException();
	return _trailer.getPrevious();
    }




    

} //end
