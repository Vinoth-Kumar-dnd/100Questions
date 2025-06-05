package tpdf1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]words= {"i","like","sam","samsung","mango","cream","icecream"

	};
	
		
		String key ="ilikesamsung";

	      if (helper(key, words)) {
	            System.out.println("Yes, the word can be formed.");
	        } else {
	            System.out.println("No, the word cannot be formed.");
	        }

}
	
	static boolean helper(String key , String[]words) {
		
        if (key.length() == 0) return true;

        for (String word : words) {
            if (key.startsWith(word)) {
                String remaining = key.substring(word.length());
                if (helper(remaining, words)) {
                    return true;
                }
            }
        }

        return false;
    
		
	}
}
