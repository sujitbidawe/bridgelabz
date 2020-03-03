package basicCorePrograms;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoinFlip CF = new CoinFlip();
		CF.flip();
	}

	public void flip() {

		double num = Math.random();
		if (num <= 0.5) {
			System.out.println("coin flip showed heads!!");
		} else {
			System.out.println("coin flip showed tails!!");
		}
	}

}
