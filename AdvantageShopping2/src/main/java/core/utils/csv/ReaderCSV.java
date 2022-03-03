package core.utils.csv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class ReaderCSV {
	
	private static String username;
	private static String email;
	private static String password;
	
	
	public void leitura() throws IOException , CsvException {
		Reader leitor = Files.newBufferedReader(Paths.get("./data/dados.csv"));
		CSVReader leitorCSV = new CSVReaderBuilder(leitor).withSkipLines(1).build();
		
		List<String[]> users = leitorCSV.readAll();
	        for (String[] user : users) {
	           username = user[0];
	           email = user[1];
	           password = user[2];
		}
	    
	}
	
	

	public  String getUsername() {
		return username;
	}

	public  String getEmail() {
		return email;
	}

	public  String getPassword() {
		return password;
	}   
	
	
		

}
