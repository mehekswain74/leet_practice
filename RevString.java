
public class RevString {
   
    public static String strrev(String str){
        char[] chararr=str.toCharArray();
        int left=0,right=chararr.length-1;
        while(left<right){
            char temp=chararr[left];
            chararr[left]=chararr[right];
            chararr[right]=temp;
            left++;
            right--;
        }
        return new String(chararr);
    }
    public static void main(String[] args) {
        String input="hello";
        String rev=strrev(input);
        System.out.println(rev);
        
    }

    
}
