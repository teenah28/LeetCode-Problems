class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            Integer count=map.get(num);
            if(count == null){
                map.put(num,1);
            }
            else{
                map.put(num,count+1);

            }
        }
        Set<Integer> freq=new HashSet<>();
        for(int f:map.values()){
            if(!freq.add(f)){
                return false;
            }
        }
        return true;
    }
}