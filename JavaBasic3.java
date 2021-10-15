//Melani Misca Manurung_Group 3
public class JavaBasic3
{
	public static void main(String args[])
	{
        System.out.println("");
        System.out.println("********* LOOPING *********");

        //Membuat Belah Ketupat
        int a,b,c;
		for(a=1;a<=4;a++)
		{
			for(b=3;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

		for(a=1;a<=4;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(c=3;c>=a;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

        //Membuat Segitiga
		int i,j,k,l;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=8;k>=i;k--)
			{
				System.out.print("*");
			}
			for(l=7;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
}

}