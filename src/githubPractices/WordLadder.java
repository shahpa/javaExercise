package githubPractices;

import java.util.*;

public class WordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		String[] distArray = {"hot","dot","dog","lot","log"};
		Set<String> dist = new HashSet<String>();
		
		for(int i = 0; i< distArray.length; i++)  {
			dist.add(distArray[i]);
		}
		
		int result = ladderLength(start, end, dist);
		System.out.println(result);
	}

	private static int ladderLength(String start, String end, Set<String> dist) {
		// TODO Auto-generated method stub
		
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(start, 1));
		
		dist.add(end);
		
		while(!queue.isEmpty())  {
			WordNode top = queue.remove();
			String word= top.word;
			
			if(word.equals(end))  {
				return top.numSteps;
			}
			
			char[] arr = word.toCharArray();
			for(int i=0; i<arr.length; i++)  {
				for(char c='a';c<='z'; c++)  {
					char temp = arr[i];
					if(arr[i]!=c)  {
						arr[i]=c;
					}
					
					String newWord = new String(arr);
					if(dist.contains(newWord))  {
						queue.add(new WordNode(newWord, top.numSteps+1));
						dist.remove(newWord);
					}
					
					arr[i]=temp;
				}
			}
		}
		return 0;
	}
}

class WordNode  {
	String word;
	int numSteps;
	
	public WordNode(String word, int numSteps)  {
		this.word = word;
		this.numSteps = numSteps;
	}
}


