import java.util.*;

public class CuadradoMedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner nf=new Scanner(System.in);
		int s=nf.nextInt();
		for(int i=0;i<1000;i++)
		{
			System.out.println("iter: "+s);
			s=(int)Math.pow(s, 2);
			System.out.println("Elevado: "+s);
			String con;
			con=s+"";
			String ne="";
			if(con.length()%2==0)
			{
				int tan=con.length()/2;
				ne=con.substring(tan-2,tan+1);
				System.out.println(ne);
			}
			else
			{
				try
				{
					ne=con.substring(1,4);
					System.out.println(ne);
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.print("Fin");
					System.exit(0);
				}

			}
			s=Integer.parseInt(ne);
		}
	}

}