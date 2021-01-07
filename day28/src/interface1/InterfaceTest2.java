package interface1;

interface Fighter{
	public void attack();
}
class Swordman implements Fighter{
	@Override
	public void attack() {
		System.out.println("검으로 공격합니다.");
	}
}
class Spearman implements Fighter{
	@Override
	public void attack() {
		System.out.println("창으로 공격합니다.");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		Fighter fighter = new Spearman();
		fighter.attack();		
	}
}
