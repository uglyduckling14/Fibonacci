import java.math.BigDecimal;
import java.math.BigInteger;

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
                        Fibonnaci fibonacci = new Fibonnaci(Integer.parseInt(args[i+1]));
                        System.out.println("Fibonacci of "+ args[i+1]+ " is "+
                                fibonacci.n);
                    }else{
                        printHelp();
                    }
                    i++;
                    break;
                case "-fac":
                    if(isValid(args[i+1], 0, Integer.MAX_VALUE)){
                        Factorial factorial = new Factorial( new BigInteger(args[i+1]));
                        System.out.println("Factorial of "+ args[i+1]+ " is "+
                                factorial.n);
                    }else{
                        printHelp();
                    }
                    i++;
                    break;
                case "-e":
                    if(isValid(args[i+1],1, Integer.MAX_VALUE)){
                        E e = new E(new BigDecimal(args[i+1]), Integer.parseInt((args[i+1]))-1);
                        System.out.println("Value of e using "+ args[i+1]+" iterations is "+
                                e.n);
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

    //testing methods
    public static boolean isPubValid(String arg, int min, int max){
        return isValid(arg,min, max);
    }
    public static int isPubInt(String arg){
        return isInt(arg);
    }
}