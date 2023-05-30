package KCPD;

import java.util.Scanner;

public class Tovali {
	static Validate cc=new Validate();
			DTO_hiber nn;
			     public Tovali(DTO_hiber nn)
			     {
			    	 this.nn=nn;
			     }
				static Scanner sc=new Scanner(System.in);
//				public static void main(String[] args) {
//					
			//	
//				}
				public void na(String s)
				{
					if (cc.name(s)) {
						nn.setName(s);
					}
					else
					{
						System.out.println("enter valid name");
						cc.name(s);
					}
					
					
				}
				public void phn(long pon)
				{
					
					if (cc.phn(pon)) {
						nn.setPhnno(pon);
					}
					else
					{
						System.out.println("enter valid number");
						cc.phn(pon);
					}
					
				}
				public  void mai(String s)
				{
					
					if (cc.email(s)) {
						nn.setEmail(s);
						
					}
					else
					{
						System.out.println("enter valid mail id");
						cc.email(s);
					}
				} 
				public  void pass(String pa)
				{
					
					if (cc.Pass(pa)) {
						nn.setPassword(pa);
						
					}
					else
					{
						System.out.println("enter valid password");
						cc.Pass(pa);
					}
					
				}
				public  void gen(String s)
				{

					if (cc.gender(s)) {
						nn.setGender(s);
						
					}
					else
					{
						System.out.println("enter valid gender");
						cc.gender(s);
					}
				}
				public  boolean altph(long phn)
				{
					
					if (cc.altphn(phn)) {
						nn.setAltrphnno(phn);
					}
					return false;
					
				}
				public  boolean add(String j)
				{
					
					if (cc.add(j)) 
					{
						nn.setAddress(j);
						return true;
					}
					else
					{
						
						System.out.println("enter valid address");
						cc.add(j);
					}
					return false;
				}
				public  void altaddd(String d)
				{
					if (cc.altadd(d)) {
						nn.setAltadd(d);
						
					}
					else
					{
						System.out.println("enter valid altenative address");
						cc.altadd(d);
					}
				}
				public  void dateof(String bo)
				{
					if (cc.dob(bo)) {
						nn.setDob(bo);	
					}
					else
					{
						System.out.println("enter the valid date of birth");
						cc.dob(bo);
					}
					
				}
				public   boolean age(int age1)
				{
					
			         if (cc.agee(age1)) {
						nn.setAge(age1);
					}
			         else
			         {
			        	 System.out.println("enter valid age");
			        	 cc.agee(age1);
			         }
					return false;
				}

}
