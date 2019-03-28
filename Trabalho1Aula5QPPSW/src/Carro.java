/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo.soares
 */
public class Carro {
    private int codigo;
    private String modelo;
    private String marca;
    private String placa;
    private int anoFabricacao;
    private String nomeProprietario;
    private double valorTotal;
    private boolean eFinanciado;
    private double valorFinanciamento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean iseFinanciado() {
        return eFinanciado;
    }

    public void seteFinanciado(boolean eFinanciado) {
        this.eFinanciado = eFinanciado;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(double valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }
    
    
    
    
    
    
}
