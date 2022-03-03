package core.utils.setup;

import java.io.IOException;

import org.junit.BeforeClass;

import core.utils.csv.WritterCSV;

public class JunitCustomTests {
	
	WritterCSV csv = new WritterCSV();
	
	@BeforeClass
	public void WritterInit() throws IOException {
		csv.gravacaoCSV();
	}
}
