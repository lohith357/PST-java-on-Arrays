class Solution {
    public int largestAltitude(int[] gain) {
        int currentaltitude=0;
        int highestpoint=0;
        for(int altitudegain:gain){
            currentaltitude=currentaltitude+altitudegain;
            if(currentaltitude>highestpoint){
                highestpoint=currentaltitude;
            }
        }
        return highestpoint;
    }
}