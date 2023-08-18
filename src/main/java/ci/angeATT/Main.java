package ci.angeATT;

import ci.angeATT.arrays.KadanesAlgorithm;

/**
 * <p></p>
 *
 * @author Attoungbre Ange François ${YEAR}-${MONTH}-${DAY}
 */
public class Main {
  public static void main(String[] args) {
    Integer[] tab = {-2,-3,4,-1,-2,1,5,-3};
    KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
    Integer algo = kadanesAlgorithm.algo(tab);
    System.out.println(algo);
  }
}