package java11;
abstract class Math {
	protected int ans;
	public void show() {
		System.out.println("ans="+ans);
	}
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
	class Compute extends Math {

		@Override
		public void add(int a, int b) {
			// TODO Auto-generated method stub
			ans = a+b;
		}

		@Override
		public void sub(int a, int b) {
			// TODO Auto-generated method stub
			ans= a-b;
		}

		@Override
		public void mul(int a, int b) {
			// TODO Auto-generated method stub
			ans = a*b;
		}

		@Override
		public void div(int a, int b) {
			// TODO Auto-generated method stub
			ans = a/b;
		}
		
	}
public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}

}
