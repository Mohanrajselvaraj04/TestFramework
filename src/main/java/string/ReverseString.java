package string;

public class ReverseString {

    public static void main(String[] args)
    {
        String txt="Success";
        String txt1="";
        int length = txt.length();
        for (int i= length-1;i>=0 ; i--) {
            char charAt = txt.charAt(i);
            System.out.println(charAt);
         String txt2 =txt1+(char) (txt.charAt(i)-32);
          
            
        }
        
        String[] split = txt.split("");
        //System.out.println(split);
        for (int i=split.length-1; i>=0; i--) {
            System.out.println(split[i]);
            
        }
        
        char[] charArray = txt.toCharArray();
        //System.out.println(charArray);
        for (int i=charArray.length-1; i>=0; i--) {
            System.out.println(charArray[i]);
            
            
        }
        
       // char[] charArray1 = txt.toCharArray();
        //for (char c : charArray1) {
        //    int a= (char)(c+1);
       // }
        
        
    } 
}
