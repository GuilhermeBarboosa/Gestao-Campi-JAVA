/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Atividade {

    private int id;
    private String descricao;
    private Servidor Servidor;
    private double horasSemanais;
    private LocalDate dtInicio;
    private LocalDate dtTermino;
    private LocalDate dtCriacao;
    private LocalDate dtModificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servidor getServidor() {
        return Servidor;
    }

    public void setServidor(Servidor idServidor) {
        this.Servidor = idServidor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(LocalDate dtTermino) {
        this.dtTermino = dtTermino;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public LocalDate getDtModificacao() {
        return dtModificacao;
    }

    public void setDtModificacao(LocalDate dtModificacao) {
        this.dtModificacao = dtModificacao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String aux = "";
        aux += "ID: " + this.getId() + "\n";
        aux += "Descrição: " + this.getDescricao() + "\n";
        if (this.Servidor != null) {
            aux += "Servidor: " + Servidor.getNome() + "\n";
        }
        aux += "Horas semanais: " + this.getHorasSemanais() + "\n";
        aux += "Data de inicio: " + this.getDtInicio() + "\n";
        aux += "Data de termino: " + this.getDtTermino() + "\n";
        aux += "Data de criacao: " + this.getDtCriacao().format(formatter) + "\n";
        if (this.getDtModificacao() != null) {
            aux += "Data de termino: " + this.getDtModificacao().format(formatter) + "\n";
        }
        aux += "\n\n";
        return aux;
    }

}
