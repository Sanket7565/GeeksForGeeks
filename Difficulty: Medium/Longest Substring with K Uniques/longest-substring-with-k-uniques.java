class Solution {
    public int longestKSubstr(String s, int k) 
    {
        int low=0;
        int maxLength=-1;
        
        Map<Character,Integer> frequencyMap=new HashMap<>();
        
        for(int high=0;high<s.length();high++)
        {
           char currentChar= s.charAt(high);
           
           frequencyMap.put(currentChar,frequencyMap.getOrDefault(currentChar,0)+1);
           
           
           if(frequencyMap.size()==k)
           {
               maxLength=Math.max(maxLength,high-low+1);
           }
           
           while(frequencyMap.size()>k)
           {
               char leftChar= s.charAt(low);
               frequencyMap.put(leftChar,frequencyMap.get(leftChar)-1);
               
               if(frequencyMap.get(leftChar)==0)
               {
                   frequencyMap.remove(leftChar);
               }
               
               low++;
           }
            
        }
        
        return maxLength;
        
    }
}