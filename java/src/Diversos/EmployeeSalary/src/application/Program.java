package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import enitites.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Caminho do arquivo
		String path="in.txt";
		
		//Entrada do salário
		System.out.print("Enter Salary: ");
		Double salary = sc.nextDouble();
		

		//Leitura do arquivo
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> listEmployee = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				listEmployee.add(new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			System.out.println("Email of people whose salary is more than " + salary);
			
			Comparator<String> comp = (email1, email2) -> email1.toUpperCase().compareTo(email2.toUpperCase());
			
			//Mostrando e-mails de funcionários com salário maior que o Salário de entrada
			 List<String> emailEmployee = listEmployee.stream()
			.filter(e -> e.getSalary() > salary)
			.map(e -> e.getEmail()).sorted().collect(Collectors.toList());
			 
			 emailEmployee.forEach(System.out::println);
			 
			 //Realizando a soma dos salários cujo nome inicia com a letra 'M'
			 Double sum = listEmployee.stream()
					 .filter(e -> e.getName().startsWith("M"))
					 .map(e -> e.getSalary())
					 .reduce(0.0, (x,y) -> x+y);
			 
			 System.out.println("Sum os salary of people whose name starts with 'M': " + sum);
			
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
		
		
		

	}

}
