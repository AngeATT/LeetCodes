package ci.angeATT.arrays;

/**
 * <p></p>
 *
 * @author Attoungbre Ange François 2023-08-20
 */
public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int len = nums.length -1;
    int [] interm = new int[len + 1];
    int[] interm2 = new int[len + 1];
    interm[0] = 1;
    interm2[len] = nums[len];

    for (int i = 1; i< len+1; i++){
      interm[i] =interm[i-1]*nums[i-1];
      interm2[len-i]=interm2[len-i+1]*nums[len-i];
    }
    for (int i =1; i< len; i++){
      nums[i] = interm[i]*interm2[i+1];
    }
    nums[0] = interm2[1];
    nums[len]=interm[len];
    return nums;
  }
  public int[] productExceptSelf2(int[] nums) {
    int deb = 1;
    int fin = nums.length;
    int mul1 = 1;
    int mul2 =1;
    if (nums.length == 2 ){
      return nums;
    }
    while (deb <= (fin+1)/2){
      nums[deb] = mul1*nums[deb-1];
      mul1= nums[deb];
      nums[fin-1-deb]=mul2*nums[fin-deb];
      mul2=nums[fin-1-deb];
      deb++;
    }
    deb = (fin-1)/2;
    while(deb > 0 ){
      nums[deb] = nums[deb-1]*nums[deb+1];
      deb--;
    }
    deb = (fin)/2;
    while(deb<fin-1){
      nums[deb] = nums[deb-1]*nums[deb+1];
      deb++;
    }
    nums[0] = nums[1]*nums[2];
    nums[fin-1] = nums[fin-1]*nums[fin-2];
    return nums;
  }

}
