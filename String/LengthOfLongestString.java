class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int maxlength=0;
        for(int i=0; i<s.length()-1; i++){
           char c=s.charAt(i);
           for(int j=count; j<i; j++){
               if(s.charAt(j)==c){
                   count=j+1;
                   break;
               }

           }
             maxlength=Math.max(maxlength,i-count+1);   
               
           }

    
       
     return maxlength ;
    }
}
