import java.util.*;

class Recurrence{
    int n;
    Recurrence(){}
    Recurrence(int n){
        this.n = n;
    }
    long fact(int n){
        if(n==0 || n == 1){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
    int fibonacci(int n){
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n-1) + fibonacci(n-2); 
        } 
    void print(int n) {
        
            for (int i = 0; i < n; i++) {
                 for (int k = 0; k < n - i; k++) {
                      System.out.print(" "); // print space for triangle like structure
                 }
                 for (int j = 0; j <= i; j++) {
                      System.out.print(pascal(i, j) + " ");
                 }
                 System.out.println();
            }
        }
     
    int pascal(int i, int j) {
            if (j == 0 || j == i) {
               return 1;
            } else {
               return pascal(i - 1, j - 1) + pascal(i - 1, j);
            }
        }
    }
    

class Iteration{
    int n;
    int i;
    long f = 1;
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_MAGENTA = "\u001b[35m";
    
    int previouspreviousNumber=1, previousNumber = 1, currentNumber = 2;
    
    Iteration(int n){
        this.n = n;
    }
    long fact(int n){
        for(i=1;i<=n;i++){
            f=f*i;      
        }
        return f;
    }
    void fibonacci(int n){
        int maxNumber = n, previousNumber = 0, nextNumber = 1;
        System.out.print(ANSI_GREEN+"Fibonacci series "+ANSI_RESET +" of "+ ANSI_MAGENTA +maxNumber+ ANSI_RESET +" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
        
    }
}


public class program2 {
    public static void main(String[] args) {
        int choice;
         String ANSI_GREEN = "\u001B[32m";
         String ANSI_RESET = "\u001B[0m";
         String ANSI_MAGENTA = "\u001b[35m";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n");
            System.out.println("1.Recursion\n2.Iteration\nEnter your choice :");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("==================================================");
                    System.out.println("What do you want to do with recursion :\n1.Factorial\n2.Fibonacci\n3.Pascal's Triangle\nEnter your choice:");
                    int cr = sc.nextInt();
                   
                    if(cr==1){
                        int n;
                        System.out.println("Enter the value of n:");
                        n = sc.nextInt();
                        Recurrence re = new Recurrence(n);
                        long res = re.fact(n);

                        System.out.println(ANSI_GREEN+"Factorial"+ANSI_RESET +" of "+ Integer.toString(n)+ " is "+ANSI_MAGENTA + Long.toString(res)+ANSI_RESET);
                        System.out.println("==================================================");
                    }
                    else if(cr==2){
                        int n;
                      
                        System.out.println("Enter the value of n:");
                        n = sc.nextInt();
                        Recurrence re = new Recurrence(n);
                        System.out.print(ANSI_GREEN+"Fibonacci series"+ANSI_RESET +" of "+ ANSI_MAGENTA + n + ANSI_RESET +" numbers:");
                        for(int i=0;i<n;i++) {
                            System.out.print(" "+Integer.toString(re.fibonacci(i)));
                        }
                        System.out.println();
                        System.out.println("==================================================");
                    }
                    else if(cr==3){

                        System.out.print("Enter the number of rows to print: ");
                        int n = sc.nextInt();
                        Recurrence re = new Recurrence(n);
                        System.out.println("Pascal Triangle:");
                        re.print(n);
                    }
                    else{
                        break;
                    }
                    break;
                case 2:
                     System.out.println("==================================================");
                    System.out.println("What do you want to do with Iteration :\n1.Factorial\n2.Fibonacci\n3.Pascal's Triangle\nEnter your choice:");
                    int ci = sc.nextInt();
                    
                    if(ci==1){
                        int n;
                        
                        System.out.println("Enter the value of n:");
                        n = sc.nextInt();
                        Iteration ite = new Iteration(n);
                        long res = ite.fact(n);
                        System.out.println(ANSI_GREEN+"Factorial"+ANSI_RESET +" of "+Integer.toString(n)+ " is "+ ANSI_MAGENTA +Long.toString(res)+ANSI_RESET);
                        System.out.println("==================================================");
                    }
                    else if(ci==2){
                        int n;
                        
                        System.out.println("Enter the value of n:");
                        n = sc.nextInt();
                        Iteration ite = new Iteration(n);
                       
                        ite.fibonacci(n);
                        System.out.println("\n==================================================");
                    }
                    else if(ci==3){
                        System.out.print("Enter the number of rows to print: ");
                        int rows = sc.nextInt();
                        int coef = 1;
                 
                        for(int i = 0; i < rows; i++) {
                            for(int sp = 1; sp < rows - i; ++sp) {
                                System.out.print(" ");
                            }
                 
                            for(int j = 0; j <= i; j++) {
                                if (j == 0 || i == 0)
                                    coef = 1;
                                else
                                    coef = coef * (i - j + 1) / j;
                 
                                System.out.print(" "+coef+" ");
                            }
                 
                            System.out.println();
                    }
                    
                }
                    else{
                        break;
                    }
                    break;
                default:
                System.out.println("==================================================");
                    System.out.println("Enter the correct value either 1 or 2");
                    System.out.println("==================================================");
                    break;
                
            }
}while(choice!=0);
}
}
