package umajava;

public class Strongnumberuma {

	public static void main(String[] args) {
		// strong number
		int stgnum=145;
		int temp=stgnum;
		int lastdigit;
		int digitfact;
		int sumfacts=0;
		while(stgnum>0)
		{
			lastdigit=stgnum%10;
			System.out.println("last digit is"+lastdigit);
			digitfact=1;
			while(lastdigit>0)
			{
				digitfact=digitfact*lastdigit;
				lastdigit=lastdigit-1;
			}
			System.out.println("digits factorial is---"+digitfact);
			stgnum=stgnum/10;
			sumfacts=sumfacts+digitfact;
		}
		if(sumfacts==temp)
		{
			System.out.println(temp+"is strong number");
		}
		else
		{
			System.out.println(temp+"is not strong number");
		}
				
			}
}


