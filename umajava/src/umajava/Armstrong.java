package umajava;

public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int n=345;
int tmp=n;
int ld;
int ldcube;
int sumcubes=0;
while(n>0)
{
	ld=n%10;
	ldcube=ld*ld*ld;
	sumcubes=sumcubes+ldcube;
	n=n/10;
}
	if(sumcubes==tmp)
	{
		System.out.println(tmp+"is a armstrong number");
	}
	else
	{
		System.out.println(tmp+"is not a armstrong number");
	}
	
	}
}



















	}

}
