package Chapter_1;

import java.util.Arrays;

public class Rotate_Matrix {

    public static void main(String[] args){
        int[][] ori_matrix = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int[][] rotate_matrix = {{4,8,12,16},{3,7,11,15},{2,6,10,14},{1,5,7,13}};

        rotation(ori_matrix);

        System.out.println(Arrays.equals(ori_matrix, rotate_matrix));

    }

    private static void rotation(int[][] ori_matrix){
        int n = ori_matrix.length;

        for(int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first; //0 //1

                int top = ori_matrix[first][i]; // 1 , 2

                ori_matrix[first][i] = ori_matrix[i][last]; // [0,0] -> [0,3]

                ori_matrix[i][last] = ori_matrix[last][last-offset]; //[0,3] -> [3,3]

                ori_matrix[last][last-offset] = ori_matrix[last - offset][first]; //[3,3] -> [3,0]

                ori_matrix[last - offset][first] = top; //[3,0] -> [0,0]
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(ori_matrix[i][j]);
            }

        }

    }
}
