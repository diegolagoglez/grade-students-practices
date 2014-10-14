
class Gray {

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
			calculateGrayCodes(Integer.parseInt(args[0]));
		}
	}
}

