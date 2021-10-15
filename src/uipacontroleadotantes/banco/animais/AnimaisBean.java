/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipacontroleadotantes.banco.animais;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Aguinaldo/Kaue
 */
public class AnimaisBean {
    private int codAnimal;
    private String nome;
    private String especie;
    private String sexo;
    private String dataNasc;
    private String porte;
    private String castrado;
    private int codAdotante;
    private String dataAdocao;

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }

    public int getCodAdotante() {
        return codAdotante;
    }

    public void setCodAdotante(int codAdotante) {
        this.codAdotante = codAdotante;
    }

    public String getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(String dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    @Override
    public String toString() {
        return "AnimaisBean{" + "codAnimal=" + codAnimal + ", nome=" + nome + ", especie=" + especie + ", sexo=" + sexo + ", dataNasc=" + dataNasc + ", porte=" + porte + ", castrado=" + castrado + ", codAdotante=" + codAdotante + ", dataAdocao=" + dataAdocao + '}';
    }
    
}
