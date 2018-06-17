package string;

public class NumberofOcurrance {

    public static void main(String[] args) {
        String txt="Succeess";
        int length = txt.length();
        int count=0;
        for (int i = 0; i < length; i++) {
            char charAt = txt.charAt(i);
            if(charAt=='e') {
                count=count+1;
                
            }
            
        }
        System.out.println(count);
    }

}
