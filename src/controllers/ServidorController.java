/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.CampusDAO;
import dao.ServidorDAO;
import java.util.Scanner;
import model.Servidor;
import view.ServidorView;
import view.Gui;

/**
 *
 * @author Aluno
 */
public class ServidorController extends DefaultController{
    
    private final ServidorView servV = new ServidorView();

    public void menu(ServidorDAO servDAO, CampusDAO campusDAO) {
        System.out.println("SERVIDOR");
        opcCrud = GUI.menu();

        Servidor[] servVet = servDAO.getAll();
        switch (opcCrud) {
            case 1:
                Servidor servidor = servV.criarServ(campusDAO);
                servDAO.setServidor(servidor);
                break;
            case 2:
                servV.mostrarTodosServidores(servVet, campusDAO);
                GUI.printID();
                auxLoc = Integer.parseInt(ler.nextLine());
                Servidor servAlt = servDAO.getId(auxLoc);
                if (servAlt != null) {
                    servDAO.update(servV.modifServ(servAlt, campusDAO));
                    GUI.sucess();
                } else {
                    GUI.error();
                }
                break;
            case 3:
                servV.mostrarTodosServidores(servVet, campusDAO);
                break;
            case 4:
                servV.mostrarTodosServidores(servVet, campusDAO);
                GUI.printID();
                auxLoc = Integer.parseInt(ler.nextLine());
                Servidor servDelete = servDAO.getId(auxLoc);
                if (servDelete != null) {
                    servDAO.delete(servDelete);
                    GUI.sucess();
                } else {
                    GUI.error();
                }
                break;
        }
    }

}
