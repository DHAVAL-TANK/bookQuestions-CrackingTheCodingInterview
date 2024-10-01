// problem : check if the string's every character  is unique or not

// solution :    
//  if extra data structure is allowed ->  O(min( 128 / 256 , string length )) 
      //  create a boolean array of 128 or 256
      //  iterate over each character 
      //  if duplicate return false
      //  else make the flag true 

      // space usage can be reduce the with usage of bit mask. 
      
//  if extra data structure is not allowed
    //  sort the array and check for neighbours -> O( nlogn )





package ArraysAndStrings;

class UniqueCharinString{
   public static void main(String[] args) {
     String str="abcdheqwerty";


     boolean isUnique= checkForUnique(str);

     System.out.println("answer: "+ isUnique);
   }

   private static boolean checkForUnique(String str) {


      if( str.length() > 128) return false;

      boolean temp[] = new boolean[128];

      int i =0;
       while(i < str.length())
       {
         if (temp[str.charAt(i)]){
            return false;
         }
         temp[str.charAt(i++)] = true;

       }
      return true;
   }
}


