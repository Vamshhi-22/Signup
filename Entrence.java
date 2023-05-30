package KCPD;

import java.util.Scanner;

//import Revs.CreateTable;
//import Revs.DAOofPRO;
//import Revs.Name;

public class Entrence {
     
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
			DTO_hiber ct=new DTO_hiber();
			Tovali name=new Tovali(ct);
			
			boolean q=true;
			System.out.println("~choose below options~");
			   System.out.println("--> 1-for Name \n -->2-for Mobileno \n -->3-for Password \n -->4-for Email \n -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
	            
			  int c=0;
			   while(q)
			   {
				   int f=sc.nextInt();
			switch (f) 
			{
				case 1:
				{
					  System.out.println("Enter the your Name");
					  String nam=sc.next();
			           name.na(nam);
			           c++;
				       System.out.println("-->2-for Mobileno \n -->3-for Password \n -->4-for Email \n -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age");
				       System.out.println("your name is "+nam);
				}
				       break;
				case 2:
				{
			     System.out.println("Enter the Mobile number: ");
			     long l=sc.nextLong();
			     name.phn(l);
			     c++;
						System.out.println("-->3-for Password \n -->4-for Email \n -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age");
				}break;
				case 3:
				{
			      System.out.println("Enter the  Password: ");
			      String ps=sc.next();
			      name.pass(ps);
			      c++;
			      System.out.println("-->4-for Email \n -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
				} break;
				case 4:
				{
				      System.out.println("Enter the Email");
				      String ff=sc.next();
				      name.mai(ff);
				      c++;
				       System.out.println(" -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
				} break;
				case 5:
				{
				      System.out.println("Enter the Gender");
				     String sss=sc.next();
					  name.gen(sss);
					  c++;
					   System.out.println("-->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
				}break;
					case 6:
					{
					  System.out.println("Enter the Address");
					  String jj=sc.next();
					  name.add(jj);
					  c++;
					  System.out.println("-->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
					} break;
					case 7:
					{
				      System.out.println("Enter Alternative Address");
				      String add=sc.next();
					   name.altaddd(add);
					   c++;
					   System.out.println(" -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age ");
					} break;
					case 8:
					{
				      System.out.println("Enter the  alternative phone number");
				      long l1=sc.nextLong();
				      name.altph(l1);
				      c++;
				      System.out.println("-->9-for dat of birth \n -->10- for age ");
					}break;
					case 9:
					{
				       System.out.println("Enter the date of birth in date/month/year in this format ");
				       String s3=sc.next();
				        name.dateof(s3);
				        c++;
				        System.out.println("-->10- for age ");
					} break;
					case 10:
					{
				      System.out.println("enter your age");
				      int h=sc.nextInt();
				      name.age(h);
				      c++;
				       System.out.println("--> enter 0 for submit");
					}break; 
		             
					case 0:
					{
						System.out.println("press again 0 for submit");
						int t=sc.nextInt();
						if (t==0&&c==10) {
							DAO_hiber.callme(ct);
							System.out.println(" your details are submited");
							
						}
						else
						{
							System.out.println("enter all the above requirments");
							 System.out.println("--> 1-for Name \n -->2-for Mobileno \n -->3-for Password \n -->4-for Email \n -->5-for Gender \n -->6-for Address \n -->7-for Alt address \n -->8- for alternative phone number  \n -->9-for dat of birth \n -->10- for age");
							 
						}
					}break;
						
					}
				   
			   }
					 
			   }
		
		
		

	}


