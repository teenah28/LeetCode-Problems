class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char currfirst=s.charAt(start);
            char currlast= s.charAt(end);
            if(!Character.isLetterOrDigit(currfirst)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currlast)){
                end--;
            }
            else{
                if(Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}