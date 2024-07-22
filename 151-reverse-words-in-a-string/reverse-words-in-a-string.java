class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");

        StringBuilder rev = new StringBuilder();

        for(int i = word.length - 1; i>=0; i--){
            if(word[i].length() != 0){
                if(rev.length() != 0){
                    rev.append(" ");
                }
                rev.append(word[i]);
            }
        }
        return rev.toString();
    }
}