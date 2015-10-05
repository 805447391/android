package pkg0;

public class s115 {
	public static int digui(int x){
		if(x==1)
			return 1;
		if(x%2==0)
			return digui(x/2);
		else
			return digui(x/2)+1;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digui(9));

	}

}
