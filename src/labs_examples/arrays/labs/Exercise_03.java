/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {
	
    public static void main(String[] args) {
        int multiplesTripled = 0;
        
        int[][] multiples = new int[5][5];
        for (int i = 0; i < multiples.length; i ++) {
          for (int j = 0; j < multiples[i].length; j++) {
            multiplesTripled += 3;
            multiples[i][j] = multiplesTripled ;
          }
        }
        
        for (int[] a : multiples) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
  
         
    }
}
