public class Calculator
{
    public double add(int a, int b){
        return a + b;
    }

    public double add(String a, String b){
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA + numB;
        }catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: please enter valid integers.");
        }
    }


    public double multi(int a, int b){
        return a * b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public double divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Can divide by 0");
        }
        return (double) a / b;
    }



}
