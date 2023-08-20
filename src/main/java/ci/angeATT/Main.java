package ci.angeATT;

import ci.angeATT.arrays.KadanesAlgorithm;
import ci.angeATT.arrays.MergeStringAlternately;
import ci.angeATT.arrays.ProductOfArrayExceptSelf;
import ci.angeATT.arrays.StringDivisor;
import ci.angeATT.arrays.ThreeSum;
import java.util.List;

/**
 * <p></p>
 *
 * @author Attoungbre Ange François ${YEAR}-${MONTH}-${DAY}
 */
public class Main {
  public static void main(String[] args) {
    //Integer[] tab = {-2,-3,4,-1,-2,1,5,-3};
    //KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
    //Integer algo = kadanesAlgorithm.algo(tab);
    //System.out.println(algo);

    //int[] tabThreeSum = {-2,0,1,1,2};
    //ThreeSum threeSum = new ThreeSum();
   //List<List<Integer>> lists = threeSum.threeSum(tabThreeSum);
    //System.out.println(lists);

    //MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
    //mergeStringAlternately.mergeAlternately("abec","bbbb");

    //StringDivisor stringDivisor = new StringDivisor();
    //System.out.println(stringDivisor.gcdOfStrings("ABCABC","ABC"));
    //System.out.println(stringDivisor.gcdOfStrings2("BAAB","ABBA"));

    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    productOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});



  }
}