package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestandoListaDeAulas {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("HashMap", 12);
		Aula a2 = new Aula("ArrayList", 27);
		Aula a3 = new Aula("SetList", 9);
		
		List<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		System.out.println("---");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println("---");
		
		//java 8 style
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}
	







}
