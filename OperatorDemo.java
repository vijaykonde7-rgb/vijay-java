public class OperatorDemo { 
   void add (int a, int b) {
        int sum =a+b;
        System.out.println("addition:" +sum);
    }
    int multiply(int a ,int b){
        return a * b;
    }

    public static void main (String[] args ) { 

        int x =10, y=3;
        System.out.println("x+y="+ (x+y));
        System.out.println("x-y="+ (x-y));
        System.out.println("x*y ="+ (x*y));
        System.out.println("x%y="+ (x%y));
        System.out.println("x/y="+(x/y));

        byte a=40,b=20;
        int result= a+b;
        System.out.println("the result of arithmetic promotion:"+ result);

        OperatorDemo obj =new OperatorDemo();
        obj.add (4,7);
        int product = obj. multiply(4,6);
        System.out.println("multiplication: " + product );


    }
    }
    
    
        
    
    