package string;

public class Duplicate {

    public static void main(String[] args) {
        
        String txt1="successb";
        String txt2="failurec";
        StringBuffer sb=new StringBuffer(txt1);
        int txt1_length = sb.length();
        int txt2_length = txt2.length();
        for (int i = 0; i <= txt1_length-1; i++) {
            char charAt = sb.charAt(i);
            for (int j = 0; j < txt2_length; j++) {
                char charAt2 = txt2.charAt(j);
                if(charAt==charAt2) {
                    StringBuffer deleteCharAt = sb.deleteCharAt(i);
                    System.out.println(deleteCharAt);
                }
            }
        }
        
        
        

    }

}
