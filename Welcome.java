package KCPD;
import java.util.*;
public class Welcome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 Login_hiber q=new Login_hiber();
           System.err.println("Enter your mobile number");
         q.mob(sc.nextLong());
         System.err.println("enter your password");
         q.pass(sc.next());
         
	}

}
