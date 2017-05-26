/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mdfe.model;

import java.util.ArrayList;

/**
 *
 * @author Derli
 */
public class MdfeRodo {

    private String RNTRC;
    private String CIOT;
    private MdfeVeicTracao veicTracao;
    private ArrayList<MdfeVeicReboque> veicReboque;
    private ArrayList<MdfeValePed> valePed;

    public String getRNTRC() {
        return RNTRC;
    }

    public void setRNTRC(String RNTRC) {
        this.RNTRC = RNTRC;
    }

    public String getCIOT() {
        return CIOT;
    }

    public void setCIOT(String CIOT) {
        this.CIOT = CIOT;
    }

    public MdfeVeicTracao getVeicTracao() {
        return veicTracao;
    }

    public void setVeicTracao(MdfeVeicTracao veicTracao) {
        this.veicTracao = veicTracao;
    }

    public ArrayList<MdfeVeicReboque> getVeicReboque() {
        return veicReboque;
    }

    public void setVeicReboque(ArrayList<MdfeVeicReboque> veicReboque) {
        this.veicReboque = veicReboque;
    }

    public ArrayList<MdfeValePed> getValePed() {
        return valePed;
    }

    public void setValePed(ArrayList<MdfeValePed> valePed) {
        this.valePed = valePed;
    }

}