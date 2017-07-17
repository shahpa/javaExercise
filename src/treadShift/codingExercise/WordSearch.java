package treadShift.codingExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch {

	static Set<String> result = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] DEFAULT_PUZZLE = new String[] {

			   		"akjbvaijdsbvxdxdbv",

			    	"fjslkdfadsnaxtxlfa",

			       "asdfasdfsdfaxrxads",

			       "ckvsadfgfgjavaxajd",

			       "akjbvaijdsbvxdxdbv",

			       "cbvqiejdbfqixexqib",

			       "asdjnaquekjdwdfabd",

			       "psdkxwordxkgrtuabd",

			       "psdjnaquekjfghbdbd",

			       "lsewdfldfjdsfewrkf",

			       "esxshiftxejdccgabd",

			    };
		char [][] board = populateMatrixBoard(DEFAULT_PUZZLE);
		/**
		 * Assumptions
		 * We have a dictionary in the form of List<String>
		 * For easy understanding I am generating my own dictionary
		 * All dictionary letters must be in lower case
		 * The input matrix must be in lower case
		 * The original input matrix had '_', but I have replaced it with an alphabet
		 */
		List<String> dictionary = new ArrayList<String>();
		dictionary.add("treadshift");
		dictionary.add("java");
		dictionary.add("shift");
		dictionary.add("as");
		dictionary.add("apple");
		dictionary.add("pie");
		dictionary.add("sad");
		dictionary.add("word");
		
		WordSearchLogic wordObj = new WordSearchLogic();
		List<String>result1 =  wordObj.findWord(board, dictionary);
		System.out.println(result1.toString());
	}

	private static char[][] populateMatrixBoard(String[] dEFAULT_PUZZLE) {
		// TODO Auto-generated method stub
		char [][] board = new char[dEFAULT_PUZZLE.length][dEFAULT_PUZZLE[0].length()];
		for(int i = 0 ; i < dEFAULT_PUZZLE.length; i++)  {
			for(int j=0; j<dEFAULT_PUZZLE[i].length(); j++)  {
				board[i][j] = dEFAULT_PUZZLE[i].charAt(j);
			}
		}
		return board;
	}

}
