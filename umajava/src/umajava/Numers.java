package umajava;

public class Numers {

	public static void main(String[] args) {
		// fibonacci series
int n1=0,n2=1,n3;
System.out.println(n1);
for(int i=0;i<=10;i++)
{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
}

	}

}
