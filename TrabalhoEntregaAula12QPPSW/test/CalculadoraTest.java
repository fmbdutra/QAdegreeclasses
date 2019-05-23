/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author marcelo.soares
 */
public class CalculadoraTest {
    
    static WebDriver driver = null;     
           
    private static String calculadora;
//       
//    WebElement operadorA = driver.findElement(By.id("a"));
//    WebElement operadorB = driver.findElement(By.id("b"));
//    
//    WebElement somarBotao = driver.findElement(By.id("botao_somar"));
//    WebElement multiplicarBotao = driver.findElement(By.id("botao_multiplicar"));
//    
//    WebElement resultadoLabel = driver.findElement(By.id("resultado"));
    
    public WebElementos elemento;
    
    String esperado;
    String resultado = "";                  
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", 
	                "C:\\Users\\fabiano.dutra\\Desktop\\QAdegreeclasses\\TrabalhoEntregaAula12QPPSW\\src\\chromedriver.exe");
        calculadora = "C:\\Users\\fabiano.dutra\\Desktop\\QAdegreeclasses\\TrabalhoEntregaAula12QPPSW\\src\\exercicio1.html";         
        driver = new ChromeDriver();
    } 
    
    @Before
    public void setElementos(){      
        driver.get(calculadora);        
        this.elemento = new WebElementos(driver);
    }
    
    //Exercicio 1
    @Test
    public void testeTitulo(){
        driver.get(calculadora);
        String tituloExperado = "Calculadora"; 
        
        Assert.assertEquals(tituloExperado,driver.getTitle());
    }
    
    //Exercício 2
    @Test
    public void testeSomaOk(){
        
        elemento.operadorA().sendKeys("5");
        elemento.operadorB().sendKeys("10");
        elemento.somarBotao().click();
        
        esperado = "Resultado da soma: 15";
        resultado = elemento.resultadoLabel().getText();
                
        Assert.assertEquals(esperado, resultado);       
    }
    
    @Test
    public void testeSomaErro(){        
        elemento.operadorA().sendKeys("9");
        elemento.operadorB().sendKeys("10");
        
        elemento.somarBotao().click();
        
        esperado = "Resultado da soma: 99";
        resultado = elemento.resultadoLabel().getText();
                
        Assert.assertNotSame(esperado, resultado);        
    }
    
    //Exercicio 3
    @Test
    public void testeMultiplicacaoOk(){
               
        elemento.operadorA().sendKeys("7");
        elemento.operadorB().sendKeys("5");
        
        elemento.multiplicarBotao().click();
        
        esperado = "Resultado da multiplicacao: 35";
        resultado = elemento.resultadoLabel().getText();
                
        Assert.assertEquals(esperado, resultado);       
    }
    
    @Test
    public void testeMultiplicacaoErro(){        
        elemento.operadorA().sendKeys("2");
        elemento.operadorB().sendKeys("7");
        
        elemento.multiplicarBotao().click();
        
        esperado = "Resultado da multiplicacao: 10";
        resultado = elemento.resultadoLabel().getText();
                
        Assert.assertNotSame(esperado, resultado);        
    }
    
    //Exercício 4 - Multiplicaçao
    @Test
    public void testeSemPreencherOperadoresMultiplicacao(){
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);     
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherSomenteOperadorAMultiplicacao(){
        
        elemento.operadorA().sendKeys("88");
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);    
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherSomenteOperadorBMultiplicacao(){
        
        elemento.operadorB().sendKeys("13");
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);    
        
        alerta.accept();
    }
    
    //Exercício 4 - Soma
    @Test
    public void testeSemPreencherOperadoresSoma(){
        elemento.somarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);   
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherSomenteOperadorASoma(){
        
        elemento.operadorA().sendKeys("91");
        elemento.somarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado); 
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherSomenteOperadorBSoma(){
        
        elemento.operadorB().sendKeys("55");
        elemento.somarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);  
        
        alerta.accept();
    }
    //Exercício 5 - Geral
    @Test
    public void testePrenchimentoDoisOperadoresDiferenteDeNumeros(){
        
        elemento.operadorA().sendKeys("fabiano");
        elemento.operadorB().sendKeys("12ab5");
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "digite somente números";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);

        alerta.accept();        
    }
    
    
    //Exercício 5 - Multiplicação      
    @Test
    public void testePreencherDiferenteDeNumeroOperadorAMultiplicacao(){
        
        elemento.operadorA().sendKeys("fabiano");
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        
        resultado = alerta.getText();        
        Assert.assertEquals(esperado, resultado);
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherDiferenteDeNumeroOperadorBMultiplicacao(){
        
        elemento.operadorB().sendKeys("13m@rc&l0");
        elemento.multiplicarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);    
        
        alerta.accept();
    }
    
    //Exercício 5 - Soma   
    @Test
    public void testePreencherDiferenteDeNumeroOperadorASoma(){
        
        elemento.operadorA().sendKeys("234mvj");
        elemento.somarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);      
        
        alerta.accept();
    }
    
    @Test
    public void testePreencherDiferenteDeNumeroOperadorBSoma(){
        
        elemento.operadorB().sendKeys("55lalal55and");
        elemento.somarBotao().click();
        
        Alert alerta = driver.switchTo().alert();
        
        esperado = "preencha todos os campos";
        resultado = alerta.getText();
        
        Assert.assertEquals(esperado, resultado);
        
        alerta.accept();
            
    }
    
//    @After
//    public void fim(){
//        driver.close();
//    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    
}
