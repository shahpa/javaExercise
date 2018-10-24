package githubPractices.hashmap;

public class HashmapImpl implements MyHashmap{

	private final int ARRAY_MAX_SIZE = 10;
	private Node[] nodeArray = new Node[ARRAY_MAX_SIZE];
	
	@Override
	public void put(String key, String value) {
		int hashcode = key.hashCode() % ARRAY_MAX_SIZE;
		
		Node node = new Node(key, value);
		if(nodeArray[hashcode] == null)  {
			nodeArray[hashcode] = node;
		}  else  {
			Node currentNode = nodeArray[hashcode];
			while(currentNode.getNext() != null)  {
				if(currentNode.getKey().equals(key))  {
					currentNode.setValue(value);
					return;
				}
				currentNode = currentNode.getNext();
			}
			
			currentNode.setNext(node);
		}
		
	}

	@Override
	public String get(String key) {
		int hashcode = key.hashCode() % ARRAY_MAX_SIZE;
		Node node = nodeArray[hashcode];
		while(node != null)  {
			if(node.getKey().equals(key))  {
				return node.getValue();
			}
			node = node.getNext();
		}
		return "";
	}

}
