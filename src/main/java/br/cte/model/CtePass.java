/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cte.model;

/**
 *
 * @author DerliRiffel
 */
public class CtePass {
    private String xPass;
    private String xDest;

    public String getXPass() {
        return xPass;
    }

    public String getXDest() {
        return xDest;
    }


    /**
     * Sigla ou c�digo interno da
     * Filial/Porto/Esta��o/Aeroporto de
     * Passagem
     * @param xPass
     */
    public void setXPass(String xPass) {
        this.xPass = xPass;
    }

    /**
     * Sigla ou c�digo interno da
     * Filial/Porto/Esta��o/Aeroporto de
     * Destino
     * @param xDest
     */
    public void setXDest(String xDest) {
        this.xDest = xDest;
    }

}
