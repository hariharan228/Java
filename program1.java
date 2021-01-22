import java.util.Scanner;

class Equivalence{
    boolean P,Q,R;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Equivalence(boolean p){
        this.P = p;
    }
    public Equivalence(boolean p, boolean q){
        this.P = p;
        this.Q = q;
    }
    public Equivalence(boolean p, boolean q,boolean r){
        this.P = p;
        this.Q = q;
        this.R = r;
    }
    boolean AND(boolean P, boolean Q){
        boolean r1,r2,res = false;
        r1 = P && Q;
        r2 = Q && P;
        if(r1 && r2){
            res = true;
        }
        return res;      
    }
    boolean OR(boolean P, boolean Q){
        boolean r1,r2,res = false;
        r1 = P || Q;
        r2 = Q || P;
        if(r1 || r2){
            res = true;
        }
        return res;      
    }
    boolean NOT(boolean P){
        return (!P);
    }
    void print_one_var(boolean P,boolean andRHS,boolean andLHS,boolean orRHS,boolean orLHS,String func){
        System.out.print("\n");
        System.out.println("P  "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P    Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+ANSI_GREEN+Boolean.toString(andLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("P    Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+ANSI_GREEN+Boolean.toString(andRHS)+ANSI_RESET );
        if(Boolean.toString(andLHS) == Boolean.toString(andRHS)){
            System.out.print("\n");

            System.out.println("The "+ func +" Equivalence Holds for 'AND'!");
            System.out.print("=================================================================================");
        }
        System.out.print("\n");
    
        System.out.print("\n");
        System.out.println("P "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P     Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+ANSI_GREEN+Boolean.toString(orLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("P     Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+ANSI_GREEN+Boolean.toString(orRHS)+ANSI_RESET );
        if(Boolean.toString(orLHS) == Boolean.toString(orRHS)){
            System.out.print("\n");
            System.out.println("The "+ func +" Equivalence Holds for 'OR'!");
            System.out.print("=================================================================================");
        }
    }
    void print_two_vars(boolean P,boolean Q,boolean andRHS,boolean andLHS,boolean orRHS,boolean orLHS,String func){
        System.out.print("\n");
        System.out.println("P and Q "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P      Q      Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"  "+Boolean.toString(Q)+"  "+ANSI_GREEN+Boolean.toString(andLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("Q      P      Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(Q)+"  "+Boolean.toString(P)+"  "+ANSI_GREEN+Boolean.toString(andRHS)+ANSI_RESET );
        if(Boolean.toString(andLHS) == Boolean.toString(andRHS)){
            System.out.print("\n");

            System.out.println("The "+ func +" Equivalence Holds for 'AND'!");
            System.out.print("=================================================================================");
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("P or Q "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P      Q      Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"  "+Boolean.toString(Q)+"  "+ANSI_GREEN+Boolean.toString(orLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("Q      P     Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(Q)+"  "+Boolean.toString(P)+"  "+ANSI_GREEN+Boolean.toString(orRHS)+ANSI_RESET );
        if(Boolean.toString(orLHS) == Boolean.toString(orRHS)){
            System.out.print("\n");
            System.out.println("The "+ func +" Equivalence Holds for 'OR'!");
            System.out.print("=================================================================================");
        }
    }
    void print_three_vars(boolean P,boolean Q, boolean R,boolean andRHS,boolean andLHS,boolean orRHS,boolean orLHS,String func){
        System.out.print("\n");
        System.out.println("P and Q and R "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P     Q     R     Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+Boolean.toString(Q)+"   "+Boolean.toString(R)+"   "+ANSI_GREEN+Boolean.toString(andLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("P     Q     R     Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+"   "+Boolean.toString(Q)+"   "+Boolean.toString(R)+"   "+ANSI_GREEN+Boolean.toString(andRHS)+ANSI_RESET );
        if(Boolean.toString(andLHS) == Boolean.toString(andRHS)){
            System.out.print("\n");

            System.out.println("The "+ func +" Equivalence Holds for 'AND'!");
            System.out.print("=================================================================================");
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("P or Q or R "+ func +" equivalence:");
        System.out.print("\n");
        System.out.println("P       Q       R       Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+" "+Boolean.toString(Q)+" "+Boolean.toString(R)+" "+ANSI_GREEN+Boolean.toString(orLHS)+ANSI_RESET );
        System.out.print("\n");
        System.out.println("P       Q       R       Result");
        System.out.println("====================");     
        System.out.println(Boolean.toString(P)+" "+Boolean.toString(Q)+" "+Boolean.toString(R)+" "+ANSI_GREEN+Boolean.toString(orRHS)+ANSI_RESET );
        if(Boolean.toString(orLHS) == Boolean.toString(orRHS)){
            System.out.print("\n");
            System.out.println("The "+ func +" Equivalence Holds for 'OR'!");
            System.out.print("=================================================================================");
        }
    }

   void Commutativity(boolean P, boolean Q){
        boolean andLHS,andRHS,orLHS,orRHS;
        andLHS = AND(P, Q);
        andRHS = AND(Q, P);
        orLHS = OR(P, Q);
        orRHS = OR(Q, P);
        System.out.println("1.P ^ Q <=> Q ^ P \n");
        System.out.println("2.P v Q <=> Q v P \n");
        print_two_vars(P, Q, andRHS, andLHS, orRHS, orLHS, "Commutativity");
        
        System.out.print("\n");
   }
   void Distributivity(boolean P, boolean Q,boolean R){
    boolean  andLHS = AND(P,OR(Q,R));
    boolean  andRHS = OR(AND(P,Q),AND(P,R));
    boolean  orLHS = OR(P,AND(Q,R));
    boolean  orRHS = AND(OR(P,Q),OR(P,R));
    System.out.println("1.P ^(Q v R) <=> (P ^ Q) v (P ^ R) \n");
    System.out.println("2.P v(Q ^ R) <=> (P v Q) ^ (P v R) \n");
    print_three_vars(P, Q, R, andRHS, andLHS, orRHS, orLHS, "Distributivity");
    System.out.print("\n");
   }  
   void Associativity(boolean P, boolean Q,boolean R){
    boolean  andLHS = AND(AND(P, Q),R);
    boolean  andRHS = AND(P,AND(Q,R));
    boolean  orLHS = OR(OR(P,Q),R);
    boolean  orRHS = OR(P,OR(Q,R));
    System.out.println("1.P ^(Q ^ R) <=> P ^(Q ^ R) \n");
    System.out.println("2.P v(Q v R) <=> P v(Q v R) \n");
    print_three_vars(P, Q, R, andRHS, andLHS, orRHS, orLHS, "Associativity");
    System.out.print("\n");
   }  
   void Identity(boolean P){
    boolean  andLHS = AND(P,true);
    boolean  andRHS = P ;
    boolean  orLHS = OR(P,false);
    boolean  orRHS = P;
    System.out.println("1.P ^ t <=> P \n");
    System.out.println("2.P v c <=> P \n");
    print_one_var(P, andRHS, andLHS, orRHS, orLHS, "Identity");
   }
   void Negation(boolean P){
       boolean andLHS = AND(P,NOT(P));
       boolean andRHS = false;
       boolean orLHS = OR(P,NOT(P));
       boolean orRHS = true;
       System.out.println("1.P ^ ~P <=> c\n");
       System.out.println("2.P v ~P <=> t\n");
       print_one_var(P, andRHS, andLHS, orRHS, orLHS, "Negation"); 
   }
   void Idempotent(boolean P){
       boolean andLHS = AND(P,P);
       boolean andRHS = P;
       boolean orLHS = OR(P,P);
       boolean orRHS = P;
       System.out.println("1.P ^ P <=> P\n");
       System.out.println("2.P v P <=> p\n");
       print_one_var(P, andRHS, andLHS, orRHS, orLHS, "Idempotent");
   }
   void Demorgan(boolean P, boolean Q){
       boolean andLHS = NOT(AND(P,Q));
       boolean andRHS = OR(NOT(P),NOT(Q));
       boolean orLHS = NOT(OR(P,Q));
       boolean orRHS = AND(NOT(P),NOT(Q));
       System.out.println("1.~(P ^ Q) <=> ~P v ~Q\n");
       System.out.println("2.~(P v Q) <=> ~P ^ ~Q\n");
       print_two_vars(P, Q, andRHS, andLHS, orRHS, orLHS, "De Morgan's Law");
   }
   void UniversalBound(boolean P){
       boolean andLHS = AND(P,false);
       boolean andRHS = false;
       boolean orLHS = OR(P,true);
       boolean orRHS = true;
       System.out.println("1.P ^ c <=> c\n");
       System.out.println("2.P v t <=> t\n");
       print_one_var(P, andRHS, andLHS, orRHS, orLHS, "Universal Bound");
   }
   void Absorption(boolean P,boolean Q){
       boolean andLHS = OR(P,AND(P,Q));
       boolean andRHS = P;
       boolean orLHS = AND(P,OR(P,Q));
       boolean orRHS = P;
       System.out.println("1.P v (P ^ Q) <=> P");
       System.out.println("2.P ^ (P v Q) <=> Q");
       print_two_vars(P, Q, andRHS, andLHS, orRHS, orLHS, "Absorption");
   }
}
public class program1{
    public static void main(String[] args){
        boolean p,q,r;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n");
            System.out.println("\nEnter your Choice:\n\n1.Commutativity\n2.Associativity\n3.Distributivity\n4.Identity\n5.Negation\n6.Idempotent\n7.De Morgan's Law\n8.Universal Bound \n9.Absorption\n\n0.Exit");
            System.out.print("\n");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\n");
                    System.out.println("Commutativity:");
                    System.out.println("Enter the P and Q truth values:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    q = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence C = new Equivalence(p,q);
                    C.Commutativity(p,q);
                    break;
                case 2:
                    System.out.print("\n");
                    System.out.println("Associativity");
                    System.out.println("Enter the P, Q and R values:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    q = sc.nextBoolean();
                    r = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence A = new Equivalence(p,q,r);
                    A.Associativity(p,q,r);
                    break;
                case 3:
                    System.out.print("\n");
                    System.out.println("Distributivity:");
                    System.out.println("Enter the P, Q and R values:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    q = sc.nextBoolean();
                    r = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence D = new Equivalence(p,q,r);
                    D.Distributivity(p,q,r);
                    break;
                case 4:
                    System.out.print('\n');
                    System.out.println("Identity:");
                    System.out.println("Enter the P  truth value:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence I = new Equivalence(p);
                    I.Identity(p);
                    break;
                case 5:
                    System.out.print('\n');
                    System.out.println("Negation:");
                    System.out.println("Enter the P truth value:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence N = new Equivalence(p);
                    N.Negation(p);
                    break;
                case 6:
                    System.out.print('\n');
                    System.out.println("Idempotent:");
                    System.out.println("Enter the P truth value:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence Id = new Equivalence(p);
                    Id.Idempotent(p);
                    break;
                case 7:
                    System.out.print("\n");
                    System.out.println("DeMorgan's Law:");
                    System.out.println("Enter the P and Q truth values:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    q = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence De = new Equivalence(p,q);
                    De.Demorgan(p,q);
                    break;
                case 8:
                    System.out.print('\n');
                    System.out.println("Universal Bound:");
                    System.out.println("Enter the P truth value:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence U = new Equivalence(p);
                    U.UniversalBound(p);
                    break;
                case 9:
                    System.out.print("\n");
                    System.out.println("Absorption:");
                    System.out.println("Enter the P and Q truth values:");
                    System.out.print("\n");
                    p = sc.nextBoolean();
                    q = sc.nextBoolean();
                    System.out.print("\n");
                    Equivalence Ab = new Equivalence(p,q);
                    Ab.Absorption(p,q);
                    break;
                    
                default:
                    System.out.println("Please enter the valid choice");
                    break;
            }
        }while(choice!=0);
    }
}