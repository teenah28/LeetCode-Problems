class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        if(matrix.length ==0 || matrix[0].length == 0) return result;
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        int dir=0;
        while(top <=bottom && left<= right){
            if(dir==0){  //left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            dir= (dir+1)%4;
        }
        return result;
    }
}