public class ProductionLine{

    private Queue<Disk> _assemblyLineIn;
    private Queue<Tower> _assemblyLineOut;
    private Tower _robotArm;

    public ProductionLine(int nDisks, int maxRadius){
	_assemblyLineIn = newQueue();
	while (nDisks != 0){
	    int r = (int)(Math.random()*maxRadius);
	    _assemblyLineIn.enqueue(r);
	    nDisks--;
	}
	_robotArm = new Tower();
	_assemblyLineOut = new Queue();
    }

    private void unloadRobot(){

    }

    public void process(){

    }


} //end
