
class Gray {

	private static int _dym = 0;
	private static int _size = 0;
	private static boolean[][] _result;

	private static void precondition() throws Exception {
		if (_dym <= 0 || _dym > 32) {
			throw new Exception("Invalid dymension.");
		}
	}

	public static void d(String msg) {
		System.out.println(msg);
	}

	private static boolean[][] reserveSize(int dym) {
		int size = (int)Math.pow(dym, 2);
		boolean[][] result = new boolean[size][];
		for (int i = 0; i < size; i++) {
			result[i] = new boolean[dym];
			for (int j = 0; j < dym; j++) {
				result[i][j] = false;
			}
		}
		return result;
	}

	private static void printResult(boolean vertical) {
		for (int i = 0; i < _size; i++) {
			for (int j = 0; j < _dym; j++) {
				System.out.print(_result[i][j] ? "1" : "0");
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

	private static boolean[][] calculateGrayCodes(int dym, boolean[][] m) {
		if (dym == 1) {
			boolean[][] a = reserveSize(1);
			boolean[0][0] = 0;
			boolean[0][1] = 1;
			return a;
		} else {
			return calculateGrayCodes(dym - 1, m);
		}
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			printHelp();
		} else {
			try {
				_dym = Integer.parseInt(args[0]);
				_size = (int)Math.pow(_dym, 2);
				precondition();
				_result = reserveSize(_dym);
				calculateGrayCodes(_dym, _result);
				printResult(true);
			} catch(Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}

