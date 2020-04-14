package ds.demo.problemSolving;

public class Demo {
	
	public static boolean solution(String S) {
		int length=S.length();
		int stringB=0,foundA=0;
		int stringA=0,foundB=0;
		boolean flag=false;
		for(int i=0;i<length;i++){
			char character=S.charAt(i);			
			if(character=='a'){
				stringA++;
			}
			if(character=='b'){
				stringB++;
			}
			if(S.startsWith("a")){
				if(S.charAt(i)=='b'){
					foundB++;	
					flag=true;
				}
				if(S.charAt(i)=='a' && foundB>0){
					foundA++;
					flag=false;
				}
			}
		}
		if(stringA==length){
			flag=true;
		}
		if(stringB==length){
			flag=true;
		}
		
		return flag;
    }
	
	public static void main(String args[]){
		String s="aaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbba"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbb           bbbbbbbbbbbbbbbbbbbbbbbbbbbbb aaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbb"
				+ "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaabbbbbbbbaaaaaaaaaaaaabbbbbbbbbbbbaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
				+ "bbbbbbbbb bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa bbbbbbbbbbbbbbaaaaaaaaaaaaaabbbbbbbbbbbbbaaaabababababababba";
		System.out.println(solution(s));
	}
}
