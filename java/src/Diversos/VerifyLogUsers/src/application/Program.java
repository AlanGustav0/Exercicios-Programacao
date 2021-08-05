package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
	
		String path = "in.txt";
		
		System.out.print("Wait! Checking log users...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			Set<LogEntry> setUsers = new HashSet<>();
			
			while(line != null) {
			
				String[] fields = line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				setUsers.add(new LogEntry(userName,moment));
				line = br.readLine();
				
			}
			
			System.out.println("Total users found: " + setUsers.size());
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
