/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopraticoaula6qppsw;

/**
 *
 * @author fabiano.dutra
 */
public class Boleto {
    private int idBoleto;
    private String sacado;
    private float valor;

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int id) {
        this.idBoleto = id;
    }

    public String getSacado() {
        return sacado;
    }

    public void setSacado(String sacado) {
        this.sacado = sacado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
