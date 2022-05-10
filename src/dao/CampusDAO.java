/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import view.CampusView;
import model.Campus;

/**
 *
 * @author Gui
 */
public class CampusDAO {

    private int id = 0;

    private Campus[] campus = new Campus[100];

    private CampusView campV = new CampusView();

    public CampusDAO() {
        this.setCampus(campV.setAleatorio1());
        this.setCampus(campV.setAleatorio2());
    }

    public void setCampus(Campus camp) {
        for (int i = 0; i < campus.length; i++) {
            if (campus[i] == null) {
                camp.setId(id);
                campus[i] = camp;
                id++;
                return;
            }
        }
    }

    public Campus getId(int auxLoc) {
        boolean aux = false;
        for (int i = 0; i < campus.length; i++) {
            if (campus[i] != null) {
                aux = true;
            }
        }
        if (aux) {
            for (int i = 0; i < campus.length; i++) {
                if (campus[i].getId() == auxLoc) {
                    return campus[i];
                }
            }
        }

        return null;
    }

    public void update(Campus campus) {
        this.campus[campus.getId()] = campus;
    }

    public Campus[] getAll() {
        return campus;
    }

    public void delete(Campus campusDelete) {
        campus[campusDelete.getId()] = null;
    }
}
