package ArraysAndStrings;

import java.util.Arrays;

class StrPermutation {
    
    String str1="dbd";
    String str2="bdd";

    boolean answer = checkPermutation(str1,str2);

    private boolean checkPermutation(String str12, String str22) {

      str12 = sort(str12); 
      str22 = sort(str22); 

      return str12.equals(str22);
    }

    private String sort(String str) {
        Arrays.sort(str.toCharArray());
        return str;
    }

    

}
