/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.CampusDAO;
import java.util.Scanner;
import model.Campus;
import view.CampusView;
import view.Gui;

/**
 *
 * @author Aluno
 */
public class CampusController extends DefaultController{ 
    
    private final Gui GUI = new Gui();
    private final CampusView campusView = new CampusView();

    public void menu(CampusDAO campusDAO) {
        System.out.println("CAMPUS");
        opcCrud = GUI.menu();
        Campus[] campusVet = campusDAO.getAll();
        switch (opcCrud) {
            case 1:
                Campus campus = campusView.criarCampus();
                campusDAO.setCampus(campus);
                break;
            case 2:
                campusView.mostrarTodosCampos(campusVet);
                GUI.printID();
                auxLoc = Integer.parseInt(ler.nextLine());
                Campus CampusAlt = campusDAO.getId(auxLoc);
                if (CampusAlt != null) {
                    campusDAO.update(campusView.modifCampus(CampusAlt));
                    GUI.sucess();
                } else {
                    GUI.error();
                }
                break;
            case 3:
                campusView.mostrarTodosCampos(campusVet);
                break;
            case 4:
                campusView.mostrarTodosCampos(campusVet);
                GUI.printID();
                auxLoc = Integer.parseInt(ler.nextLine());
                Campus campusDelete = campusDAO.getId(auxLoc);
                if (campusDelete != null) {
                    campusDAO.delete(campusDelete);
                    GUI.sucess();
                } else {
                    GUI.error();
                }
                break;
        }
    }
}
