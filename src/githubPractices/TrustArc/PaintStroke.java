package githubPractices.TrustArc;

public class PaintStroke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = null;
		Solution solutionObj = new Solution();
		System.out.println(solutionObj.solution(A));
		System.out.println(solutionObj.solution(955));
	}

}

class Solution  {
	public int solution(int[] A)  {
		int currentLevel=0;
		int strokes=0;
		if(A == null ||A.length == 0)  {
			return -1;
		}
		for(int i : A )  {
			if(i > currentLevel)  {
				strokes = strokes + (i-currentLevel);
				currentLevel = i;
			}
			
			else if(i < currentLevel)  {
				currentLevel = i;
			}
			
			if(strokes > 1000000000)  {
				return -1;
			}
		}
		
		
		return strokes;
		
	}
	
	int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }
}
