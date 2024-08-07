class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> lost=new HashMap<>();  //key: player no and value:no of losses
        for(int[] it:matches){
            int lose=it[1];
            lost.put(lose,lost.getOrDefault(lose,0)+1);
        }
        List<Integer> notlost=new ArrayList<>();
        List<Integer> oneloss=new ArrayList<>();
        for(int[] it:matches){
            int lose=it[1];
            int win=it[0];
            if(lost.get(lose)==1){
                oneloss.add(lose);
            }
            if(!lost.containsKey(win)){
                notlost.add(win);
                lost.put(win,2);
            }
        }
        Collections.sort(notlost);
        Collections.sort(oneloss);

        return Arrays.asList(notlost,oneloss);
    }
}