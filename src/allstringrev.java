
public class allstringrev {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str="i love india";
		System.out.println("before Revrse:"+str);
		System.out.println("After revrse");
		String ar[]= str.split(" ");
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " ");
		}
		}

	}

