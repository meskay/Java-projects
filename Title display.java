import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String x = S.nextLine();
        StringBuilder word = new StringBuilder();

        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            for(int j=33;j<=(int)c;j++){
                char mix = (char)j;
                String stringmix = String.valueOf(mix);
                System.out.println(word + stringmix);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            word.append(c);
        }
    }
}
