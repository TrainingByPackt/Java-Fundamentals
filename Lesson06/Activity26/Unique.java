public class Unique {
   public static String removeDups(String string){
       if (string == null)
           return string;
       if (string == "")
           return string;
       if (string.length() == 1)
           return string;
      String result = "";
       for (int i = 0; i < string.length() ; i++){
           char c = string.charAt(i);
           boolean isDuplicate = false;
           for (int j = 0; j < result.length(); j++){
               char d = result.charAt(j);
               if (c  == d){ //duplicate found
                   isDuplicate = true;
                   break;
               }
           }
           if (!isDuplicate)
               result += ""+c;
       }
       return result;
   }
public static void main(String[] args){
       String a = "aaaaaaa";
       String b = "aaabbbbb";
       String c = "abcdefgh";
       String d = "Ju780iu6G768";
       System.out.println(removeDups(a));
       System.out.println(removeDups(b));
       System.out.println(removeDups(c));
       System.out.println(removeDups(d));
   }

}
