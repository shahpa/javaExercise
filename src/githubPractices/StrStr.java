package githubPractices;

public class StrStr {

	public static void main(String[] args)  {
		System.out.println(strStr2("a", "aaa"));
	}
	
	public static int strStr(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length())  {
		    	  return i;
		      }
		      if (i + j == haystack.length())  {
		    	  return -1;
		      }
		      if (needle.charAt(j) != haystack.charAt(i + j))  {
		    	  break;
		      }
		    }
		  }
		}
	
	public static int strStr2(String h, String n)  {
		if(h == null || n == null)  {
			return 0;
		}
		if(n.length() == 0)  {
			return 0;
		}
		for(int i = 0 ; i< h.length(); i++)  {
			if(h.length() < n.length())  {
				return -1;
			}
			int m = i;
			for(int j = 0 ; j < n.length(); j++)  {
				if(h.charAt(m) == n.charAt(j))  {
					if(j == (n.length() -1))  {
						return i;
					}
					m++;
				}
				else {
						break;
					}
				
				
			}
		}
		return -1;
	}
}
