package pkg1;

public class Class2 {
	
		public static void main(String[] args) {
			int status=1,i,j;
			for(i=5; i<=50; i++)
			{
				for(j=2; j<=i/2; j++)
				{
					if(i%j==0)
					{
						status=0;
						break;
					}
				}
				if(status!=0)
				{
					System.out.println(i);
				}
				status=1;
			}
		}

}
