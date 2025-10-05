package bvimit.org;
interface conc1{
	public String concat(String a,String b);
	
}

public class concatenate {
	public static void main(String[] args) {
		conc1 s1 = (String a,String b)->{ return(a+b);};
		System.out.println(s1.concat("Hello","Vinit"));
		
	}

}
