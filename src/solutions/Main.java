package solutions;

/**
 * Created by ferenc on 2017.09.20..
 */
public class Main {

    public static void main(String[] args) {
        int[][] multi =  new int[][]{
                {13,27,18,26},
                {4,5,1,3},
                {32,35,37,39},
                {1000,1001,857,1}};

        MySolution solution = new MySolution();
        solution.largestOfFour(multi);
    }
}
