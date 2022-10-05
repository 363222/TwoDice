
public class WhileLoops1
{
    public void run() {
        int i = 5;
        int k = 15;
        int a = 0;
        int b = 10;
        while (i < 15) {
            System.out.println(" i is " + i + " but is less than 15 ");
            i += 1;
        }
        while (k > 5) {
            System.out.println(" k is " + k + " but is greater than 5 ");
        }
        while (a < 10 && b <= 20) {
            System.out.println(" a is " + a + " but is less than 10 " );
            System.out.println(" b is " + b + " but is less than 20 ");
            a += 1;
            b += 1;
        }
    }
    
    public static void main(String[] args)
    {
        WhileLoops1 hw = new WhileLoops1();
        hw.run();
    }
}
