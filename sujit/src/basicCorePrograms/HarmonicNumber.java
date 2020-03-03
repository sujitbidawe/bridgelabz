package basicCorePrograms;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HarmonicNumber hn = new HarmonicNumber();
		hn.harmonic();

	}

	public void harmonic() {
		float sum = 0;
		float end = 5;
		
		for (float i = 1; i <= end; i++) {
			sum = sum + (1 / i);
			System.out.println(sum);

		}
	}

}
