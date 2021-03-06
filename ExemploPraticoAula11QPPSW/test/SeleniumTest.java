/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author marcelo.soares
 */
public class SeleniumTest {
    
    static WebDriver driver = null;     
    
    private static String namePaginaPrincipal ;
    
    private static String login, paginaPrincipal;
    
    
                  
    
    @BeforeClass
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver.exe");
         
         login = "C:\\Users\\fabiano.dutra\\Desktop\\QAdegreeclasses\\ExemploPraticoAula11QPPSW\\src\\login.html";
         paginaPrincipal = "C:\\Users\\fabiano.dutra\\Desktop\\QAdegreeclasses\\ExemploPraticoAula11QPPSW\\src\\paginaPrincipal.html";
	        
        
         driver = new ChromeDriver();

        driver.get(login);
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    
    @Test
    public void testTituloPaginaLogin(){
      driver.get(login);
      String tituloExperado ="Pagina de Login"; 
        
      Assert.assertEquals(tituloExperado,driver.getTitle());
    }
    
     @Test
    public void testLogin(){
//        driver.get("C:\\Users\\marcelo.soares\\Documents\\NetBeansProjects\\QPPSW\\ExemploPraticoAula11QPPSW\\src\\login.html");
        driver.get(login);
        WebElement campoNome = driver.findElement(By.id("nome"));
         WebElement campoSenha = driver.findElement(By.id("senha"));
         WebElement submit = driver.findElement(By.id("submit"));
         campoNome.sendKeys("teste");
         campoSenha.sendKeys("123");
         submit.click();
         String codigProximaPagina =  driver.getPageSource();
         Assert.assertTrue(codigProximaPagina.contains("Bem vindo usuario teste"));
    }
    
    @Test
    public void testAlert(){
//        driver.get("C:\\Users\\marcelo.soares\\Documents\\NetBeansProjects\\QPPSW\\ExemploPraticoAula11QPPSW\\src\\login.html");
        driver.get(login);
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoSenha = driver.findElement(By.id("senha"));
         WebElement submit = driver.findElement(By.id("submit"));
         campoNome.sendKeys("usuario_invalido");
         campoSenha.sendKeys("senha_invalido");
         submit.click();
       
         Alert alert = driver.switchTo().alert();
         Assert.assertTrue(alert.getText().equals("usuario ou senha invalida"));
         alert.accept();
         
        
        
    }
    
    @AfterClass
    public static void tearDown() {
       driver.quit();
    }
    
}
