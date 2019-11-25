
public class Descending {

	

		public static void main(String[] args) 
		{
		
			int[] Lt = new int[] {100,12,120,101,1,250};
			
			for (int i=0;i<Lt.length;i++)
			{
				System.out.println("Before sorting "+Lt[i]);
			}
			
			for (int i=0;i<Lt.length;i++)
			{
				for (int j=i+1;j<Lt.length;j++)
				{
					if (Lt[i]<Lt[j])
					{
						int temp=Lt[i];
						Lt[i]=Lt[j];
						Lt[j]=temp;
						
					}
				}
			}
			
			for (int i=0;i<Lt.length;i++)
			{
				System.out.println("Sorted array is :"+Lt[i]);
			}
		}

	}


