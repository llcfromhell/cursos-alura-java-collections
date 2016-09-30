package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Trabalhando com Cursos e Sets";
		String aula3 = "Conhecendo mais de listas";
		
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		// removendo elementos
		aulas.remove(0);
		System.out.println(aulas);
		
		// percorrendo listas
		
		//java 8 style
		aulas.forEach( aula-> System.out.println("8 style - Aula: " + aula));
		
		// java 7 and before sytle
		for (String aula : aulas) {
			System.out.println("Old School style - " + aula);
		}
		
		// acessando elementos
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
		    System.out.println("aula : " + aulas.get(i));
		}
		
		Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);     
		
	}
	
}
