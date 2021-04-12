package umajava;

public class Strongnumber {

	public static void main(String[] args) {
		// strong number
		int strngnum=145;
		int temp=strngnum;
		int lastdigit;
		int digitfact=1;
		int sumfacts=0;
		while(strngnum>0)
		{
			lastdigit=strngnum%10;
			System.out.println("last digit is..."+lastdigit);
			while(lastdigit>0)
				{
				digitfact=digitfact*lastdigit;
				lastdigit=lastdigit-1;
			
	
			}
			System.out.println("digitfactorial is"+digitfact);
			strngnum=strngnum/10;
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
