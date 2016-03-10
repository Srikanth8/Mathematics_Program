import java.util.*;
import java.util.InputMismatchException;
public class Homepage
{
    public static void main (String [] args)
    {
        Scanner scan=new Scanner(System.in);
        LogIn obj=new LogIn();
        ArrayList<User> userArray = new ArrayList<User>();
        obj.Retain(userArray);
        String name;
        int pin=-1;

        while (1==1)
        {
            while (1==1)
            {
                System.out.println("Please enter you username; if you do not have an account type 0");
                name=scan.next();
                if (name.equals("0"))
                {
                    System.out.println("Enter an username for your account");
                    String a=scan.next();
                    boolean yes=false;
                    while (!yes)
                    {
                        boolean success=false;
                        int b=-1;
                        int c=-2;
                        while (!success)
                        {
                            try
                            {
                                System.out.println("Enter a PIN for your account (only numbers)");
                                b=scan.nextInt();
                                success=true;
                            }
                            catch (InputMismatchException e)
                            {
                                scan.next();
                                System.out.println("PIN must only have numbers");                
                            }
                        }
                        obj.Record(userArray,a,b);
                        yes=true;
                    }
                }
                else
                {
                    boolean status=false;
                    while (!status)
                    {
                        try
                        {
                            System.out.println("Please enter your pin");
                            pin=scan.nextInt();
                            status=true;
                        }
                        catch (InputMismatchException e)
                        {
                            scan.next();
                            System.out.println("PIN must only have numbers");                
                        }
                    }
                    if (obj.Check(userArray, name, pin)==1)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid username and/or PIN; please try again or sign up");     
                        System.out.println("");
                    }
                }
            }

            This_Loop:
            while (1==1)
            {
                System.out.println("");
                System.out.println("Which function would you like to use?");
                System.out.println("");
                System.out.println("CALCULUS:");
                System.out.println("(1)  Integration of Polynomials(Definite Integrals)");
                System.out.println("(2)  Differentiation of Polynomials");
                System.out.println("STATISTICS and PROBABILITY:");
                System.out.println("(3)  Statistics Calculator");
                System.out.println("(4)  Binomial Distribution");
                System.out.println("(5)  Hypergeometric Distribution");
                System.out.println("(6)  Poisson Distribution");
                System.out.println("MATRICES:");
                System.out.println("(7)  Addition");
                System.out.println("(8)  Subtraction");
                System.out.println("(9)  Multiply by Constant");
                System.out.println("(10) Multiplication");
                System.out.println("(11) Determinant");
                System.out.println("POLYNOMIALS:");
                System.out.println("(12) Quadratic Solver");
                System.out.println("(13) Binomial Expansion");
                System.out.println("PERMUTATION and COMBINATION:");
                System.out.println("(14) Factorial");
                System.out.println("(15) Permutation");
                System.out.println("(16) Combination");
                System.out.println("SEQUENCES");
                System.out.println("(17) Pascal's Triangle");
                System.out.println("(18) Fibonacci Sequence");
                System.out.println("(19) Palindrome Numbers");
                System.out.println("");
                System.out.println("(20) Access Variables");
                System.out.println("(21) Log out");
                System.out.println("(0)  Exit Program");
                System.out.println("");

                int n=scan.nextInt();
                System.out.println("");

                Storage S=new Storage();
                ArrayList<Store> storeArray = new ArrayList<Store>();
                S.Retain(storeArray, name);

                Input I=new  Input();
                Calculus Cal = new Calculus();
                Statistics Stat = new Statistics();        
                Binomial B = new Binomial();
                Matrices M = new Matrices();
                Quadratics Q = new Quadratics();
                Factorial F = new Factorial();
                Combination C = new Combination();
                Permutation P = new Permutation();
                Sequences Sq=new Sequences();              

                switch (n)
                {
                    case 0:
                    System.exit(0);
                    break;

                    case 1: 
                    System.out.println("Input order of equation");
                    int orderA=scan.nextInt();
                    double x=Cal.Definite(storeArray, orderA);
                    System.out.println("Do you want to store the answer? (y or n)");
                    String p=scan.next();
                    if (p.equals("y"))
                    {
                        System.out.println("Enter a Variable in which you want to store the solution");
                        String var=scan.next();
                        S.Record(storeArray, name, var, x); 
                    }
                    break;

                    case 2: 
                    System.out.println("Input order of equation");
                    int orderB=scan.nextInt();
                    double y=Cal.Diff(orderB);
                    System.out.println("Do you want to store the answer? (y or n)");
                    String w=scan.next();
                    if (w.equals("y"))
                    {
                        System.out.println("Enter a Variable in which you want to store the solution");
                        String var=scan.next();
                        S.Record(storeArray, name, var, y); 
                    }                                             
                    break;

                    case 3:  
                    Stat.Stat(storeArray);
                    break;

                    case 4:  
                    double yq=Stat.Binom();
                    System.out.println("Do you want to store the answer? (y or n)");
                    String wq=scan.next();
                    if (wq.equals("y"))
                    {
                        System.out.println("Enter a Variable in which you want to store the solution");
                        String var=scan.next();
                        S.Record(storeArray, name, var, yq); 
                    }         
                    break;

                    case 5:  
                    double yp=Stat.Hyper();
                    System.out.println("Do you want to store the answer? (y or n)");
                    String wp=scan.next();
                    if (wp.equals("y"))
                    {
                        System.out.println("Enter a Variable in which you want to store the solution");
                        String var=scan.next();
                        S.Record(storeArray, name, var, yp); 
                    }         
                    break;

                    case 6: 
                    double ya=Stat.Poisson();
                    System.out.println("Do you want to store the answer? (y or n)");
                    String wa=scan.next();
                    if (wa.equals("y"))
                    {
                        System.out.println("Enter a Variable in which you want to store the solution");
                        String var=scan.next();
                        S.Record(storeArray, name, var, ya); 
                    }                 
                    break;

                    case 7:  
                    M.Addition();
                    break;

                    case 8: 
                    M.Subtraction();
                    break;

                    case 9:
                    M.MultiplyConstant();
                    break;

                    case 10:
                    M.Multiply();
                    break;

                    case 11:
                    M.Determinant();
                    break;

                    case 12:
                    Q.Quadratic();
                    break;

                    case 13:
                    B.Binomial();            
                    break;

                    case 14: 
                    System.out.println("Enter value of x in x!");
                    int e=scan.nextInt();
                    F.Fac(e);
                    break;

                    case 15: 
                    C.Combination(2,2);
                    break;

                    case 16: 
                    P.Permutation(2,2);
                    break;

                    case 17: 
                    Sq.Pascal();
                    break;

                    case 18: 
                    Sq.Fibonacci();
                    break;

                    case 19: 
                    Sq.Palindrome();
                    break;

                    case 20:
                    System.out.println("Enter your variable");
                    double q = I.Input(storeArray);          
                    if (q == Math.pow(Math.E, Math.PI))  // Please refer to the Find method in 'Storage' Class t
                    {
                        System.out.println("Variable not found");
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("Value = "+q);
                    }
                    break;

                    case 21: 
                    break This_Loop;

                    default: 
                    System.out.println("Please enter a number from 1 to 19");
                    break;
                }
                System.out.println("");
                System.out.println("Continue using the program, log out or exit? (ENTER 'c' OR 'log' OR 'exit' )");
                String Z=scan.next();
                System.out.println("");
                if (Z.equals("log"))
                {
                    break This_Loop;
                }
                if (Z.equals("exit"))
                {
                    System.exit(0);
                }
            }
        }
    }
}

