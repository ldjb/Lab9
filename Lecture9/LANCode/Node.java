/*
Workstations, printservers and fileservers are all specific types of
nodes and so they inherit from this class
*/

public class Node
{private String uniqueName;
 private Node nextNode;

	public Node()
	{
		uniqueName = null;
	}

	public Node(String name)
	{
		uniqueName = name;
		System.out.println("Node \"" + uniqueName + "\" created");
	}

	/*
	This method creates a link between the current LAN-element and
	the next LAN-element.
	*/
	public void addlink(Node node)
	{
		nextNode = node;
	}

	/*
	This method allows the Packet to be forwarded to the next LAN-element
	on the network unless this LAN-element was its final destination
	*/
	public void receive(Packet p)
	{
		if(!(uniqueName.equals(p.getFinalDestination())))
		{
			System.out.println(this.getName() + " forwards the packet " + "\""
								+ p.getData() + "\"" + " to " + nextNode.getName());
			nextNode.receive(p);
		}
		else
		{
			System.out.println("The packet has reached its final destination: "
								+ p.getFinalDestination());
		}
	}


	//This method returns the unique name of a LAN-element
	public String getName()
	{
		return uniqueName;
	}

	//This method returns the next LAN-element
	public Node getNextNode()
	{
		return nextNode;
	}

}