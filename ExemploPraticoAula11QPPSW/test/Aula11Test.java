
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiano.dutra
 */
public class Aula11Test {
    
    static WebDriver driver = null;    
    private static String pagina;
    
        
    @Test
    public void TestTituloDaPagina(){
        driver.get(pagina);        
        
        String titulo;
        titulo = driver.getTitle();
        
        Assert.assertEquals("Aula 11 - Teste Selenium", titulo);        
    }
    
    @Test
    public void TestTextoDaPaginaTest(){      
        driver.get(pagina);
        
        Assert.assertTrue(driver.getPageSource().contains("Este é um exercício de Selenium"));
    }
    
    @Test
    public void TestValorDoBotao(){
        String textoBotao = driver.findElement(By.id("btn")).getAttribute("value");
                
        Assert.assertEquals("Clique Aqui", textoBotao);
    }
    
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        
        pagina = "C:\\Users\\fabiano.dutra\\Desktop\\QAdegreeclasses\\ExemploPraticoAula11QPPSW\\src\\exercicio_aula11.html";
    
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
