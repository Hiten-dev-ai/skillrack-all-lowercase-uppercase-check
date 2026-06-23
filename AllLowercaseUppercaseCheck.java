import java.io.*;

public class AllLowercaseUppercaseCheck {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int lowerMask = 0;
        int upperMask = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                lowerMask |= 1 << (ch - 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                upperMask |= 1 << (ch - 'A');
            }
        }

        int fullMask = (1 << 26) - 1;
        System.out.println(lowerMask == fullMask && upperMask == fullMask ? "YES" : "NO");
    }
}
