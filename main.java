import java.util.Scanner;

public class main {
                    
    double khr;

    public void ConvertToKHR(double usd){
        khr = usd * khr * 4048.00;
    }
    public void display(){
        System.out.println("Convert to KHR" + khr);
    }
    public static void main(String[] args) {
        
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------$ - € - ¥ - £----------------");
        System.out.println("Welcome To Currency Exchange Converter!!:\n");
        System.out.println("Choose your option below!!\n 1. Currency Converter\n 2. Exchange Rate\n");
        System.out.print("Your Option: ");
        n = scan.nextInt();
        
   
            if(n == 1){
                System.out.println("Select Your Currency:\n 1. AUD\n 2. CAD\n 3. CNY\n 4. EUR\n 5. GBP\n 6. JPY\n 7. SGD\n 8. THB\n 9. VND");

            }
            else if (n == 2){
                System.out.println("Currency\tABA Buys\tABA Sells\nUSD / KHR\t4,048.00\t4,078.00\nAUD / KHR\t2,542.63\t2,651.68\nCAD / KHR\t2,879.89\t3,003.32\nCNY / KHR\t547.00\t570.44\nEUR / KHR\t4,220.04\t4,401.02\nGBP / KHR\t4,930.07\t5,141.51\nJPY / KHR\t25.642500\t26.741400\nKRW / KHR\t2.865400\t3.010400\nSGD / KHR\t2,909.30\t3,033.98\nTHB / KHR\t107.45\t112.05\nVND / KHR\t0.155700\t0.163500\nAUD / USD\t0.623499\t0.655059\nEUR / USD\t1.034831\t1.087208\nGBP / USD\t1.208943\t1.270135\nUSD / CAD\t1.347841\t1.416026\nUSD / CNY\t7.096276\t7.455210\nUSD / JPY\t151.375769\t159.032856\nUSD / KRW\t1,344.67\t1,423.19\nUSD / SGD\t1.334221\t1.401712\nUSD / THB\t36.126729\t37.952536\nUSD / VND\t24,758.41\t26,191.39");
            }
            else {
                System.out.println("Not Correct Value");
            }

       
    }
}
