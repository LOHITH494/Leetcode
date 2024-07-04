class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int[] copy=Arrays.copyOf(arr,arr.length);
    Arrays.sort(copy);
    HashMap<Integer,Integer> hm=new HashMap<>();
    int rank=1;
    for(int i=0;i<arr.length;i++)
    {
        if(!hm.containsKey(copy[i]))
        hm.put(copy[i],rank++);
    }
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=hm.get(arr[i]);
    } 
    return arr;   
    }
}