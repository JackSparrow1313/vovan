  public class integral{	
	public static void main (String[] args){
		int n=Integer.valueOf(args[0]);
		double a=Double.parseDouble(args[1]);
		double b=Double.parseDouble(args[2]);
		double h, xc, xd, z=0, in=0;
		h=(b-a)/n;
		for (int c=1; c<=n; c++){
			xc=a+c*h;
			xd=a+(c-1)*h;
			z=(xd*xd+8*xd+xa*xa+8*xa)*h/2;
			in=in+z;
		}
		System.out.println(in);
	}
}
