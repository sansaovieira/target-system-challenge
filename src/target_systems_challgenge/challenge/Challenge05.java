package target_systems_challgenge.challenge;

public class Challenge05 {
	public static void main(String[] args) {
		String original = "Eu acredito que agregarei bastante valor a equipe e a empresa";
		String invertida = inverterString(original);
		System.out.println("\nString Original: " + original);
		System.out.println("\nString invertida: " + invertida);
	}

	public static String inverterString(String s) {
		String invertida = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			invertida += s.charAt(i);
		}
		return invertida;
	}
}
