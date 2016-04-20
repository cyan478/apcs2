public class Ecosystem{
    
    public Animal[] river;
    
    public Ecosystem(){
	river = new Animal[10];
    }

    public void populate(){
	for (int i = 0; i < river.length; i++){
	    int r = (int)(Math.random()*3);
	    if (r == 0)
		river[i] = null;
	    if (r == 1)
		river[i] = new Bear(i);
	    if (r == 2)
		river[i] = new Fish(i);
	}
    }

    public String toString(){
	String ans = "[";
	ans += river[0];
	for (int i = 1; i < river.length; i++)
	    ans += ", " + river[i];
	ans += "]";
	return ans;
    }

    public static void main(String[] args){
	Ecosystem a = new Ecosystem();
	a.populate();
	System.out.println(a);
    }



} //end
