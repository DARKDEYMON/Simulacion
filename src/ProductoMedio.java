import java.util.*;

public class ProductoMedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner nf=new Scanner(System.in);
		System.out.println("Nuemro 1");
		int n1=nf.nextInt();
		System.out.println("Nuemro 2");
		int n2=nf.nextInt();
		for(int i=0;i<20;i++)
		{
			System.out.println("N°: "+(i+1));
			System.out.println("Nuemro 1: "+n1);
			System.out.println("Nuemro 2: "+n2);
			int m=n1*n2;
			System.out.println("Multiplicacion: "+m);
			String m1=m+"";
			String m2=m1.substring(1, 4);
			m=Integer.parseInt(m2);
			String l=m+"";
			if(l.length()<3)
			{
				m2=m1.substring(2, 5);
				m=Integer.parseInt(m2);
				l=m+"";
				System.out.println(l.length()+" :numero");
				if(l.length()<3)
				{
					m2=m1.substring(3, 6);
					m=Integer.parseInt(m2);
					l=m+"";
					if(l.length()<3)
					{
						System.out.print("fin");
						System.exit(0);
					}
				}
			}
			System.out.println("Iter: "+m);
			n1=n2;
			n2=m;
		}
	}
}
