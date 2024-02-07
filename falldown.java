import java.util.Scanner;

public class Main {
    //落地問題: 一球從h米高度自由落下，每次落地後反跳回原高度的一半，再落下。求小球在第n次落地時，共經過多少公尺？高度h以及落地次數n為使用者可以輸入的整數，用System.in讀取。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入小球的高度:");
        int h = scanner.nextInt();
        System.out.println("請輸入球的彈跳次數");
        int n = scanner.nextInt();

        double result=h;
        for(int k =2;k<=n;k++){
            result+=2*(h/Math.pow(2,(k-1)));

        }
        System.out.println("小球在"+h+"公尺處洛下,第"+n+"次落地時,小球經過的總距離為:"+result+"公尺");
    }

}













