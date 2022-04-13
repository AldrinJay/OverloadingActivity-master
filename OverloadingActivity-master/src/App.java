public class App {
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    
    private static int greaterValue(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    private static double greaterValue(double a, double b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Method that computes the sum of two numbers: " + computeSum(1, 2));
        System.out.println("Method that computes the sum of three numbers: " + computeSum(1, 2, 3));
        

        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
