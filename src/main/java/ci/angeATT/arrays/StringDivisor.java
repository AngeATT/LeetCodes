package ci.angeATT.arrays;

/**
 * <p>
 *<a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75">lien</a>
 * </p>
 *
 * @author Attoungbre Ange François 2023-08-18
 */
public class StringDivisor {
  public String gcdOfStrings(String str1, String str2) {
    String maxWord = str1.length()> str2.length() ? str1 : str2;
    String minWord = str1.length() < str2.length() ? str1 : str2;
    int tailleMax = 1;
    int indexDebut = 0;
    int max = 0;
    int repeat;
    String repeatWord;
    String repeatWordMin;

    while ( tailleMax <= minWord.length() ){
      repeat = maxWord.length()/tailleMax;
        if( !maxWord.contains(minWord.substring(indexDebut, tailleMax))  ){
          tailleMax++;
        }
          else {
          if ( maxWord.length()%tailleMax  == 0 && minWord.length()%tailleMax == 0 ){
            repeatWord = minWord.substring(indexDebut, indexDebut + tailleMax).repeat(repeat);
            repeatWordMin =
                minWord.substring(indexDebut, indexDebut + tailleMax).repeat(minWord.length()/tailleMax);
            if (repeatWord.equals(maxWord) && repeatWordMin.equals(minWord)  ){
              if (tailleMax > max){
                max = tailleMax;
              }
            }
          }
          tailleMax++;
        }

    }
    if (max == 0) return "";
    return minWord.substring(indexDebut,max);
  }
  public String gcdOfStrings2(String str1, String str2) {
    if (!(str1+str2).equals(str2+str1))  return "";
    int len1=str1.length();
    int len2=str2.length();
    int gcd=1;
    int min=Math.min(len1,len2);
    for(int i=2;i<=min;i++){
      if(len1%i==0 &&len2%i==0){
        gcd=i;
      }
    }
    return str2.substring(0,gcd);
  }

}
