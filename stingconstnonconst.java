public class Constant_Pool_and_Non_Constant_Pool {
 public static void main(String[] args) {
 String str1 = new String("watermelon");
 String str2 = "watermelon";
 String str3 = "water";
 String str4 = "melon";
 String str5 = "water" + "melon";
 String str6 = str3 + "melon";
 System.out.println(str1 == str2);
 System.out.println(str2 == str5);
 System.out.println(str2 == str6);
 System.out.println(str1 + str1.hashCode());
 System.out.println(str2 + str2.hashCode());
 System.out.println(str3 + str3.hashCode());
 System.out.println(str4 + str4.hashCode());
 System.out.println(str5 + str5.hashCode());
 System.out.println(str6 + str6.hashCode());
 }
}
