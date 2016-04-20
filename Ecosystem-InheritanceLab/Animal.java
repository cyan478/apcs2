public class Animal{
    
    protected int _index;

    public Animal(int i){
	_index = i; 
    }

    public Animal mate(Animal a, int i){
	return new Animal(i);
    }


} //end
