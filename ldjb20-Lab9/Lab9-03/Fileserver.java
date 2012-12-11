public class Fileserver extends Node {

	public Fileserver(String name) {
		super(name);
	}
	
	public void receive(Packet p) {
		String n = getName();
		if(!(n.equals(p.getFinalDestination()))) {
		}
		else {
		}
	}

}