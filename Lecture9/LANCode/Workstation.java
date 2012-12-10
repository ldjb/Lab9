/*
The workstation class extends the class Node and inherits its methods.
It overwrites the receive() method. The workstation has an extra
method accept() as it is the only node that can accept packets and put
them on the LAN
*/

public class Workstation extends Node
{

	public Workstation(String name)
	{
		super(name);
	}

	public void accept(Packet p)
	{
		//Print a line between each new packet being traced
		System.out.println();
		this.receive(p);
	}

	/*
	This method allows the Packet to be forwarded to the next LAN-element
	on the network
	*/
	public void receive(Packet p)
	{
		String n = getName();

		if(!(n.equals(p.getFinalDestination())))
		{
			System.out.println(getName() + " throws the packet " + "\"" +
								p.getData() + "\"" + " on the LAN");
			Node next = this.getNextNode();
			System.out.println(this.getName() + " forwards the packet " + "\""
								+ p.getData() + "\"" + " to " + next.getName());

			next.receive(p);
		}
		else
		{
			System.out.println("The packet has reached its final destination: "
								+ p.getFinalDestination());
		}

	}

}