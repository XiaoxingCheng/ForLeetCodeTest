package testLeetCode;

public class TestEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse";
		String word2 = "ros";
		int res = minDistance(word1,word2);
		System.out.println(res);
	}

	public static int minDistance(String word1, String word2) {
		if(word1==null||word2==null) return word1==null?word2.length():word1.length();
		int len1 = word1.length();
		int len2 = word2.length();
		int[][] dp = new int[len1+1][len2+1];
		for(int i = 0;i<len1+1;i++) {
			dp[i][0]=i;
		}
		for(int j = 0;j<len2+1;j++) {
			dp[0][j]=j;
		}
		for(int i = 1;i<len1+1;i++) {
			for(int j = 1;j<len2+1;j++) {
				if(word1.charAt(i-1)==word2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					//word1(0,i-1)和word2(0,j-1)匹配，则只需在words1的i替换
					int replace = dp[i-1][j-1];
					//word1(0,i-1)和word2(0,j)匹配，则只需将word1的i删除
					int delete = dp[i-1][j];
					//word1(0,i)和word2(0,j-1)匹配，则只需将word1的i插入j
					int insert = dp[i][j-1];
					dp[i][j]=Math.min(Math.min(replace, delete), insert)+1;
				}
			}
		}
		return dp[len1][len2];
	}
}
