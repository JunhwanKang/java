package interface1;

class 컵상인 {
	public void sell() {
		System.out.println("컵 팔아요");
	}
}
class  옷상인{
	public void sell() {
		System.out.println("옷 팔아요");
	}
}

class Mart{
	컵상인 cupSeller;
	옷상인 clothSeller;
	public void doSell() {
		if(cupSeller!= null)
			cupSeller.sell();
		else if (clothSeller != null)
			clothSeller.sell();
	}
}

public class InterfaceTest3 {

}
