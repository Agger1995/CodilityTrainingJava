/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author chris
 */
public class Codility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(sol.solution(arr));
        
        System.out.println(sol.frogJmp(10, 85, 30));
        
        
    }
    
}
