package java11;
interface Math2 {
	void show();
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void duv(int a, int b);
}
interface AdvancedMath {
	public void mod(int a, int b);
	public void fac(int a);
	public void pow(int a, int b);
}
class Compute2 implements Math2,AdvancedMath {
	
	public int ans;
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		ans=a+b;
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		ans=a-b;
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		ans=a*b;
	}

	@Override
	public void duv(int a, int b) {
		// TODO Auto-generated method stub
		ans=a/b;
	}
	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		ans=a%b;
	}

	@Override
	public void fac(int a) {
		// TODO Auto-generated method stub
		ans=1;
		for(int i=1;i<=a;i++) {
			ans*=i;
		}
	}

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		ans=(int) Math.pow(a,b);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ans="+ans);
	}
}
public class class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute2 cmp = new Compute2();
		cmp.mul(3,5);
		cmp.show();
		cmp.mod(14,5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}
