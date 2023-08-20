package ci.angeATT.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @author Attoungbre Ange François 2023-08-18
 */
public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> reponse = new ArrayList<>();
    //d'abord si le premier element est > 0 renvoyer vide
    if (nums[0] > 0){
      return reponse;
    }

    //parcourir toute la liste jusqu'au n-2 element
    for(int i =0; i< nums.length-2; i++ ){
      //si un element est double avancer
      if(i>0){
        if(nums[i] == nums[i-1]){
          continue;
        }
      }
      //fixer le premier puis le deuxieme et chercher l'element qui va aider à envoyer 0
      int indexDecroit = nums.length-1;
      int deb = nums[i];
      while (indexDecroit > i+1){ //chercher si un element correspond
        //verifier si l'element est pas pareille que le precedent
        if(indexDecroit < nums.length - 1){
          if (nums[indexDecroit] == nums[indexDecroit+1]){
            indexDecroit--;
            continue;
          }
        }
        for (int j = i+1; j< indexDecroit; j++){
          if (nums[i] + nums[j] + nums[indexDecroit] == 0){
            reponse.add(List.of(nums[i],nums[j],nums[indexDecroit]));
            break;
          }else if (nums[j] + nums[i] + nums[indexDecroit] > 0 ){
            break;
          }
        }
        indexDecroit--;
      }
    }
    return reponse;
  }
}
