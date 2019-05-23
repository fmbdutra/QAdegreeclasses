
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiano.dutra
 */
public class WebElementos {
    
    WebDriver driver;
    
    public WebElementos(WebDriver driver){
        this.driver = driver;
    }    
    
    public WebElement operadorA(){
        return this.driver.findElement(By.id("a"));
    }
    
    public WebElement operadorB(){
        return this.driver.findElement(By.id("b"));
    }
    
    public WebElement somarBotao(){
        return this.driver.findElement(By.id("botao_somar"));
    }
    
    public WebElement multiplicarBotao(){
        return this.driver.findElement(By.id("botao_multiplicar"));
    }
    
    public WebElement resultadoLabel(){
        return this.driver.findElement(By.id("resultado"));
    }  
    
  
    
}
