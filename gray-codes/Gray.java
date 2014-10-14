
class Gray {

	private static int _dym = 0;
	private static int _size = 0;
	private static boolean[][] result;

	private static void precondition() throws Exception {
		if (_dym <= 0) {
			throw new Exception("Invalid _dymension.");
		}
	}

	public static void d(String msg) {
		System.out.println(msg);
	}

	private static void reserveSize() {
		result = new boolean[_size][];
		for (int i = 0; i < _size; i++) {
			result[i] = new boolean[_dym];
			for (int j = 0; j < _dym; j++) {
				result[i][j] = false;
			}
		}
	}

	private static void printResult(boolean vertical) {
		for (int i = 0; i < _size; i++) {
			for (int j = 0; j < _dym; j++) {
				System.out.print(result[i][j] ? "1" : "0");
			}
			if (vertical) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}

	private static void printHelp() {
		System.out.println("Recursive Gray Codes.");
		System.out.println("Usage: gray <dimension>");
	}

	private static void calculateGrayCodes() {

	}

	public static void main(String[] args) {
		if (args.length != 1) {
			printHelp();
		} else {
			try {
				_dym = Integer.parseInt(args[0]);
				_size = (int)Math.pow(_dym, 2);
				precondition();
				reserveSize();
				calculateGrayCodes();
				printResult(true);
			} catch(Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}

