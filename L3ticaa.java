import java.util.Scanner;  
public class L3ticaa{
	public static void main(String[] args){
		TicTac tt= new TicTac();
		tt.storetable();
	     
	}
}
class TicTac{
	Scanner sc=new Scanner(System.in);
	int flag=0;
	char ch[][]=new char[3][3];
	char a=49;
	public void storetable()
	{
	   for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		    ch[i][j]=a;
			a++;
			}
		}
		printtable();
		
	}
	public void printtable(){
		  for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
	    }
		game();
	}
	public void game(){
		
		
		if(flag==0){
		System.out.println(" where you want to enter the x");
		char n=sc.next().charAt(0);
		char b='x';
		flag++;
		settable(ch,n,b);
		}
		else{
	    System.out.println(" where you want to enter the o");
		char n=sc.next().charAt(0);
		char b='o';
		flag--;
		settable(ch,n,b);
		}
		
	}
	public void settable(char arr[][],char n,char b){
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(arr[i][j]==n)
				{
					arr[i][j]=b;
				}
			}
		}
		if(check(arr,b)){
			System.out.println("so the winner is"+b);
			System.exit(0);
		}
		else if(tie(arr,b))
		{
			System.out.println("match tie");
			System.exit(0);
		}
		printtable();
		
	}
	public boolean check(char arr[][],char b){
		int count;
		for(int i=0;i<3;i++)
		{
			count=0;
			for (int j=0;j<3;j++)
			{
				if(arr[i][j]==b)
					count++;
				
			}
			if(count==3)
			  return true;
		}
		for(int j=0;j<3;j++)
		{
			count=0;
			for (int i=0;i<3;i++)
			{
				if(arr[i][j]==b)
					count++;
				
			}
			if(count==3)
			  return true;
		}
		count=0;
		for(int i=0,j=0;i<3&&j<3;i++,j++)
		{
			if(arr[i][j]==b)
				count++;
		}
		if(count==3)
		{
			return true;
		}
		count=0;
		for(int i=0,j=2;i<3&&j<3;i++,j--)
		{
			if (arr[i][j]==b)
			count++;
		}
		if(count==3)
		{
			return true;
		}
		
		return false;
		
	}
	public boolean tie(char arr[][],char b){
	    for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(arr[i][j]>=49&&arr[i][j]<=59)
				{
					return false;
				}
			}
		}
		return true;
	}
}