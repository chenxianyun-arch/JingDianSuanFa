package com.cxy.subarraysDivByK;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArrayDivByKey {

  @Test
  public void subarraysDivByK() {
    int[] A = new int[]{4,5,0,-2,-3,1};
    int K = 5;
    int preSum = 0, count = 0;
    Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
    //先向散列表里面存前i项的和
    hashMap.put(0,1);
    for(int i=0;i<A.length;i++){
      int mod = (preSum+A[i])%K;
      if(mod<0) mod+=K;
      if(hashMap.containsKey(mod)){
        count += hashMap.get(mod);
        hashMap.put(mod, hashMap.get(mod)+1);
      }
      else{
        hashMap.put(mod,1);
      }
    }
    System.out.println(count);
  }
}
