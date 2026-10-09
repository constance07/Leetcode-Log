class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();

        String noSpaceS = "";
        for(char c: lowerS.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                noSpaceS += c;
            }else if(Character.isDigit(c)){
                noSpaceS += c;
            }
        }

        System.out.println(noSpaceS);

        String reversedS = "";
        for(int i = noSpaceS.length() - 1; i >= 0; i--){
            reversedS += noSpaceS.charAt(i);
        }

        System.out.println(reversedS);
        if(reversedS.equals(noSpaceS)){return true;}

        return false;
    }
}