class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> arr=new ArrayList<>();
        arr.add(new int[]{intervals[0][0],intervals[0][1]});
        int n=intervals.length;
        for(int i=1;i<n;i++){
            int st=intervals[i][0];
            int end=arr.get(arr.size()-1)[1];
            if(end>=st){
                arr.get(arr.size()-1)[1]=Math.max(intervals[i][1],arr.get(arr.size()-1)[1]);
            }
            else{
                arr.add(new int[]{intervals[i][0],intervals[i][1]});
            }
            
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
