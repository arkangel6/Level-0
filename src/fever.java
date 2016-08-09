
public class fever {
	public static void main(String[] args) {
		int a = 10;
		for (int i = 0; i < a; i++) {

			for (int k = 0; k < 3; k++) {
				speak("Baby");
			}
			if (i % 2 == 0) {
				for (int j = 0; j < 1; j++) {
					speak("oh");
				}
			} else if (i % 2 == 1) {
				for (int j2 = 0; j2 < 1; j2++) {
					speak("no");
				}
			}
			for (int h = 0; h < args.length; h++) {
				speak("I thought you'd always be mine.");
			}
		}
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
