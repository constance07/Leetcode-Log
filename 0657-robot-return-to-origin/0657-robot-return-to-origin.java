class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;

        for(char move: moves.toCharArray()){
            switch(move){
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
            }
        }

        if(u == d && l == r){
            return true;
        }

        return false;
        
    }
}