package oops_ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        try{
            int res = 5+6;
            System.out.println(res);
            divide(14,0);
            int c = a / b;
            int ans = 4/2;
            System.out.println(ans);
        }catch (ArithmeticException error){
            System.out.println(error.getMessage());
        }

        finally {
            System.out.println("Out of try-catch");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Baklol ho kya");
        }
        return a/b;
    }
}
