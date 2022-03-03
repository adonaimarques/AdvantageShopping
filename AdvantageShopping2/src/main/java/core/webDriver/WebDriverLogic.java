package core.webDriver;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverLogic {
	
	private static WebDriver driver ;
	
	public void abrirnavegador(String url,String navegador,String descricaoPasso) {
		try {
			if (navegador == "chrome") {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				
			}else if (navegador == "firefox") {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);	
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				
			}else if (navegador == "edge") {
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			}else {
				System.out.println("Opcao Invalida escolha chrome, firefox ou edge");
			}
					
		} catch (Exception e) {
			System.out.println(" --------- erro ao abrir navegador" + "---" + e.getMessage());	
		}			
	
	}
	
	public void clicar (By elemento,String descricaoPasso) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("------Erro ao " + descricaoPasso +"---" + e.getMessage());
		}	
	}
	
	public void submit(By elemento, String descricaoPasso) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("------Erro " + descricaoPasso+"---" + e.getMessage());
		}	
	}
	
	public void preencher(By elemento, String texto, String descricaoPasso) {
		try {
			
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("------Erro ao " + descricaoPasso + "---" + e.getMessage());
		}	
	}
	
	public String pegarTexto (By elemento) {
		String texto = driver.findElement(elemento).getText();
		return texto;
	}
	
	public void localizarElemento (By Elemento,String descricaoPasso) {
		try {
			driver.findElement(Elemento);
		} catch (Exception e) {
			System.out.println("------Erro ao localizar Elemento " +descricaoPasso + "---" + e.getMessage());
		}	
	}
		
	public void pausa (int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("------Erro ao fechar ao pausar " + "---" + e.getMessage());
		}
	}
	
	public void screenShot(String nome) throws Exception{
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./Evidencias/" + nome + ".png");
        FileUtils.copyFile(SrcFile, DestFile);
	}  
	
	public void validarTexto (By elemento,String textoEsperado, String descricaoPasso) {
		try {
			String textoElemento = driver.findElement(elemento).getText();
	        assertEquals(textoEsperado, textoElemento);
		} catch (Exception e) {
			System.out.println("------Erro ao validar texto " +descricaoPasso + "---" + e.getMessage());
		}	
	}
	
	public void fecharNavegador () {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("------Erro ao fechar Navegador");
		}
	}
}
