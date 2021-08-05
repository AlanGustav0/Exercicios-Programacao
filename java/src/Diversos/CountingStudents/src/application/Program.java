package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Set<Students> setCourseA = new HashSet<>();
		Set<Students> setCourseB = new HashSet<>();
		Set<Students> setCourseC = new HashSet<>();
		
		int qtdStudents = 0;
		
		
		System.out.print("How many students of course A? ");
		qtdStudents = sc.nextInt();
		for(int i=0;i<qtdStudents;i++) {
			setCourseA.add(new Students(sc.nextInt()));
		}
		System.out.println();
		
		System.out.print("How many students of course B? ");
		qtdStudents= sc.nextInt();
		for(int i=0;i<qtdStudents;i++) {
			setCourseB.add(new Students(sc.nextInt()));
		}
		System.out.println();
		
		System.out.print("How many students of course C? ");
		qtdStudents = sc.nextInt();
		for(int i=0;i<qtdStudents;i++) {
			setCourseC.add(new Students(sc.nextInt()));
		}
		System.out.println();
		
		Set<Students> totalStudents = new HashSet<>(setCourseA);
		totalStudents.addAll(setCourseB);
		totalStudents.addAll(setCourseC);
		
		System.out.println("Total students: " + totalStudents.size());
		
		
		
		sc.close();

	}

}
