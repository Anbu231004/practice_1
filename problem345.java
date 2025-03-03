
import java.util.Scanner;

class problem345 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s;
        s1 = s1.toLowerCase();
        char[] arr = new char[s.length()];
        int index = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                arr[index++] = s.charAt(i);
            }
        }
        index=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                sb=sb.append(arr[index++]);
            }
            else{
                sb=sb.append(s1.charAt(i));
            }
        }
        String result=sb.toString();
        System.out.println(result);
    }
}
