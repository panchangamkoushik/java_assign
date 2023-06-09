import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(encodeMessage(n, s));
        }
        sc.close();
    }
    public static String encodeMessage(int n, String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < n - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = (char) (219 - (int) arr[i]);
        }
        return new String(arr);
    }
}