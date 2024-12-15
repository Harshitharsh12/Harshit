public class ReverseString {
   public static void main(String[] args) {
      String s1 = "Harshit";
      reverseString(s1);
   }

   static void reverseString(String s1) {
      String s2 = "";
      for (int i = s1.length() - 1; i >= 0; i--) {
         // s2 = s2.concat(Character.toString((s1.charAt(i))));
         s2 = s2 + s1.charAt(i);
      }
      System.out.println(s2);
   }
}