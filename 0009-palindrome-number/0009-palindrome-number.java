class Solution {
    public boolean isPalindrome(int x) {
        String xString = x + "";
        String xReversed = "";

        for(int i = xString.length() - 1; i >= 0; i--){xReversed += xString.charAt(i);}

        if(xString.equals(xReversed)){return true;}

        return false;
    }
}