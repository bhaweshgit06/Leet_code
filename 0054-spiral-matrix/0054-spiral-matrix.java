class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> ans = new ArrayList<>();
     int n = matrix.length;
     int m = matrix[0].length;
     int colStart = 0 , rowStart = 0;
     int count = 0;
        int max = m*n;
        while(count< max){
 //left to right
 for(int i = colStart; i< m && count< max ; i++){
ans.add(matrix[rowStart][i]);
count++;
}rowStart++;
//top to down
for(int i = rowStart ; i< n && count< max; i++){
    ans.add(matrix[i][m-1]);
    count++;
}m--;

//right to left
for(int i = m-1; i>= colStart && count< max ;i--){
    ans.add(matrix[n-1][i]);
    count++;
}n--;

//bottom to top
for(int i = n-1; i>= rowStart && count< max; i--){
    ans.add(matrix[i][colStart]);
    count++;
}colStart++;

  }
  return ans;
    }
}