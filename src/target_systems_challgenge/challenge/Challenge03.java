package target_systems_challgenge.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Dia {
	int dia;
	double valor;
}

public class Challenge03 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/black/eclipse-workspace/target_systems_challgenge/src/faturamento.json"));

			StringBuilder jsonBuilder = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				jsonBuilder.append(line);
			}
			reader.close();

			String json = jsonBuilder.toString();
			json = json.replace("[", "").replace("]", "");
			String[] dias = json.split("\\},\\{");

			List<Double> valores = new ArrayList<>();
			for (String diaStr : dias) {
				diaStr = diaStr.replace("{", "").replace("}", "").replace("\"", "");
				String[] keyValuePairs = diaStr.split(",");
				double valor = 0.0;
				for (String pair : keyValuePairs) {
					String[] keyValue = pair.split(":");
					if (keyValue[0].trim().equals("valor")) {
						valor = Double.parseDouble(keyValue[1].trim());
						if (valor > 0) {
							valores.add(valor);
						}
					}
				}
			}

			double menorFaturamento = valores.stream().min(Double::compare).get();
			double maiorFaturamento = valores.stream().max(Double::compare).get();
			double mediaFaturamento = valores.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
			long diasAcimaDaMedia = valores.stream().filter(v -> v > mediaFaturamento).count();

			System.out.println("Menor faturamento: " + menorFaturamento);
			System.out.println("Maior faturamento: " + maiorFaturamento);
			System.out.println("Dias acima da média: " + diasAcimaDaMedia);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
