
class Gray {

	private static boolean[][] result;

	private static void precondition(int dym) throws Exception {
		if (dym <= 0) {
			throw new Exception("Invalid dymension.");
		}
	}

	private static void reserveSize(int dym) {
		int size = dym ^ 2;
		result = new boolean[size][];
		for (int i = 0; i < size; i++) {
			result[i] = new boolean[dym];
		}
	}

	private static void printHelp() {
		System.out.println("Recursive Gray Codes.");
		System.out.println("Usage: gray <dimension>");
	}

	private static void calculateGrayCodes(int dimension) {

	}

	public static void main(String[] args) {
		if (args.length != 1) {
			printHelp();
		} else {
			try {
				int dym = Integer.parseInt(args[0]);
				precondition(dym);
				reserveSize(dym);
				calculateGrayCodes(dym);
			} catch(Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}

