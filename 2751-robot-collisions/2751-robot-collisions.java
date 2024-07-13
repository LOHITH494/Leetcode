class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length,robots[][]=new int[n][3];
        for(int i=0;i<n;i++){
            if(directions.charAt(i)=='L')positions[i]=-positions[i];
            robots[i][0]=positions[i];
            robots[i][1]=healths[i];
            robots[i][2]=i;
        }
        Arrays.sort(robots,(a,b)->Math.abs(a[0])-Math.abs(b[0]));
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            if(robots[i][0]>0)stk.push(i);
            else{
                while(!stk.isEmpty() && robots[stk.peek()][0]>0 && robots[stk.peek()][1]< robots[i][1]){
                        stk.pop();
                        robots[i][1]--;
                }
                if(!stk.isEmpty() && robots[stk.peek()][0]>0 && robots[stk.peek()][1] == robots[i][1] )stk.pop();
                else if(!stk.isEmpty() && robots[stk.peek()][0]>0 && robots[stk.peek()][1] > robots[i][1] )robots[stk.peek()][1]--;
                else stk.push(i);
            }
                
        }
        int i=0,arr[][]=new int[stk.size()][2];
        while(!stk.isEmpty()){
            arr[i][0]=robots[stk.peek()][1];
            arr[i++][1]=robots[stk.pop()][2];
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        List<Integer>res=new ArrayList<>();
        for(int a[]:arr)res.add(a[0]);
        return res;
    }
}