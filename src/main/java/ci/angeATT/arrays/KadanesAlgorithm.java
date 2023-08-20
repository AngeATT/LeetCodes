package ci.angeATT.arrays;

import ci.angeATT.Algo;
import java.util.Arrays;

/**
 * <p>Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within
 * a arr[] with the largest sum. <a href="https://leetcode.com/problems/maximum-subarray/">lien</a>
 * </p>
 *
 * @author Attoungbre Ange François 2023-08-18
 */
public class KadanesAlgorithm implements Algo<Integer,Integer[]> {

  @Override
  public Integer algo(Integer[]... args) {
    Integer[] tab = Arrays.stream(args).findFirst().get();
    int somme = 0;
    int max = Integer.MIN_VALUE;


    for (int i : tab){
      somme+=i;
      if(somme < i){
        somme = i;
      }
      if (max < somme){
        max = somme;
      }
    }
    return max;
  }
}
