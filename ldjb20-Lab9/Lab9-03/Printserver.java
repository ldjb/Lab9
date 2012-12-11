/*
The printserver class extends the class Node and inherits its methods.
It overwrites the receive() method as it calls a method to print the
data to standard output.
*/

public class Printserver extends Node
{

	public Printserver(String name)
	{
		super(name);
	}

	/*
	This method receives the packet and forwards it to the next LAN-element
	in the network unless this is its final destination in which case it call
	the printContents method
	*/
	public void receive(Packet p)
	{
		String n = getName();
		if(!(n.equals(p.getFinalDestination())))
		{
			Node next = this.getNextNode();
			System.out.println(this.getName() + " forwards the packet " + "\"" +
								p.getData() + "\"" + " to " + next.getName());

			next.receive(p);
		}
		else
		{
			System.out.println("The packet has reached its final destination: "
								+ p.getFinalDestination());
			printContents(p);
		}

	}

	// Prints the contents of the packet to standard output
	public void printContents(Packet p)
	{
		System.out.println("The content of the packet is: " + p.getData());

	}
}
