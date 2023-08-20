package ci.angeATT.arrays;

import java.util.Arrays;

/**
 * <p>1768. Merge Strings Alternately</p>
 *
 * @author Attoungbre Ange François 2023-08-18
 */
public class MergeStringAlternately {
  public String mergeAlternately(String word1, String word2) {
    int len1= word1.length();
    int len2 = word2.length();
    char[] word1Tab =  word1.toCharArray();
    char[] word2Tab =  word2.toCharArray();
    int minLen = Math.min(len1, len2);
    String rsl = "1";
    for(int i =0; i < minLen; i++){
      rsl = rsl.concat(String.valueOf(word1Tab[i])).concat(String.valueOf(word2Tab[i]));
    }
    if (len1 > len2){
      rsl =rsl.concat(word1.substring(minLen));
    }else{
      rsl =rsl.concat(word2.substring(minLen));
    }
    return rsl.substring(1);
  }
}
