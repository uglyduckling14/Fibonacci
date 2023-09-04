import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Objects;

public class Assign1 {
    public static void main(String[] args) {

        if(args.length<2){
            printHelp();
            return;
        }
        for(int i =0; i< args.length; i++){
            String arg = args[i];
            switch(arg){
                case "-fib":
                    if(isValid(args[i+1], 0,40)){
                        System.out.println("Fibonacci of "+ args[i+1]+ " is "+
                                fibonacci(Integer.parseInt(args[i+1])));
                    }else{
                        printHelp();
                    }
                    i++;
                    break;
                case "-fac":
                    if(isValid(args[i+1], 0, Integer.MAX_VALUE)){
                        System.out.println("Factorial of "+ args[i+1]+ " is "+
                                factorial(new BigInteger(args[i+1])));
                    }else{
                        printHelp();
                    }
                    i++;
                    break;
                case "-e":
                    if(isValid(args[i+1],1, Integer.MAX_VALUE)){
                        System.out.println("Value of e using "+ args[i+1]+" iterations is "+
                                e(new BigDecimal(args[i+1]), Integer.parseInt((args[i+1]))-1));
                    }else{
                        printHelp();
                    }
                    i++;
                    break;
                default:
                    System.out.println("Unrecognized arguments: "+ arg);
                    System.out.println("");
                    printHelp();
                    return;
            }
        }
    }
    private static void printHelp(){
        System.out.println("--- Assign 1 Help ---");
        System.out.println(" -fib [n] : Computes the Fibonacci of n; n must be 0-40");
        System.out.println(" -fac [n] : Computes the Factorial of n; n must be 0-"+ Integer.MAX_VALUE);
        System.out.println(" -e [n] : Computes the value of 'e' using n iterations; n must be 1-"+Integer.MAX_VALUE);
    }
    private static boolean isValid(String arg, int min, int max){
        return isInt(arg)!=-1 && min<=isInt(arg) && max>=isInt(arg);
    }
    private static int isInt(String arg){
        try{
            return Integer.parseInt(arg);
        }catch (NumberFormatException e){
            System.out.println("Error! Invalid argument!");
            return -1;
        }
    }
    private static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

    private static BigInteger factorial(BigInteger n){ // Changed values to BigInteger for precision
        if(n.compareTo(BigInteger.ZERO)==0){
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        BigInteger counter = n;
        while (counter.compareTo(BigInteger.ZERO)!=0) {
            result = result.multiply((counter));
            counter = counter.subtract(BigInteger.ONE);
        }

        return result;
    }
    private static BigDecimal e(BigDecimal n, int power) {
        if (Objects.equals(n, BigDecimal.ZERO)) {
            return BigDecimal.ONE; // e^0 = 1
        }
        BigDecimal result = BigDecimal.ONE;
        BigDecimal counter = n;

        while(counter.compareTo(BigDecimal.ONE)!=(-1)){
            result = result.add(BigDecimal.ONE
                    .divide(new BigDecimal(factorial(new BigInteger(String.valueOf(counter)))), new MathContext(12)), new MathContext(12));
            counter =counter.subtract(BigDecimal.ONE);
            power--;
        }
        return result;
    }

    //testing methods
    public static boolean isPubValid(String arg, int min, int max){
        return isValid(arg,min, max);
    }
    public static int isPubInt(String arg){
        return isInt(arg);
    }
    public static int pubFibonnaci(int n){
        return fibonacci(n);
    }
    public static BigDecimal pubE(BigDecimal n, int power){
        return e(n, power);
    }
}