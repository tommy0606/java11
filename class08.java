package java11;
interface iAaa {
	public void show();
}
class Cbbb {
	public int num = 10;
	
	public void set(int n) {
		num = n;
	}
}
class  Cccc extends Cbbb implements iAaa {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("num="+num);
	}
	
}
public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cccc cc = new Cccc();
		cc.set(5);
		cc.show();
	}

}
