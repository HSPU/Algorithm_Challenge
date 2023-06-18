class Solution {
    public int solution(int hp) {
        int hardAnt = 5;
        int normalAnt = 3;
        int easyAnt = 1;
        
        return hp / hardAnt + hp % hardAnt / normalAnt + hp % hardAnt % normalAnt / easyAnt;
    }
}