/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.Campus;
import model.Servidor;
import view.ServidorView;

/**
 *
 * @author Aluno
 */
public class ServidorDAO {

    private int id = 0;
    private Servidor[] servidores = new Servidor[100];

    private ServidorView servV = new ServidorView();

    public ServidorDAO() {       
        this.setServidor(servV.setAleatorio1());       
        this.setServidor(servV.setAleatorio2());
        this.setServidor(servV.setAleatorio3());
        this.setServidor(servV.setAleatorio4());
    }

    public void setServidor(Servidor serv) {
        for (int i = 0; i < servidores.length; i++) {
            if (servidores[i] == null) {
                serv.setId(id);
                servidores[i] = serv;
                id++;
                return;
            }
        }
    }

    public Servidor getId(int auxLoc) {
        boolean aux = false;
        for (int i = 0; i < servidores.length; i++) {
            if (servidores[i] != null) {
                aux = true;
            }
        }
        if (aux) {
            for (int i = 0; i < servidores.length; i++) {
                if (servidores[i].getId() == auxLoc) {
                    return servidores[i];
                }
            }
        }
        return null;
    }

    public void update(Servidor servidor) {
        this.servidores[servidor.getId()] = servidor;
    }

    public Servidor getById(int id){
        return servidores[id];
    }
    
    public Servidor[] getAll() {
        return servidores;
    }

    public void delete(Servidor servDelete) {
        servidores[servDelete.getId()] = null;
    }
    
    public void aumentarHoras(int idServidor, double horas){
        double aux = this.servidores[idServidor].getHorasTotais() + horas;
        this.servidores[idServidor].setHorasTotais(aux);
    }
    
    public Servidor login(String login, String senha) {
        for (Servidor servidor : servidores) {
            if(servidor != null) {
                if(servidor.getLogin().equals(login) && servidor.getSenha().equals(senha)) {
                    return servidor;
                }
            }
        }
        return null;
    }

    public void removerHoras(int idServidor, double horas) {
        double aux = this.servidores[idServidor].getHorasTotais() - horas;
        this.servidores[idServidor].setHorasTotais(aux);
    }

}
