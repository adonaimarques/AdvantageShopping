package core.utils.csv;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import core.utils.randomize.RandomGenerate;

public class WritterCSV {
	
	static RandomGenerate gerador = new RandomGenerate();
	
	@SuppressWarnings("resource")
	public void gravacaoCSV() throws IOException {
		
		String [] cabecalho = {"Username","Email","Password"};
		
	    	List<String[]> linhas = new ArrayList<>();
	        linhas.add(new String[]{"QA" + gerador.randomizer() ,"test@test.com","Tester@123"});

	        Writer writer = Files.newBufferedWriter(Paths.get("./data/dados.csv"));
	        CSVWriter csvWriter = new CSVWriter(writer);

	        csvWriter.writeNext(cabecalho);
	        csvWriter.writeAll(linhas);

	        csvWriter.flush();
	        writer.close();
	}	
}
