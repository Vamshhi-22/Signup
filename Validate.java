package KCPD;

public class Validate {
	public  boolean name(String name)
	{
		boolean b=false;
		for (int i = 0; i< name.length(); i++) 
		{
			
			char ch=name.charAt(i);
			if ((ch>=65&&ch<=90||ch>=97&&ch<=122)&&(name.length()>3)) 
			{
				b=true;
				
			}
			else {
			   b= false;
			}
		}
		return b;
	}
	public  boolean phn(long po)
	{
		if (po>=61111111&&po<=9999999999l) {
			return true;
		}
		else {
			
		}
		return false;
	}
	public  boolean email(String jj)
	{
	   String g=jj;
		String em=g.substring(g.length()-10,g.length()-1);
		String e="@gmail.com";
		int c=0;
		boolean c1=false;
		boolean ret=true;
		if(g.contains(e)&&g.length()>=13)
		{
			c1=true;
			c++;
		}
		if (c1==true&&g.contains(em)) {
		
		     ret=true;
		}
		else {
			if(c>1)
			{
				ret= false;
			}
			}
		return ret;
	}
	public  boolean Pass(String pass)
	{

		for (int i = 0; i < pass.length(); i++) {
			char ch=pass.charAt(i);
			if(pass.length()>=6) {
			if (ch>=48&&ch<=57&&ch>=65&&ch<=90||ch>=97&&ch<=122&&!(ch>=48&&ch<=57||ch>=65&&ch<=90||ch>=97&&ch<=122)) {
				return true;
			}
		} else {
			return false;
			
		}
			
			}
		return true;
		}
	public  boolean  agee(int age)
	{
		if (age>18&&age<30) {
			return true;
			
		}
		return false;
	}
	public  boolean gender(String gen)
	{
		
		String m="male";
		String f="female";
		String ge="others";
		if (gen.equalsIgnoreCase(f)||gen.equalsIgnoreCase(m)||gen.equalsIgnoreCase(ge)) {
			return true;
		}
		else
		{
			return false;
		}	
	}
	public  boolean add(String h)
	{
		for (int  i= 0;  i< h.length(); i++) {
			char  ch=h.charAt(i);
			if (ch>=65&&ch<=90||ch>=97&&ch<=122&& ch==' ') {
				return true;
			}
			
		}
		return true;
		
	}

	public  boolean altadd(String h)
	{

		for (int  i= 0;  i< h.length(); i++) {
			char  ch=h.charAt(i);
			if (ch>=65&&ch<=90||ch>=97&&ch<=122&& ch==' ') {
				return true;
			}
			
		}
		return true;
	}
	public  boolean altphn(long l)
	{
	DTO_hiber hh=new DTO_hiber();	
		long j=l;
		if(j!=hh.getPhnno()) {
		return true;	
		}
		return false;
	}
	
	public  boolean  dob(String bo)
	{
		for (int i = 0; i < bo.length()-1; i++) {
			char ch=bo.charAt(i);
	   if (ch>=48&&ch<=57&&!(ch>=65&&ch<=122||ch>=97&&ch<=122)) {
		
	   return true;
	}
		}
	return false;
		
	
}


}
