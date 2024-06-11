class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer,Integer> hm= new HashMap<>();
        for(int num:arr1) 
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int[] result=new int[arr1.length];
        int idx=0;
        for(int num:arr2) {
            if(hm.containsKey(num)) 
            {
                int count=hm.get(num);
                while(count>0) 
                {
                    result[idx++]=num;
                    count--;
                }
                hm.remove(num);
            }
        }
        List<Integer> rem= new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:hm.entrySet()) 
        {
            int count =entry.getValue();
            while(count>0) 
            {
                rem.add(entry.getKey());
                count--;
            }
        }
        Collections.sort(rem);
        for (int num:rem) 
        {
            result[idx++]=num;
        }
        return result;   
    }
}