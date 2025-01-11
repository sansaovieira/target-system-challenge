# Project: Solving Logical Problems in Java

![Java Logo](https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg)

This project contains the resolution of five technical challenges using the Java language. The proposal includes problems involving programming logic, mathematics and data manipulation. The solutions were organized and tested to meet the requirements described.

## Solved Challenges - Example for Challenge01

### 1. Sum of Integers
**Description:**
Given the code snippet below:
```java
package target_systems_challgenge.challenge;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 13, soma = 0, k = 0;
		while (k < i) {
			k = k + 1;
			soma = soma + k;
		}
		System.out.println("A soma é: " + soma);
	}

}
