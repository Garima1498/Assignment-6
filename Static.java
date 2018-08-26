class Static{
   static int n;
   static String str;
   static{
      System.out.println("Static Block A :- ");
      n = 49;
      str = "Block 1";
  } 
  static{
      System.out.println("Static Block B :- ");
      n = 88;
      str = "Block 2";
  }
  public static void main(String args[])
  {
      System.out.println("Value of num: "+n);
      System.out.println("Value of mystr: "+str);
   }
}